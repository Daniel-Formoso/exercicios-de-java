/*Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada. */

package applicationEx7;

import java.util.Locale;
import java.util.Scanner;

public class abaixo_da_media {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		double mediaRes;
		double somaRes;

		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();

		double[] vetor = new double[n];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
		}

		somaRes = 0;
		for (int i = 0; i < vetor.length; i++) {
			somaRes += vetor[i];

		}

		// media
		
		mediaRes = 0;
		for (int i = 0; i < vetor.length; i++) {
			mediaRes = somaRes / vetor.length;
		}
		
		System.out.printf("Média do vetor = %.3f%n", mediaRes);
		System.out.println("Elementos abaixo da média = ");
		
		for(int i = 0; i < vetor.length; i++) {
			if (vetor[i] < mediaRes) {
				System.out.printf("%.2f\n ", vetor[i]);
			}
		}

		
		
		sc.close();
	}

}
