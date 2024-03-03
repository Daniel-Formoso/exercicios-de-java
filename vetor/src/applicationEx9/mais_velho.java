/*Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha. 
*/

package applicationEx9;

import java.util.Scanner;

public class mais_velho {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n, idade, maiorIdade, posicaoMaior;
		String nome;
		
		System.out.print("Quantas pessoas são? ");
		n = sc.nextInt();
		
		String[] vetorNome = new String[n];
		int[] vetorIdade = new int[n];
		
		for (int i = 0; i < vetorNome.length; i++) {
			System.out.println("Digite os dados da " + (i + 1) + "ª pessoa: ");
			System.out.print("Nome: ");
			vetorNome[i] = sc.next();
			System.out.print("Idade: ");
			vetorIdade[i] = sc.nextInt();
		}

		maiorIdade = vetorIdade[0];
		posicaoMaior = 0;
		
		for (int i = 0; i < vetorIdade.length; i++) {
			if (vetorIdade[i] > maiorIdade) {
				maiorIdade = vetorIdade[i];
				posicaoMaior = i;
			}
		}
		
		System.out.println("Pessoa mais velha = " + vetorNome[posicaoMaior]);
		
		sc.close();
		
	}

}
