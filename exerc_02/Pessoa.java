public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void cumprimentar() {
        System.out.println("Olá, seja bem-vindo(a) ao evento! Meu nome é " + nome + ".");
    }
}