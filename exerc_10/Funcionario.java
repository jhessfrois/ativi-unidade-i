public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
      }

    public void calcularAumentoSalarial(double aumento) {
        salario += (salario * aumento / 100);
        System.out.println(nome + ", que tem o cargo de " + cargo + ", agora tem um salário de: " + salario);
      }

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Ana", "Desenvolvedora", 5000);
        funcionario.calcularAumentoSalarial(10); // Aumento de 10%
    }
}
