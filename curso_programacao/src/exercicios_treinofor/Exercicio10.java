/*Crie um algoritmo leia um número do usuário e exiba a sua tabuada de
multiplicação.*/

package exercicios_treinofor;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			int produto = i * x;
			System.out.println(x + " X " + i + " = " + produto);

			
		}


		sc.close();

	}

}
