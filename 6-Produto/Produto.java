public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double calcularPrecoComDesconto(double desconto) {
        return preco - (preco * desconto / 100);
    }

    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 3000.00);
        double precoComDesconto = produto.calcularPrecoComDesconto(10); // 10% de desconto
        System.out.println("Preço com desconto: R$ " + precoComDesconto);
        
    }
}
