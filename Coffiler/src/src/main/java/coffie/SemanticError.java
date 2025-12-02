package coffie;

import org.antlr.v4.runtime.Token;

public class SemanticError extends RuntimeException {
    
    public SemanticError(String msg) {
        super("ERRO SEMÂNTICO: " + msg);
    }

    public SemanticError(String msg, Token token) {
        super(String.format("ERRO SEMÂNTICO [Linha %d:%d]: %s", 
            token.getLine(), token.getCharPositionInLine(), msg));
    }
}