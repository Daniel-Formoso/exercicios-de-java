/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor*/

package applicationEx2;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		double soma, media;

		System.out.print("Quantos números você que digitar? ");
		n = sc.nextInt();

		double[] vect = new double[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}

		soma = 0;
		for (int i = 0; i < vect.length; i++) {
			soma += vect[i];
		}

		media = soma / vect.length;

		System.out.print("Valores: ");

		for (int i = 0; i < vect.length; i++) {
			System.out.printf("%.2f ", vect[i]);
		}

		System.out.println("\nOs números digitados foram: " + soma);
		System.out.printf("A média desses números é %.2f%n", media);

		sc.close();
	}

}
