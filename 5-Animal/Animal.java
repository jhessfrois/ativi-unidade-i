public class Animal {
    private String nome;
    private String tipoAlimentacao;

    public Animal(String nome, String tipoAlimentacao) {
        this.nome = nome;
        this.tipoAlimentacao = tipoAlimentacao;
    }

    public String getNome() {
        return nome;
    }

    public String getTipoAlimentacao() {
        return tipoAlimentacao;
    }

    public void emitirSom() {
        System.out.println(nome + " emite um som característico!");
    }

    public static void main(String[] args) {
        Animal cachorro = new Animal("Cachorro", "Carnívoro");
        System.out.println(cachorro.getNome() + " é um " + cachorro.getTipoAlimentacao());
        cachorro.emitirSom();
    }
}