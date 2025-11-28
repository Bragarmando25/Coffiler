package coffie;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

public class SemanticAnalyzer extends CoffieLangBaseVisitor<String> {

    private final SymbolTable table = new SymbolTable();

    @Override
    public String visitProg(CoffieLangParser.ProgContext ctx) {
        for (CoffieLangParser.ClassDefContext classDef : ctx.classDef()) {
            visit(classDef);
        }
        return null;
    }

    @Override
    public String visitClassDef(CoffieLangParser.ClassDefContext ctx) {
        for (CoffieLangParser.ClassBodyContext body : ctx.classBody()) {
            visit(body);
        }
        return null;
    }

    @Override
    public String visitMainMethod(CoffieLangParser.MainMethodContext ctx) {
        table.enterScope();
        visit(ctx.block());
        table.exitScope();
        return null;
    }

    @Override
    public String visitMethodDef(CoffieLangParser.MethodDefContext ctx) {
        String methodName = ctx.ID().getText();
        String returnType = visit(ctx.type());
        
        try {
            table.declareFunc(methodName, returnType, java.util.Collections.emptyList());
        } catch (RuntimeException e) {
            error(e.getMessage(), ctx.ID().getSymbol());
        }

        table.enterScope();
        visit(ctx.block());
        table.exitScope();
        return null;
    }

    @Override
    public String visitBlock(CoffieLangParser.BlockContext ctx) {
        for (CoffieLangParser.StatementContext stmt : ctx.statement()) {
            visit(stmt);
        }
        return null;
    }

    @Override
    public String visitStmtVarDecl(CoffieLangParser.StmtVarDeclContext ctx) {
        visit(ctx.varDecl());
        return null;
    }

    @Override
    public String visitVarDecl(CoffieLangParser.VarDeclContext ctx) {
        String type = visit(ctx.type());
        String name = ctx.ID().getText();

        try {
            table.declareVar(name, type);
        } catch (RuntimeException e) {
            error(e.getMessage(), ctx.ID().getSymbol());
        }

        if (ctx.expr() != null) {
            String exprType = visit(ctx.expr());
            checkTypeCompatibility(type, exprType, ctx.ASSIGN().getSymbol());
            table.initialize(name);
        }
        return null;
    }

    @Override
    public String visitStmtAssign(CoffieLangParser.StmtAssignContext ctx) {
        visit(ctx.assignment());
        return null;
    }

    @Override
    public String visitAssignment(CoffieLangParser.AssignmentContext ctx) {
        String name = ctx.ID(0).getText();
        SymbolTable.Symbol sym = table.lookup(name);
        
        if (sym == null) {
            error("Variável '" + name + "' não declarada.", ctx.ID(0).getSymbol());
            return null;
        }

        String exprType = visit(ctx.expr());
        
        // Só valida tipo se for atribuição simples (não obj.prop)
        if (ctx.ID().size() == 1) {
             checkTypeCompatibility(sym.type, exprType, ctx.ASSIGN().getSymbol());
        }
        
        table.initialize(name);
        return null;
    }

    @Override
    public String visitStmtCall(CoffieLangParser.StmtCallContext ctx) {
        visit(ctx.callStmt());
        return null;
    }

    @Override
    public String visitCallStmt(CoffieLangParser.CallStmtContext ctx) {
        String name = ctx.ID(0).getText();
        
        if (ctx.ID().size() > 1) {
            // obj.metodo()
            SymbolTable.Symbol obj = table.lookup(name);
            if (obj == null) {
                error("Objeto '" + name + "' não declarado.", ctx.ID(0).getSymbol());
            }
        }
        
        if (ctx.args() != null) {
            for (CoffieLangParser.ExprContext arg : ctx.args().expr()) {
                visit(arg);
            }
        }
        return null;
    }

    @Override
    public String visitStmtPrint(CoffieLangParser.StmtPrintContext ctx) {
        visit(ctx.printStmt());
        return null;
    }

    @Override
    public String visitPrintStmt(CoffieLangParser.PrintStmtContext ctx) {
        visit(ctx.expr());
        return null;
    }

    @Override
    public String visitStmtIf(CoffieLangParser.StmtIfContext ctx) {
        visit(ctx.ifStmt());
        return null;
    }

    @Override
    public String visitIfStmt(CoffieLangParser.IfStmtContext ctx) {
        String condType = visit(ctx.expr());
        if (!"boolean".equals(condType)) {
            error("Condição do 'if' deve ser boolean. Encontrado: " + condType, ctx.LP().getSymbol());
        }
        table.enterScope();
        visit(ctx.block(0));
        table.exitScope();
        if (ctx.ELSE() != null) {
            table.enterScope();
            visit(ctx.block(1));
            table.exitScope();
        }
        return null;
    }

