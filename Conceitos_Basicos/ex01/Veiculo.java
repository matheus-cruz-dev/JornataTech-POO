package Conceitos_Basicos.ex01;

public class Veiculo {
  String nome;
  String cor;
  int numeroDeRodas;
  float velocidade;

  void mover() {
    velocidade += 50;
  }

  void frear() {
    velocidade -= 25;
  }
}
