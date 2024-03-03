/*Leia a idade de 20 pessoas e exiba a média das idades. */

package exercicios_treinofor;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = 20;

		int soma = 0;

		int media = 0;

		for (int i = 0; i < x; i++) {
			int idade = sc.nextInt();
			soma += idade;
			media = soma / x;
		}

		System.out.println("A média das idades é: " + media);

		sc.close();

	}

}
