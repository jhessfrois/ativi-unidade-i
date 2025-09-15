public class ContaBancaria {
    private double saldo;
    private int numeroConta;

    public ContaBancaria(double saldo, int numeroConta) {
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
        }
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1000.0, 12345);
        System.out.println("Saldo inicial: R$" + conta.saldo);

        conta.depositar(500.0);
        System.out.println("Saldo após depósito: R$" + conta.saldo);

        conta.sacar(200.0);
        System.out.println("Saldo após saque: R$" + conta.saldo);

        conta.sacar(2000.0); // Tentativa de saque com saldo insuficiente
    }
}
