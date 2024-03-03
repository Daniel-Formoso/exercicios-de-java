/*Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e
100, quantos estão entre 101 e 200 e quantos são maiores de 200*/

package exercicios_treinofor;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int soma0100 = 0;
		
		int soma101200 = 0;
		
		int soma200 = 0;
		
		for (int i = 1; i <= 5; i++) {
			int x = sc.nextInt();
			if (x >= 0 && x <= 100) {
				soma0100++;
			}if(x >= 101 && x <= 200 ) {
				soma101200++;
			}if (x > 200) {
				soma200++;
			}
		}
		
		System.out.println(soma0100 + " estão entre 0 e 100;");
		System.out.println(soma101200 + " estão entre 101 e 200;");
		System.out.println(soma200 + " são maiores que 200;");
		sc.close();

	}

}
