package estrutura_condicional;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int a;
		System.out.print("Digite o número que quer saber se é múltiplos: ");
		a = entrada.nextInt();
		
		int b;
		System.out.print("Digite o segundo número: ");
		b = entrada .nextInt();
		
		
		if (a % b == 0 || b % a == 0 ) {
			System.out.println("Esses números são múltiplos.");
		}else {
			System.out.println("Esses números NÃO são múltiplos. ");
		}
	}
}