    @Override
    public String visitStmtWhile(CoffieLangParser.StmtWhileContext ctx) {
        visit(ctx.whileStmt());
        return null;
    }

    @Override
    public String visitWhileStmt(CoffieLangParser.WhileStmtContext ctx) {
        String condType = visit(ctx.expr());
        if (!"boolean".equals(condType)) {
            error("Condição do 'while' deve ser boolean.", ctx.LP().getSymbol());
        }
        table.enterScope();
        visit(ctx.block());
        table.exitScope();
        return null;
    }

    @Override
    public String visitStmtFor(CoffieLangParser.StmtForContext ctx) {
        visit(ctx.forStmt());
        return null;
    }

    @Override
    public String visitForStmt(CoffieLangParser.ForStmtContext ctx) {
        table.enterScope();
        if (ctx.varDecl() != null) visit(ctx.varDecl());
        if (ctx.assignment() != null) visit((ParseTree) ctx.assignment());

        if (ctx.expr() != null) {
            String cond = visit(ctx.expr());
            if (!"boolean".equals(cond)) {
                error("Condição do 'for' deve ser boolean.", ctx.SEMI(0).getSymbol());
            }
        }
        if (ctx.assignment(1) != null) visit(ctx.assignment(1));

        visit(ctx.block());
        table.exitScope();
        return null;
    }

    @Override
    public String visitExprAddSub(CoffieLangParser.ExprAddSubContext ctx) {
        return checkMathOp(visit(ctx.expr(0)), visit(ctx.expr(1)), ((Token) ctx.getChild(1).getPayload()));
    }

    @Override
    public String visitExprMultDiv(CoffieLangParser.ExprMultDivContext ctx) {
        return checkMathOp(visit(ctx.expr(0)), visit(ctx.expr(1)), ((Token) ctx.getChild(1).getPayload()));
    }

    @Override
    public String visitExprRelational(CoffieLangParser.ExprRelationalContext ctx) {
        String t1 = visit(ctx.expr(0));
        String t2 = visit(ctx.expr(1));
        if (isNumber(t1) && isNumber(t2)) return "boolean";
        error("Comparação relacional requer números.", ((Token) ctx.getChild(1).getPayload()));
        return "boolean";
    }

    @Override
    public String visitExprEquality(CoffieLangParser.ExprEqualityContext ctx) {
        visit(ctx.expr(0));
        visit(ctx.expr(1));
        return "boolean";
    }

    @Override
    public String visitExprAtom(CoffieLangParser.ExprAtomContext ctx) {
        return visit(ctx.atom());
    }

    @Override
    public String visitAtom(CoffieLangParser.AtomContext ctx) {
        if (ctx.INT_LITERAL() != null) return "int";
        if (ctx.FLOAT_LITERAL() != null) return "double";
        if (ctx.STRING_LITERAL() != null) return "String";
        if (ctx.BOOL_LITERAL() != null) return "boolean";
        
        if (ctx.ID() != null && !ctx.ID().isEmpty()) {
            String name = ctx.ID(0).getText();
            
            // Se for chamada de função (LP presente)
            if (ctx.LP() != null) return "void"; 
            
            SymbolTable.Symbol sym = table.lookup(name);
            if (sym == null) {
                error("Variável '" + name + "' não encontrada.", ctx.ID(0).getSymbol());
                return "unknown";
            }
            return sym.type;
        }
        
        if (ctx.expr() != null) return visit(ctx.expr());
        
        return "unknown";
    }

    @Override
    public String visitType(CoffieLangParser.TypeContext ctx) {
        return ctx.getText();
    }

    private void checkTypeCompatibility(String expected, String actual, Token token) {
        if (expected.equals(actual)) return;
        if (expected.equals("double") && actual.equals("int")) return;
        error("Tipo incompatível. Esperado: " + expected + ", encontrado: " + actual, token);
    }

    private String checkMathOp(String t1, String t2, Token token) {
        if (isNumber(t1) && isNumber(t2)) {
            if (t1.equals("double") || t2.equals("double")) return "double";
            return "int";
        }
        if (t1.equals("String") || t2.equals("String")) return "String";
        error("Operação matemática inválida entre: " + t1 + " e " + t2, token);
        return "unknown";
    }

    private boolean isNumber(String type) {
        return "int".equals(type) || "double".equals(type);
    }

    private void error(String msg, Token token) {
        throw new SemanticError(msg, token);
    }
}