package coffie;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.nio.file.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.err.println("Uso: java coffie.Main <arquivo.java> [--tokens]");
            System.exit(1);
        }

        String sourcePath = args[0];
        boolean showTokens = args.length > 1 && args[1].equals("--tokens");

        CharStream input = CharStreams.fromPath(Paths.get(sourcePath));

        CoffieLangLexer lexer = new CoffieLangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CoffieLangParser parser = new CoffieLangParser(tokens);

        if (showTokens) {
            System.out.println("=== TOKENS GERADOS ===");
            lexer.reset();
            for (Token token = lexer.nextToken();
                 token.getType() != Token.EOF;
                 token = lexer.nextToken()) {

                String tokenName = CoffieLangLexer.VOCABULARY.getSymbolicName(token.getType());
                System.out.printf("Linha %-3d  Col %-3d  %-20s  '%s'%n",
                        token.getLine(),
                        token.getCharPositionInLine(),
                        tokenName,
                        token.getText());
            }
            return;
        }

        parser.removeErrorListeners();
        lexer.removeErrorListeners();

        BaseErrorListener listener = new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                    int line, int charPositionInLine, String msg, RecognitionException e) {
                System.err.printf("syntax error at %d:%d: %s%n", line, charPositionInLine, msg);
            }
        };

        parser.addErrorListener(listener);
        lexer.addErrorListener(listener);

        ParseTree tree = parser.program();
        System.out.println("parse: ok");
    }
}
