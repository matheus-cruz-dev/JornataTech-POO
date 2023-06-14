package Polimorfismo_E_Herança.ex01;

public class Main {
  public static void main(String[] args) {
    Veiculo carro = new Carro();
    Veiculo moto = new Moto();

    carro.acelerar();
    moto.acelerar();
  }
}
