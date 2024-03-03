/*Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova*/

package exercicios_treinofor;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
			
		String nomeMaisNova = "";
		
		int idadeMaisNova = 0;
		
		for (int i = 0; i < 2; i++) {
			System.out.print("Nome: ");
			String nome = sc.next();
			
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			
			if (idade < 18) {
				nomeMaisNova = nome;
				idadeMaisNova = idade;
			}
		}
		
		System.out.println("A mais novo é: " + nomeMaisNova + " com " + idadeMaisNova + " anos.");
		sc.close();
		
	}

}
