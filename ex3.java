/*
Desafio
Crie um programa que leia 6 valores, os quais poderão ser negativos e/ou positivos. Em seguida, apresente a quantidade de valores positivos digitados.

Entrada
Você receberá seis valores, negativos e/ou positivos.

Saída
Exiba uma mensagem dizendo quantos valores positivos foram lidos. assim como é exibido abaixo no exemplo de saída. Não se esqueça de incluir na mensagem de saída o sufixo " valores positivos", conforme o exemplo abaixo:
*/

import java.util.Scanner;

public class ex3 {
  public static void main(String[] args) {
    int positives = 0;
    Scanner sc = new Scanner(System.in);
    
    while(sc.hasNext()){
      if (sc.nextDouble() > 0) {
        positives++;
      }
    }
    
    System.out.println(positives + " valores positivos");
    
    sc.close();
  }
}