package engineer.maiko.desafiocontrolefluxo;

import java.util.Scanner;

public class Contador {
  public static void main(String[] args) {
    Scanner terminal = new Scanner(System.in);
    System.out.println("Digite o primeiro parâmetro");
    int parametroUm = terminal.nextInt();
    System.out.println("Digite o segundo parâmetro");
    int parametroDois = terminal.nextInt();

    try {
      //chamando o método contendo a lógica de contagem
      contar(parametroUm, parametroDois);
    } catch (ParametrosInvalidosException exception) {
      System.out.println(exception.getMessage());
    }
  }

  static void contar(int paramentroUm, int parametroDois) throws ParametrosInvalidosException {
    if(parametroDois > paramentroUm ) {
          int contagem = parametroDois - paramentroUm;

              for(int i = 0; i <= contagem; i++) {
      System.out.println("Imprimindo o número " + i);
    }


    } else {
      throw new ParametrosInvalidosException();
    }




  }
  
}
