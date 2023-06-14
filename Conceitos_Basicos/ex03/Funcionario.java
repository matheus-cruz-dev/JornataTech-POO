package Conceitos_Basicos.ex03;

public class Funcionario {
  String nome;
  float salario;

  double calcularSalário(double bonus, double desconto) {
    double salárioTotal = salario + (salario * bonus / 100) - (salario * desconto / 100);
    return salárioTotal;
  }
}
