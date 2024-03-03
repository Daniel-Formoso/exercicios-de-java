/*Leia a idade de 20 pessoas e exiba a soma das idades*/

package exercicios_treinofor;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int soma = 0;

		for (int i = 0; i < 20; i++) {
			int idade = sc.nextInt();
			soma += idade;
		}

		System.out.println("A soma das idades é: " + soma);

		sc.close();
	}

}
