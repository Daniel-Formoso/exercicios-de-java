/*Leia o nome do usuário e escreva o nome dele na tela 10 vezes*/

package exercicios_treinofor;


public class Exercicio3 {

	public static void main(String[] args) {

		
		String nome = "Bia";
		System.out.print("Qual o seu nome? ");
		
		for (int i=1; i<=10; i++) {
			System.out.println(nome);
		}
		
				
	}

}
/*package exercicios_treinofor;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String nome = sc.next();
		System.out.print("Qual o seu nome? ");
		
		for (int i=1; i<=10; i++) {
			System.out.println(nome);
		}
		
		
		sc.close();
		
	}

}
*/