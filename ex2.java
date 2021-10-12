/*
Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares consecutivos a partir de X, um valor por linha, inclusive o X se for o caso.

Entrada
A entrada será um valor inteiro positivo.

Saída
A saída será uma sequência de seis números ímpares.
*/

import java.io.IOException;
import java.util.Scanner;

public class ex2 {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int x = leitor.nextInt();
        leitor.close();
        
        if (x % 2 == 0) {
          x++;
        }
        
        for (int i = 0; i < 6; i++ ) {
        		System.out.println(x);
        		x = x + 2;
        }
    }
}