package Polimorfismo_E_Herança.ex02;

import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Calculadora calculadora = new Calculadora();

    System.out.println("Soma de inteiros: " + calculadora.somar(5, 3));
    System.out.println("Soma de decimais: " + calculadora.somar((float) 3.5, (float)2.1));

    List<Integer> listaInteiros = Arrays.asList(1, 2, 3, 4, 5);
    System.out.println("Soma da lista de inteiros: " + calculadora.somar(listaInteiros));

    List<Double> listaDecimais = Arrays.asList(1.5, 2.3, 3.7, 4.2, 5.9);
    System.out.println("Soma da lista de decimais: " + calculadora.somar(listaDecimais, Double.class));
  }
}
