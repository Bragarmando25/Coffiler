package coffie;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TacGenerator extends CoffieLangBaseVisitor<String> {

    public final List<TacInstruction> instructions = new ArrayList<>();
    private int tempCount = 0;
    private int labelCount = 0;
    private final Stack<String> breakStack = new Stack<>();

    private String newTemp() { return "t" + (tempCount++); }
    private String newLabel() { return "L" + (labelCount++); }

    private void emit(TacInstruction.OpCode op, String arg1, String arg2, String result) {
        instructions.add(new TacInstruction(op, arg1, arg2, result));
    }

    @Override public String visitProg(CoffieLangParser.ProgContext ctx) {
        for (var child : ctx.children) {
            if (child instanceof CoffieLangParser.StructDefContext) visit(child);
            else if (child instanceof CoffieLangParser.UnionDefContext) visit(child);
            else if (child instanceof CoffieLangParser.MethodDefContext) visit(child);
            else if (child instanceof CoffieLangParser.VarDeclContext) visit(child);
        }
        return null;
    }

    @Override public String visitStructDef(CoffieLangParser.StructDefContext ctx) {
        emit(TacInstruction.OpCode.DEF_START, "struct", null, ctx.ID().getText());
        for (CoffieLangParser.FieldDeclContext f : ctx.fieldDecl()) {
            emit(TacInstruction.OpCode.DEF_FIELD, f.type().getText(), null, f.ID().getText());
        }
        emit(TacInstruction.OpCode.DEF_END, null, null, null);
        return null;
    }
    
    @Override public String visitUnionDef(CoffieLangParser.UnionDefContext ctx) {
        emit(TacInstruction.OpCode.DEF_START, "union", null, ctx.ID().getText());
        for (CoffieLangParser.FieldDeclContext f : ctx.fieldDecl()) {
            emit(TacInstruction.OpCode.DEF_FIELD, f.type().getText(), null, f.ID().getText());
        }
        emit(TacInstruction.OpCode.DEF_END, null, null, null);
        return null;
    }

    @Override public String visitMethodDef(CoffieLangParser.MethodDefContext ctx) {
        if (ctx == null) return null;
        emit(TacInstruction.OpCode.LABEL, null, null, ctx.ID().getText());
        if (ctx.params() != null) {
            int idx = 0;
            for (CoffieLangParser.ParamContext p : ctx.params().param()) 
                emit(TacInstruction.OpCode.POP_PARAM, String.valueOf(idx++), null, p.ID().getText());
        }
        visit(ctx.block());
        return null;
    }

    @Override public String visitSwitchStmt(CoffieLangParser.SwitchStmtContext ctx) {
        String testVal = visit(ctx.expr());
        String endLabel = newLabel();
        breakStack.push(endLabel);
        for (CoffieLangParser.CaseBlockContext cb : ctx.caseBlock()) {
            String caseVal = visit(cb.expr());
            String nextCase = newLabel();
            String tempEq = newTemp();
            emit(TacInstruction.OpCode.EQ, testVal, caseVal, tempEq);
            emit(TacInstruction.OpCode.IF_FALSE, tempEq, null, nextCase);
            for (CoffieLangParser.StatementContext s : cb.statement()) visit(s);
            emit(TacInstruction.OpCode.LABEL, null, null, nextCase);
        }
        if (ctx.DEFAULT() != null) {
            for (CoffieLangParser.StatementContext s : ctx.statement()) visit(s);
        }
        emit(TacInstruction.OpCode.LABEL, null, null, endLabel);
        breakStack.pop();
        return null;
    }
    
    @Override public String visitStmtBreak(CoffieLangParser.StmtBreakContext ctx) {
        if (!breakStack.isEmpty()) emit(TacInstruction.OpCode.GOTO, null, null, breakStack.peek());
        return null; 
    }

    @Override public String visitWhileStmt(CoffieLangParser.WhileStmtContext ctx) {
        String start = newLabel(); String end = newLabel();
        breakStack.push(end);
        emit(TacInstruction.OpCode.LABEL, null, null, start);
        String cond = visit(ctx.expr());
        emit(TacInstruction.OpCode.IF_FALSE, cond, null, end);
        visit(ctx.statement()); 
        emit(TacInstruction.OpCode.GOTO, null, null, start);
        emit(TacInstruction.OpCode.LABEL, null, null, end);
        breakStack.pop();
        return null;
    }

    @Override public String visitDoWhileStmt(CoffieLangParser.DoWhileStmtContext ctx) {
        String startLabel = newLabel();
        String endLabel = newLabel();
        breakStack.push(endLabel);
        emit(TacInstruction.OpCode.LABEL, null, null, startLabel);
        visit(ctx.statement()); 
        String cond = visit(ctx.expr());
        String exitTemp = newLabel();
        emit(TacInstruction.OpCode.IF_FALSE, cond, null, exitTemp);
        emit(TacInstruction.OpCode.GOTO, null, null, startLabel);
        emit(TacInstruction.OpCode.LABEL, null, null, exitTemp);
        emit(TacInstruction.OpCode.LABEL, null, null, endLabel);
        breakStack.pop();
        return null;
    }

    @Override public String visitForStmt(CoffieLangParser.ForStmtContext ctx) {
        if(ctx.varDecl()!=null) visit(ctx.varDecl());
        if(ctx.assignment(0)!=null) visit(ctx.assignment(0));
        String start = newLabel(); String end = newLabel();
        breakStack.push(end); 
        emit(TacInstruction.OpCode.LABEL, null, null, start);
        if(ctx.expr()!=null) {
            String cond = visit(ctx.expr());
            emit(TacInstruction.OpCode.IF_FALSE, cond, null, end);
        }
        visit(ctx.statement()); 
        if(!ctx.assignment().isEmpty()) visit(ctx.assignment(ctx.assignment().size()-1));
        emit(TacInstruction.OpCode.GOTO, null, null, start);
        emit(TacInstruction.OpCode.LABEL, null, null, end);
        breakStack.pop();
        return null;
    }

    @Override public String visitVarDecl(CoffieLangParser.VarDeclContext ctx) { 
        String type = visit(ctx.type());
        String name = ctx.ID().getText();
        emit(TacInstruction.OpCode.DECL_VAR, type, null, name);
        if(ctx.expr() != null) emit(TacInstruction.OpCode.ASSIGN, visit(ctx.expr()), null, name); 
        return null; 
    }

    @Override public String visitAssignment(CoffieLangParser.AssignmentContext ctx) { 
        if (ctx.atom().MULT() != null) {
            String ptrAddr = visit(ctx.atom().atom()); 
            String val = visit(ctx.expr());
            emit(TacInstruction.OpCode.DEREF_STORE, ptrAddr, val, null);
            return null;
        }
        if (ctx.atom().LB_ARR() != null) {
            String arrName = ctx.atom().ID(0).getText(); 
            String index = visit(ctx.atom().expr());    
            String val = visit(ctx.expr());             
            emit(TacInstruction.OpCode.ARR_STORE, index, val, arrName);
            return null;
        }
        String target = ctx.atom().getText(); 
        emit(TacInstruction.OpCode.ASSIGN, visit(ctx.expr()), null, target);
        return null; 
    }

    @Override public String visitAtom(CoffieLangParser.AtomContext ctx) {
        if (ctx.INT_LITERAL() != null) return ctx.INT_LITERAL().getText();
        if (ctx.FLOAT_LITERAL() != null) return ctx.FLOAT_LITERAL().getText();
        if (ctx.STRING_LITERAL() != null) return ctx.STRING_LITERAL().getText();
        if (ctx.BOOL_LITERAL() != null) return ctx.BOOL_LITERAL().getText();
        if (ctx.CHAR_LITERAL() != null) {
            return String.valueOf((int)ctx.CHAR_LITERAL().getText().charAt(1));
        }
        if (ctx.AND_ADDR() != null) {
            String var;
            if (ctx.atom().DOT() != null) {
                String base = ctx.atom().ID(0).getText();
                String field = ctx.atom().ID(1).getText();
                var = base + "." + field;
            } else {
                var = ctx.atom().getText();
            }
            String res = newTemp();
            emit(TacInstruction.OpCode.ADDR, var, null, res);
            return res;
        }
        if (ctx.MULT() != null) {
            String ptrAddr = visit(ctx.atom());
            String res = newTemp();
            emit(TacInstruction.OpCode.DEREF_LOAD, ptrAddr, null, res);
            return res;
        }
        if (ctx.DOT() != null) {
             String var = ctx.ID(0).getText();
             String field = ctx.ID(1).getText();
             return var + "." + field; 
        }
        if (ctx.ID() != null && !ctx.ID().isEmpty()) {
            String name = ctx.ID(0).getText();
            if (ctx.LP() != null && ctx.LB_ARR() == null) return processCall(name, ctx.args());
            if (ctx.LB_ARR() != null) {
                String index = visit(ctx.expr());
                String res = newTemp();
                emit(TacInstruction.OpCode.ARR_LOAD, name, index, res);
                return res;
            }
            return name;
        }
        if (ctx.expr() != null) return visit(ctx.expr());
        return "0";
    }

    @Override public String visitStmtBlock(CoffieLangParser.StmtBlockContext ctx) { visit(ctx.block()); return null; }
    @Override public String visitType(CoffieLangParser.TypeContext ctx) { return ctx.getText(); }
    @Override public String visitBlock(CoffieLangParser.BlockContext ctx) { for(var s:ctx.statement()) visit(s); return null; }
    @Override public String visitStmtVarDecl(CoffieLangParser.StmtVarDeclContext ctx) { return visit(ctx.varDecl()); }
    @Override public String visitStmtAssign(CoffieLangParser.StmtAssignContext ctx) { return visit(ctx.assignment()); }
    @Override public String visitStmtIf(CoffieLangParser.StmtIfContext ctx) { return visit(ctx.ifStmt()); }
    
    @Override public String visitIfStmt(CoffieLangParser.IfStmtContext ctx) { 
        String cond = visit(ctx.expr());
        String lFalse = newLabel(); String lEnd = newLabel();
        emit(TacInstruction.OpCode.IF_FALSE, cond, null, lFalse);
        visit(ctx.statement(0));
        emit(TacInstruction.OpCode.GOTO, null, null, lEnd);
        emit(TacInstruction.OpCode.LABEL, null, null, lFalse);
        if(ctx.ELSE()!=null) visit(ctx.statement(1));
        emit(TacInstruction.OpCode.LABEL, null, null, lEnd);
        return null;
    }
    @Override public String visitStmtReturn(CoffieLangParser.StmtReturnContext ctx) { return visit(ctx.returnStmt()); }
    @Override public String visitReturnStmt(CoffieLangParser.ReturnStmtContext ctx) { emit(TacInstruction.OpCode.RETURN, ctx.expr()!=null?visit(ctx.expr()):null, null, null); return null; }
    @Override public String visitStmtCall(CoffieLangParser.StmtCallContext ctx) { return visit(ctx.callStmt()); }
    @Override public String visitCallStmt(CoffieLangParser.CallStmtContext ctx) { processCall(ctx.ID().getText(), ctx.args()); return null; }
    
    private String processCall(String name, CoffieLangParser.ArgsContext args) {
        if (args != null) {
            for (CoffieLangParser.ExprContext e : args.expr()) {
                String val = visit(e);
                emit(TacInstruction.OpCode.PARAM, val, null, null);
            }
        }
        String res = newTemp();
        emit(TacInstruction.OpCode.CALL, name, null, res);
        return res;
    }

    @Override public String visitStmtPrint(CoffieLangParser.StmtPrintContext ctx) { return visit(ctx.printStmt()); }
    @Override public String visitPrintStmt(CoffieLangParser.PrintStmtContext ctx) { 
        String fmt = ctx.STRING_LITERAL().getText();
        for(CoffieLangParser.ExprContext e : ctx.expr()) {
            String val = visit(e);
            emit(TacInstruction.OpCode.PARAM, val, null, null);
        }
        emit(TacInstruction.OpCode.PRINT, fmt, null, null);
        return null;
    }

    @Override public String visitStmtScan(CoffieLangParser.StmtScanContext ctx) { return visit(ctx.scanStmt()); }
    
    // --- CORREÇÃO AQUI: Tratamento do Operador & no SCAN ---
    @Override public String visitScanStmt(CoffieLangParser.ScanStmtContext ctx) { 
        String var = visit(ctx.atom());
        
        // Verifica se há o token '&' (AND_ADDR) na instrução
        if (ctx.AND_ADDR() != null) {
            String addrTemp = newTemp();
            // Gera instrução ADDR para pegar o endereço real
            emit(TacInstruction.OpCode.ADDR, var, null, addrTemp);
            var = addrTemp; 
        }
        
        emit(TacInstruction.OpCode.SCAN, null, null, var); 
        return null; 
    }
    // -----------------------------------------------------

    @Override public String visitStmtGets(CoffieLangParser.StmtGetsContext ctx) { return visit(ctx.getsStmt()); }
    @Override public String visitGetsStmt(CoffieLangParser.GetsStmtContext ctx) { emit(TacInstruction.OpCode.GETS, null, null, ctx.ID().getText()); return null; }
    @Override public String visitStmtPuts(CoffieLangParser.StmtPutsContext ctx) { return visit(ctx.putsStmt()); }
    @Override public String visitPutsStmt(CoffieLangParser.PutsStmtContext ctx) { emit(TacInstruction.OpCode.PUTS, visit(ctx.expr()), null, null); return null; }

    @Override public String visitExprAddSub(CoffieLangParser.ExprAddSubContext ctx) { String r = newTemp(); emit(ctx.PLUS()!=null?TacInstruction.OpCode.ADD:TacInstruction.OpCode.SUB, visit(ctx.expr(0)), visit(ctx.expr(1)), r); return r; }
    @Override public String visitExprMultDiv(CoffieLangParser.ExprMultDivContext ctx) { String r = newTemp(); TacInstruction.OpCode op = ctx.MULT()!=null ? TacInstruction.OpCode.MULT : ctx.DIV()!=null ? TacInstruction.OpCode.DIV : TacInstruction.OpCode.MOD; emit(op, visit(ctx.expr(0)), visit(ctx.expr(1)), r); return r; }
    @Override public String visitExprRelational(CoffieLangParser.ExprRelationalContext ctx) { String r = newTemp(); TacInstruction.OpCode op = ctx.LT()!=null?TacInstruction.OpCode.LT : ctx.GT()!=null?TacInstruction.OpCode.GT : ctx.LE()!=null?TacInstruction.OpCode.LE : TacInstruction.OpCode.GE; emit(op, visit(ctx.expr(0)), visit(ctx.expr(1)), r); return r; }
    @Override public String visitExprEquality(CoffieLangParser.ExprEqualityContext ctx) { String r = newTemp(); emit(ctx.EQ()!=null ? TacInstruction.OpCode.EQ : TacInstruction.OpCode.NEQ, visit(ctx.expr(0)), visit(ctx.expr(1)), r); return r; }
    @Override public String visitExprLogic(CoffieLangParser.ExprLogicContext ctx) { String r = newTemp(); emit(ctx.AND()!=null ? TacInstruction.OpCode.AND : TacInstruction.OpCode.OR, visit(ctx.expr(0)), visit(ctx.expr(1)), r); return r; }
    @Override public String visitExprUnary(CoffieLangParser.ExprUnaryContext ctx) { String r = newTemp(); emit(TacInstruction.OpCode.NOT, visit(ctx.expr()), null, r); return r; }
}