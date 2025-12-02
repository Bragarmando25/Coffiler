package coffie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.antlr.v4.runtime.Token;

public class SemanticAnalyzer extends CoffieLangBaseVisitor<String> {

    private final SymbolTable table = new SymbolTable();
    public final List<String> errors = new ArrayList<>(); 

    private void logError(Token token, String msg) {
        int line = (token != null) ? token.getLine() : 0;
        errors.add("[ERRO SEMANTICO] Linha " + line + ": " + msg);
    }
    
    private boolean isNumeric(String type) {
        if (type == null) return false;
        return type.equals("int") || type.equals("float") || type.equals("double") || type.endsWith("*");
    }

    @Override
    public String visitProg(CoffieLangParser.ProgContext ctx) {
        visitChildren(ctx);
        return null;
    }

    @Override
    public String visitStructDef(CoffieLangParser.StructDefContext ctx) {
        String name = ctx.ID().getText();
        Map<String, String> fields = new HashMap<>();
        for(CoffieLangParser.FieldDeclContext fd : ctx.fieldDecl()) {
            fields.put(fd.ID().getText(), visit(fd.type()));
        }
        table.declareStruct(name, fields);
        return null;
    }

    @Override
    public String visitMethodDef(CoffieLangParser.MethodDefContext ctx) {
        String name = ctx.ID().getText();
        String retType = visit(ctx.type());
        List<String> params = new ArrayList<>();
        
        if (ctx.params() != null) {
            for(CoffieLangParser.ParamContext p : ctx.params().param()) {
                params.add(visit(p.type()));
            }
        }

        if (!table.declareFunc(name, retType, params)) {
            logError(ctx.ID().getSymbol(), "Funcao '" + name + "' ja foi declarada.");
        }

        table.enterScope(); 
        
        if (ctx.params() != null) {
            for (CoffieLangParser.ParamContext p : ctx.params().param()) {
                String pName = p.ID().getText();
                String pType = visit(p.type());
                table.declareVar(pName, pType, true); 
            }
        }
        
        visit(ctx.block());
        table.exitScope();
        return null;
    }

    @Override
    public String visitVarDecl(CoffieLangParser.VarDeclContext ctx) {
        String name = ctx.ID().getText();
        String type = visit(ctx.type());
        boolean initialized = (ctx.ASSIGN() != null); 

        // Se for um array (tem [ ]), consideramos inicializado (alocação estática simples)
        // Isso evita falsos positivos em buffers como 'int buffer[20];'
        if (ctx.LB_ARR() != null) {
            initialized = true; 
        }

        if (table.isGlobalScope()) initialized = true; 

        if (ctx.expr() != null) {
            String exprType = visit(ctx.expr());
            if (exprType != null && !checkType(type, exprType)) {
                logError(ctx.ID().getSymbol(), "Tipo incompativel na inicializacao de '" + name + "'. Esperado: " + type + ", Encontrado: " + exprType);
            }
        }

        if (!table.declareVar(name, type, initialized)) {
            logError(ctx.ID().getSymbol(), "Variavel '" + name + "' redeclarada neste escopo.");
        }
        return type;
    }

    @Override
    public String visitAssignment(CoffieLangParser.AssignmentContext ctx) {
        String varName;
        String expectedType = "unknown";

        if (ctx.atom().MULT() != null) {
             varName = ctx.atom().atom().getText(); 
             SymbolTable.Symbol sym = table.lookup(varName);
             if (sym == null) {
                 logError(ctx.getStart(), "Variavel ponteiro nao declarada: " + varName);
                 return null;
             }
             if (!sym.type.endsWith("*")) {
                 logError(ctx.getStart(), "Tentativa de desreferenciar variavel que nao e ponteiro: " + varName);
             }
             expectedType = sym.type.replace("*", "");
             sym.isInitialized = true; 
        }
        else if (ctx.atom().DOT() != null) {
            varName = ctx.atom().ID(0).getText(); 
            String fieldName = ctx.atom().ID(1).getText(); 
            
            SymbolTable.Symbol sym = table.lookup(varName);
            if (sym == null) {
                logError(ctx.getStart(), "Struct/Union nao declarada: " + varName);
                return null;
            }
            
            expectedType = "int"; 
            if (sym.structFields != null && sym.structFields.containsKey(fieldName)) {
                expectedType = sym.structFields.get(fieldName);
            }
            
            sym.isInitialized = true;
        }
        else if (ctx.atom().ID() != null && !ctx.atom().ID().isEmpty()) {
            varName = ctx.atom().ID(0).getText();
            SymbolTable.Symbol sym = table.lookup(varName);
            if (sym == null) {
                logError(ctx.getStart(), "Variavel nao declarada: " + varName);
                return null;
            }
            expectedType = sym.type;
            sym.isInitialized = true;
        } 
        else {
            varName = ctx.atom().getText();
            expectedType = "unknown";
        }

        String rhsType = visit(ctx.expr());
        
        if (rhsType != null && !expectedType.equals("unknown") && !checkType(expectedType, rhsType)) {
             logError(ctx.getStart(), "Atribuicao incompativel para '" + varName + "'. Esperado: " + expectedType + ", Recebido: " + rhsType);
        }
        return expectedType;
    }

