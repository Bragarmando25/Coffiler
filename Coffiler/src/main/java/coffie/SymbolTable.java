package coffie;

import java.util.*;

public class SymbolTable {
    
    public static class Symbol {
        String type;      
        boolean isFunc;   
        boolean initialized; 
        List<String> paramTypes; 

        // Construtor Variável
        public Symbol(String name, String type) {
            this.type = type;
            this.isFunc = false;
            this.initialized = false;
        }

        // Construtor Função
        public Symbol(String name, String returnType, List<String> params) {
            this.type = returnType;
            this.isFunc = true;
            this.paramTypes = params;
            this.initialized = true; 
        }
    }

    private Stack<Map<String, Symbol>> scopes;

    public SymbolTable() {
        scopes = new Stack<>();
        enterScope(); 
    }

    public final void enterScope() {
        scopes.push(new HashMap<>());
    }

    public void exitScope() {
        if (!scopes.isEmpty()) scopes.pop();
    }

    public void declareVar(String name, String type) {
        Map<String, Symbol> currentScope = scopes.peek();
        if (currentScope.containsKey(name)) {
            throw new RuntimeException("Símbolo '" + name + "' já declarado neste escopo.");
        }
        currentScope.put(name, new Symbol(name, type));
    }

    public void declareFunc(String name, String returnType, List<String> paramTypes) {
        Map<String, Symbol> currentScope = scopes.peek();
        if (currentScope.containsKey(name)) {
            throw new RuntimeException("Função '" + name + "' já declarada.");
        }
        currentScope.put(name, new Symbol(name, returnType, paramTypes));
    }

    public Symbol lookup(String name) {
        for (int i = scopes.size() - 1; i >= 0; i--) {
            if (scopes.get(i).containsKey(name)) {
                return scopes.get(i).get(name);
            }
        }
        return null;
    }

    public void initialize(String name) {
        Symbol s = lookup(name);
        if (s != null) s.initialized = true;
    }
}