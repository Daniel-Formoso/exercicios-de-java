/*Leia a idade de 20 pessoas e exiba quantas pessoas são maiores de idade*/

package exercicios_treinofor;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int maiorIdade = 0;

		int menorIdade = 0;

		for (int i = 0; i < 20; i++) {
			int idade = sc.nextInt();
			if (idade >= 18) {
				maiorIdade++;
			} else {
				menorIdade++;
			}		
		}
		
		System.out.println(maiorIdade + " são maiores de idade.");
		System.out.println(menorIdade + " são menores de idade.");
		
		sc.close();
	}

}