    @Override
    public String visitScanStmt(CoffieLangParser.ScanStmtContext ctx) {
        if (ctx.AND_ADDR() != null) {
            String varName = ctx.atom().getText(); 
            SymbolTable.Symbol sym = table.lookup(varName);
            if (sym != null) {
                sym.isInitialized = true; 
            }
        }
        return null;
    }

    // --- NOVA CORREÇÃO: Suporte a GETS ---
    @Override
    public String visitGetsStmt(CoffieLangParser.GetsStmtContext ctx) {
        String name = ctx.ID().getText();
        SymbolTable.Symbol sym = table.lookup(name);
        if (sym == null) {
            logError(ctx.ID().getSymbol(), "Variavel nao declarada para gets: " + name);
        } else {
            // Marca como inicializada pois gets vai escrever nela
            sym.isInitialized = true; 
        }
        return null;
    }
    // -------------------------------------

    @Override
    public String visitAtom(CoffieLangParser.AtomContext ctx) {
        if (ctx.INT_LITERAL() != null) return "int";
        if (ctx.FLOAT_LITERAL() != null) return "float";
        if (ctx.STRING_LITERAL() != null) return "string";
        if (ctx.BOOL_LITERAL() != null) return "int"; 
        if (ctx.CHAR_LITERAL() != null) return "char";

        if (ctx.AND_ADDR() != null) {
            String varName;
            if (ctx.atom().DOT() != null) varName = ctx.atom().ID(0).getText(); 
            else varName = ctx.atom().getText();
            
            SymbolTable.Symbol sym = table.lookup(varName);
            if (sym != null) {
                return sym.type + "*"; 
            }
            return "unknown";
        }
        
        if (ctx.MULT() != null) {
            String ptrType = visit(ctx.atom());
            if (ptrType != null && ptrType.endsWith("*")) {
                return ptrType.substring(0, ptrType.length() - 1);
            }
            return "int"; 
        }

        if (ctx.ID() != null && !ctx.ID().isEmpty()) {
            String name = ctx.ID(0).getText();
            SymbolTable.Symbol sym = table.lookup(name);

            if (ctx.LP() != null && ctx.LB_ARR() == null) {
                if (sym == null) {
                    logError(ctx.getStart(), "Funcao nao declarada: " + name);
                    return "void";
                }
                return sym.type; 
            }

            if (sym == null) {
                logError(ctx.getStart(), "Variavel nao declarada: " + name);
                return "unknown";
            }
            
            if (!sym.isInitialized && !sym.isFunction && !sym.isStructDef) {
                 logError(ctx.getStart(), "[AVISO] Variavel '" + name + "' pode estar sendo usada sem inicializacao.");
            }
            
            if (ctx.DOT() != null) {
                 String fieldName = ctx.ID(1).getText();
                 if (sym.structFields != null && sym.structFields.containsKey(fieldName)) {
                     return sym.structFields.get(fieldName);
                 }
                 return "int"; 
            }

            return sym.type;
        }
        
        if (ctx.expr() != null) return visit(ctx.expr()); 
        
        return "unknown";
    }

    @Override
    public String visitExprAddSub(CoffieLangParser.ExprAddSubContext ctx) {
        String t1 = visit(ctx.expr(0));
        String t2 = visit(ctx.expr(1));
        if (isNumeric(t1) && isNumeric(t2)) {
            if (t1.endsWith("*")) return t1;
            if (t2.endsWith("*")) return t2;
            return (t1.equals("float") || t2.equals("float")) ? "float" : "int";
        }
        logError(ctx.getStart(), "Operacao aritmetica invalida entre " + t1 + " e " + t2);
        return "unknown";
    }

    @Override
    public String visitExprMultDiv(CoffieLangParser.ExprMultDivContext ctx) {
        String t1 = visit(ctx.expr(0));
        String t2 = visit(ctx.expr(1));
        if (isNumeric(t1) && isNumeric(t2)) {
            return (t1.equals("float") || t2.equals("float")) ? "float" : "int";
        }
        return "int";
    }

    @Override
    public String visitType(CoffieLangParser.TypeContext ctx) {
        return ctx.getText();
    }
    
    private boolean checkType(String expected, String actual) {
        if (expected.equals(actual)) return true;
        if (isNumeric(expected) && isNumeric(actual)) return true; 
        if (expected.contains("char") && actual.equals("string")) return true;
        if (expected.endsWith("*") && actual.equals("int")) return true; 
        
        return false;
    }
    
    @Override public String visitBlock(CoffieLangParser.BlockContext ctx) { 
        visitChildren(ctx); return null; 
    }
}