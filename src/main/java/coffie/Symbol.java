package coffie;

public class Symbol {
    public String name;
    public String type;
    public int scope;

    public Symbol(String name, String type, int scope) {
        this.name = name;
        this.type = type;
        this.scope = scope;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", type=" + type + ", scope=" + scope + "]";
    }
}
