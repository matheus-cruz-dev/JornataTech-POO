package Conceitos_Basicos.ex02;

public class Main {
  public static void main(String[] args) {
    Animal cachorro = new Animal();
    Animal gato = new Animal();
    Animal passaro = new Animal();
        
    cachorro.nome = "Cachorro";
    cachorro.idade = 3;
    cachorro.som = "Au au";
    
    gato.nome = "gato";
    gato.idade = 5;
    gato.som = "Miau miau";

    passaro.nome = "passaro";
    passaro.idade = 2;
    passaro.som = "Piu piu";

    cachorro.emitirSom();
    gato.emitirSom();
    passaro.emitirSom();
  }
}
