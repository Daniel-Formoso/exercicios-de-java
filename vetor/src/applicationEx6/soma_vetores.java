/*Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
o vetor C gerado. 
*/

package applicationEx6;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetores {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;

		System.out.print("Quantos valores cada vetor vai receber? ");
		n = sc.nextInt();

		double[] vetorA = new double[n];
		double[] vetorB = new double[n];
		double[] resSoma = new double[n];
		
		System.out.println("Digite os valores do vetor A: ");

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Valor " + (i + 1) + " :");
			vetorA[i] = sc.nextDouble();
		}

		System.out.println("Digite os valores do vetor B: ");

		for (int i = 0; i < vetorB.length; i++) {
			System.out.print("Valor " + (i + 1) + " :");
			vetorB[i] = sc.nextDouble();
		}

		// soma dos vetores
		
		
		for(int i =0; i < vetorA.length; i++) {
			resSoma[i] = vetorA[i] + vetorB[i];
		}
		
		System.out.println("Resultado da soma: ");
		
		for (int i = 0; i < resSoma.length; i++) {
			System.out.println(resSoma[i]);
		}
		
		sc.close();
		
	}

}
