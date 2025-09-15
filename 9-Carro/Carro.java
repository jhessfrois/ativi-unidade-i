public class Carro {
  private String marca;
  private String modelo;
  private int ano;
  private boolean ligado;
  private int velocidade;

  public Carro(String marca, String modelo, int ano) {
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
    this.ligado = false;
    this.velocidade = 0;
  }

  public void ligar() {
    if (!ligado) {
      ligado = true;
      System.out.println("O carro foi ligado.");
    } else {
      System.out.println("O carro já está ligado.");
    }
  }

  public void desligar() {
    if (ligado) {
      ligado = false;
      velocidade = 0;
      System.out.println("O carro foi desligado.");
    } else {
      System.out.println("O carro já está desligado.");
    }
  }

  public void acelerar(int incremento) {
    if (ligado) {
      velocidade += incremento;
      System.out.println("O carro acelerou para " + velocidade + " km/h.");
    } else {
      System.out.println("Não é possível acelerar. O carro está desligado.");
    }
  }

  public static void main(String[] args) {
    Carro meuCarro = new Carro("Toyota", "Corolla", 2020);
    meuCarro.ligar();
    meuCarro.acelerar(20);
    meuCarro.acelerar(30);
    meuCarro.desligar();
    meuCarro.acelerar(10); // Tentativa de acelerar com o carro desligado
  }
}