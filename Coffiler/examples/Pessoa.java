public class Pessoa {
    String nome;
    int idade;

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.nome = "Armando";
        p.idade = 21;
        System.out.println(p.nome);
        System.out.println(p.idade);
    }
}
