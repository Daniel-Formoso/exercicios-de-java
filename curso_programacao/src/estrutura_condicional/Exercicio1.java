package estrutura_condicional;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int a;
		System.out.print("Digite um número: ");
		a = entrada.nextInt();
		
		if (a < 0) {
			System.out.println("Esse número é negativo.");
		}else {
			System.out.println("Ops! Esse número é positvo.");
		}
		
	}

}
