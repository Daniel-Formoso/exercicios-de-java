package estrutura_condicional;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		float x;
		System.out.print("Digite o valor de x: ");
		x = entrada.nextFloat();
		
		float y;
		System.out.print("Digite o valor de y: ");
		y = entrada.nextFloat();
		
		if (x == 0 && y == 0) {
			System.out.println("Origem.");
			
		}else if (x < -5 && x < 5 && y < -5 && y < 5) {
			System.out.println("Dentro do intervalo de contagem.");
			
		}else if (x == 0 && y != 0) {
			System.out.println("Eixo Y.");
			
		}else if (x != 0 && y == 0) {
			System.out.println("Eixo X.");
		
		}else if (x > 0 && y > 0) {
			System.out.println("Q1.");
		
		}else if (x < 0 && y > 0) {
			System.out.println("Q2.");
			
		}else if (x < 0 && y < 0) {
			System.out.println("Q3.");
		
		}else if (x > 0 && y < 0) {
			System.out.println("Q4.");
			
		}else {
			System.out.println("Fora do intervalo de contagem.");
		}
		

		
	}

}
