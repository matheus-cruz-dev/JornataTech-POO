package Conceitos_Basicos.ex03;

public class Main {
  public static void main(String[] args) {
    Funcionario gerente = new Funcionario();
    Funcionario desenvolvedor = new Funcionario();

    gerente.nome = "Gerente";
    gerente.salario = 6000;

    desenvolvedor.nome = "Desenvolvedor";
    desenvolvedor.salario = 3000;

    double salárioGerente = gerente.calcularSalário(10, 15);
    double salárioDesenvolvedor = desenvolvedor.calcularSalário(0, 10);

    System.out.println("Salário do Gerente: " + salárioGerente);
    System.out.println("Salário do Desenvolvedor: " + salárioDesenvolvedor);

  }
}
