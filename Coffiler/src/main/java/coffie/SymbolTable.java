package coffie;

import java.util.*;

public class SymbolTable {
    
    public static class Symbol {
        // Campos públicos para evitar avisos de "unused" e facilitar acesso no SemanticAnalyzer
        public String name;
        public String type;      
        public boolean isInitialized; 
        public boolean isFunction;
        public boolean isStructDef;
        public List<String> paramTypes; 
        public Map<String, String> structFields; 

        // Variável Simples
        public Symbol(String name, String type, boolean isInitialized) {
            this.name = name;
            this.type = type;
            this.isInitialized = isInitialized;
            this.isFunction = false;
        }

        // Função
        public Symbol(String name, String returnType, List<String> params) {
            this.name = name;
            this.type = returnType;
            this.isFunction = true;
            this.isInitialized = true; 
            this.paramTypes = params;
        }

        // Struct/Union Definição
        public Symbol(String name, Map<String, String> fields) {
            this.name = name;
            this.type = "STRUCT_DEF";
            this.isStructDef = true;
            this.structFields = fields;
            this.isInitialized = true;
        }
    }

    private final Stack<Map<String, Symbol>> scopes;

    public SymbolTable() {
        scopes = new Stack<>();
        enterScope(); // Escopo Global
        
        // Declarações padrão
        declareStdLib("printf", "void", List.of("string")); 
        declareStdLib("scanf", "void", List.of("string"));
        declareStdLib("gets", "void", List.of("string"));
        declareStdLib("puts", "void", List.of("string"));
        declareStdLib("atoi", "int", List.of("string"));
        declareStdLib("atof", "float", List.of("string"));
    }

    // Método final para ser chamado com segurança no construtor
    private void declareStdLib(String name, String type, List<String> params) {
        if (!scopes.isEmpty()) {
            scopes.firstElement().put(name, new Symbol(name, type, params));
        }
    }

    // Método final para ser chamado com segurança no construtor
    public final void enterScope() { 
        scopes.push(new HashMap<>()); 
    }
    
    public void exitScope() { 
        if (!scopes.isEmpty()) scopes.pop(); 
    }

    public boolean declareVar(String name, String type, boolean initialized) {
        if (scopes.peek().containsKey(name)) return false;
        scopes.peek().put(name, new Symbol(name, type, initialized));
        return true;
    }

    public boolean declareFunc(String name, String returnType, List<String> paramTypes) {
        if (scopes.firstElement().containsKey(name)) return false;
        scopes.firstElement().put(name, new Symbol(name, returnType, paramTypes));
        return true;
    }

    public void declareStruct(String name, Map<String, String> fields) {
        scopes.firstElement().put(name, new Symbol(name, fields));
    }

    public Symbol lookup(String name) {
        for (int i = scopes.size() - 1; i >= 0; i--) {
            if (scopes.get(i).containsKey(name)) return scopes.get(i).get(name);
        }
        return null;
    }
    
    public boolean isGlobalScope() {
        return scopes.size() == 1;
    }
}