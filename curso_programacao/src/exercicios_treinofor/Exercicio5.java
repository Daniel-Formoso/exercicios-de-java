/*Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses
números.*/

package exercicios_treinofor;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int soma = 0;

		for (int i = 1; i < 10; i++) {
			int num = sc.nextInt();
			soma += i;
			
		}

		System.out.println("A soma dos números é: " + soma);

		sc.close();
	}

}
