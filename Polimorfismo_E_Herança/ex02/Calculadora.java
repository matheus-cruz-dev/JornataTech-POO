package Polimorfismo_E_Herança.ex02;

import java.util.List;

public class Calculadora {

  int somar(int num1, int num2) {
    return num1 + num2;
  }

  float somar(float num1, float num2) {
    return num1 + num2;
  }

  int somar(List<Integer> lista) {
    int soma = 0;
    for (int num : lista) {
      soma += num;
    }
    return soma;
  }
                                    // Precisei por conta de erro na IDE e não rodar o código.
  double somar(List<Double> lista, Class<Double> typeToken) {
    double soma = 0;
    for (double num : lista) {
      soma += num;
    }
    return soma;
  }
}
