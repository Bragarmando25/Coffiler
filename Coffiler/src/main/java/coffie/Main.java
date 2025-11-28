package coffie;

import java.io.IOException;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.nio.file.*;

public class Main {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.err.println("Uso: java coffie.Main <arquivo.coffie>");
            System.exit(1);
        }

        try {
            System.out.println("Lendo arquivo: " + args[0]);
            String source = Files.readString(Path.of(args[0]));
            CharStream input = CharStreams.fromString(source);

            // LEXER
            CoffieLangLexer lexer = new CoffieLangLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // PARSER
            CoffieLangParser parser = new CoffieLangParser(tokens);
            ParseTree tree = parser.prog();

            if (parser.getNumberOfSyntaxErrors() > 0) {
                System.err.println("Erros sintáticos encontrados. Análise semântica abortada.");
                return;
            }

            // SEMANTICA
            System.out.println("Iniciando Análise Semântica...");
            try {
                SemanticAnalyzer sem = new SemanticAnalyzer();
                sem.visit(tree);
                System.out.println("Análise Semântica concluída com SUCESSO!");
            } catch (SemanticError e) {
                System.err.println(e.getMessage());
            }

        } catch (IOException | RecognitionException e) {
            System.err.println("Erro fatal: " + e.getMessage());
        }
    }
}