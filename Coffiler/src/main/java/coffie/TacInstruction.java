package coffie;

public class TacInstruction {

    public enum OpCode {
        ADD, SUB, MULT, DIV, MOD,
        LT, GT, LE, GE, EQ, NEQ,
        AND, OR, NOT,               
        ASSIGN,
        IF_FALSE, GOTO, LABEL,
        
        PARAM, CALL, RETURN, POP_PARAM,
        PRINT, SCAN, GETS, PUTS,
        ARR_LOAD, ARR_STORE,        
        
        DEF_START, DEF_FIELD, DEF_END, 

        SWITCH, CASE, DEFAULT, BREAK, END_SWITCH,
        
        ADDR,          // &x -> pega endereço
        DEREF_LOAD,    // y = *x -> lê valor apontado
        DEREF_STORE,   // *x = y -> grava no endereço
        
        DECL_VAR,      // Informa tipo (float/int) para o Assembly
        
        CALL_EXT       // Chamada externa genérica (atoi, atof)
    }

    public OpCode op;
    public String arg1;
    public String arg2;
    public String result;

    public TacInstruction(OpCode op, String arg1, String arg2, String result) {
        this.op = op;
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.result = result;
    }
    
    @Override
    public String toString() {
        return op.toString() + " " + (result!=null?result:"") + ", " + (arg1!=null?arg1:"") + ", " + (arg2!=null?arg2:"");
    }
}