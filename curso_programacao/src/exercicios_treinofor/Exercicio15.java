/*Escreva um algoritmo que leia uma sequência de números do usuário e realize a
soma desses números. Encerre a execução quando um número negativo for digitado.*/

package exercicios_treinofor;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
		int soma = 0;
		
		System.out.print("Quando quiser parar de digitar digite um número negativo. ");
		
		/*Esse for com dois (;;) significa um loop infinito igual um while(true)
		 ele ira rpetir ate que a situação do break ocorra*/
		
		for (;;) {
			int x = sc.nextInt();
			if (x <  0) {
				break;
			}
			
			soma+= x;
			
		}
		
		System.out.println("A soma dos números digitados foi " + soma);
		
		sc.close();
		
	}

}
