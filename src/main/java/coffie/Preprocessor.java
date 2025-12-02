package coffie;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Preprocessor {

    private final Map<String, String> definitions = new HashMap<>();

    public String process(String filePath) throws IOException {
        String content;
        try {
            content = Files.readString(Path.of(filePath));
        } catch (java.nio.file.NoSuchFileException e) {
            System.err.println("[AVISO PREPROCESSOR] Arquivo local nao encontrado: " + filePath);
            return ""; 
        }

        String[] lines = content.split("\n");
        StringBuilder processed = new StringBuilder();

        for (String line : lines) {
            String trimmed = line.trim();
            
            // 1. Processar #include
            if (trimmed.startsWith("#include")) {
                if (trimmed.matches("#include\\s*<.*>")) {
                    processed.append("// SYSTEM INCLUDE IGNORED: ").append(trimmed).append("\n");
                    continue;
                }
                Matcher m = Pattern.compile("#include\\s*\"([^\"]+)\"").matcher(trimmed);
                if (m.find()) {
                    String includeFile = m.group(1);
                    String dir = Path.of(filePath).getParent().toString();
                    processed.append("// BEGIN INCLUDE: ").append(includeFile).append("\n");
                    processed.append(process(dir + "/" + includeFile)).append("\n");
                    processed.append("// END INCLUDE: ").append(includeFile).append("\n");
                    continue;
                }
            }

            // 2. Processar #define (CORREÇÃO AQUI)
            if (trimmed.startsWith("#define")) {
                // Remove comentários inline da linha do define (ex: #define MAX 5 // Comentario)
                String cleanLine = trimmed;
                if (cleanLine.contains("//")) {
                    cleanLine = cleanLine.substring(0, cleanLine.indexOf("//")).trim();
                }

                String[] parts = cleanLine.split("\\s+", 3);
                if (parts.length >= 3) {
                    definitions.put(parts[1], parts[2]); 
                } else if (parts.length == 2) {
                    definitions.put(parts[1], "1");
                }
                
                processed.append("\n"); // Mantém linha vazia para preservar contagem
                continue;
            }

            // 3. Substituição de Macros
            String finalLine = line;
            
            // Ordena chaves pelo tamanho (maior para menor) para evitar substituir substrings
            var sortedKeys = definitions.keySet().stream()
                .sorted((a, b) -> b.length() - a.length())
                .toList();

            for (String key : sortedKeys) {
                String value = definitions.get(key);
                // Substitui apenas palavras inteiras
                finalLine = finalLine.replaceAll("\\b" + Pattern.quote(key) + "\\b", Matcher.quoteReplacement(value));
            }
            
            processed.append(finalLine).append("\n");
        }
        return processed.toString();
    }
}