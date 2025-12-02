package coffie;

import java.io.File;
import java.io.IOException;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.err.println("Uso: java coffie.Main <arquivo.coffie>");
            System.exit(1);
        }

        String inputFile = args[0];
        String outputDirName = "generated";
        new File(outputDirName).mkdirs();

        String baseName = new File(inputFile).getName().replace(".coffie", "");
        String asmFile = outputDirName + File.separator + baseName + ".asm";

        try {
            System.out.println("=== COFFILER: COMPILADOR NATIVO ===");
            
            // 0. Pré-processamento
            System.out.println("[1/4] Pre-processamento...");
            Preprocessor pre = new Preprocessor();
            String source = pre.process(inputFile);

            // 1. ANTLR (Lexer/Parser)
            System.out.println("[2/4] Analise Sintatica...");
            CoffieLangLexer lexer = new CoffieLangLexer(CharStreams.fromString(source));
            CoffieLangParser parser = new CoffieLangParser(new CommonTokenStream(lexer));
            
            ParseTree tree = parser.prog();

            if (parser.getNumberOfSyntaxErrors() > 0) {
                System.err.println("[FALHA] " + parser.getNumberOfSyntaxErrors() + " erros de sintaxe encontrados. Corrija antes de prosseguir.");
                System.exit(1);
            }

            // 2. Semântica (ATUALIZADO)
            System.out.println("[3/4] Analise Semantica...");
            SemanticAnalyzer semantic = new SemanticAnalyzer();
            semantic.visit(tree);

            // VERIFICA ERROS SEMÂNTICOS
            if (!semantic.errors.isEmpty()) {
                System.err.println("==============================================");
                System.err.println("[FALHA] Erros Semanticos Encontrados:");
                for (String err : semantic.errors) {
                    System.err.println("  " + err);
                }
                System.err.println("==============================================");
                System.err.println("Compilacao abortada devido a erros semanticos.");
                System.exit(1); // Aborta para não gerar Assembly quebrado
            }

            // 3. TAC (Intermediário)
            System.out.println("[4/4] Gerando Codigo...");
            TacGenerator tacGen = new TacGenerator();
            tacGen.visit(tree);

            // 4. Geração de Assembly
            AsmGenerator asmGen = new AsmGenerator(tacGen.instructions);
            asmGen.generate(asmFile);
            
            System.out.println("[SUCESSO] Binario gerado em: " + asmFile);

        } catch (IOException | RecognitionException e) {
            System.err.println("[ERRO CRITICO]: " + e.getMessage());
            System.exit(1); 
        }
    }
}