package Conceitos_Basicos.ex01;

public class Main {
  public static void main(String[] args) {
    Veiculo carro = new Veiculo();
    Veiculo moto = new Veiculo();

    carro.nome = "Fiat Uno";
    carro.cor = "Vermelho";
    carro.numeroDeRodas = 4;
    carro.velocidade = 0;
    
    moto.nome = "Fazer 250c";
    moto.cor = "Preto";
    moto.numeroDeRodas = 2;
    moto.velocidade = 0;

    System.out.println("Veiculo: " + carro.nome);
    System.out.println("Cor: " + carro.cor);
    System.out.println("Número de rodas: " + carro.numeroDeRodas);
    System.out.println("Velocidade inicial: " + carro.velocidade);

    carro.mover();

    System.out.println("Velocidade aumentada: " + carro.velocidade);

    carro.frear();

    System.out.println("Velocidade diminuida: " + carro.velocidade);

    System.out.println("-------------------//---------------");

    System.out.println("Veiculo: " + moto.nome);
    System.out.println("Cor: " + moto.cor);
    System.out.println("Número de rodas: " + moto.numeroDeRodas);
    System.out.println("Velocidade inicial: " + moto.velocidade);

    moto.mover();

    System.out.println("Velocidade aumentada: " + moto.velocidade);

    moto.frear();
    moto.frear();

    System.out.println("Velocidade diminuida 2x: " + moto.velocidade);
  }
}
