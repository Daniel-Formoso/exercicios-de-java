/*Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NUMERO PAR"*/

package applicationEx8;

import java.util.Locale;
import java.util.Scanner;

public class media_pares {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, somaPares, nPares;
		double mediaPares;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número inteiro: ");
			vetor[i] = sc.nextInt();
		}
		
		//soma pares
		somaPares = 0;
		nPares = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				somaPares += vetor[i];
				nPares++;
			}
		}
		
		if (nPares == 0) {
			System.out.println("Nenhum número par.");
		}else {
			mediaPares = somaPares / nPares;
			System.out.printf("Média dos pares = %.1f\n", mediaPares);
		}

		sc.close();
	}

}
