package coffie;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.nio.file.*;

public class Main {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.err.println("Uso: java -jar coffiler.jar <arquivo.coffie>");
            System.exit(1);
        }

        try {
            // Lê arquivo
            String source = Files.readString(Path.of(args[0]));
            CharStream input = CharStreams.fromString(source);

            // Cria lexer e adiciona tratamento de erro
            CoffieLangLexer lexer = new CoffieLangLexer(input);
            lexer.removeErrorListeners();
            lexer.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, 
                                        int line, int charPositionInLine, String msg, RecognitionException e) {
                    System.err.printf("[ERRO LEXICO] linha %d:%d %s%n", line, charPositionInLine, msg);
                }
            });

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Parser
            CoffieLangParser parser = new CoffieLangParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, 
                                        int line, int charPositionInLine, String msg, RecognitionException e) {
                    System.err.printf("[ERRO SINTATICO] linha %d:%d %s%n", line, charPositionInLine, msg);
                }
            });

            // Executa a regra inicial
            ParseTree tree = parser.prog();

            // Exibe arvore  
            System.out.println(tree.toStringTree(parser));

        } catch (Exception e) {
            System.err.println("Erro ao ler ou processar arquivo: " + e.getMessage());
        }
    }
}
