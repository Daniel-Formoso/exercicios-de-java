/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero).*/

package applicationEx5;

import java.util.Locale;
import java.util.Scanner;

public class maior_posicao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, posicaoMaior;
		double maior;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		double[] vect = new double[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}

		maior = vect[0];
		posicaoMaior = 0;
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] > maior) {
				maior = vect[i];
				posicaoMaior = 1;
			}
		}
		
		System.out.printf("Maior valor = %.2f%n", maior);
		System.out.printf("Posição maior valor = %d", posicaoMaior);
		
		sc.close();

	}

}
