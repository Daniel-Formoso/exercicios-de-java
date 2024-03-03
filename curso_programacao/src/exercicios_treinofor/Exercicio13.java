/*Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e
100.*/

package exercicios_treinofor;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		
		for (int i = 1; i <= 20; i++) {
			int x = sc.nextInt();
			if (x > 0 && x < 100) {
				soma++;
			}
		}
		
		System.out.println("Você digitou " + soma + " entre 0 e 100.");
		
		sc.close();
		
	}

}
