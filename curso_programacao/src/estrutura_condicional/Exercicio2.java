package estrutura_condicional;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int a;
		System.out.print("Digite um número: ");
		a = entrada.nextInt();
		
		if (a % 2 == 0) {
			System.out.println("Esse número é PAR.");
		}else {
			System.out.println("Esse número é ÍMPAR.");
		}
	}

}
