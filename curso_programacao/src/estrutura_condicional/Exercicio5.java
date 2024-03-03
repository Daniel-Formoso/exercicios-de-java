package estrutura_condicional;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		double cachorroQuente = 4.00;
		double xSalada = 4.50;
		double xBacon = 5.00;
		double torradaSimples = 2.00;	
		double refrigerante = 1.50;
		
		int codigo;
		System.out.print("Informe o código de um produto 1, 2, 3, 4 ou 5: ");
		codigo = entrada.nextInt();
		
		double quantItens;
		System.out.print("Informe a quantidade de itens: ");
		quantItens = entrada.nextDouble();
			
		double valorPg = 0;
		
		
		if (codigo == 1) {
			valorPg = quantItens * cachorroQuente;
			System.out.println("Você escolheu Cachorro Quente.");
			
		}else if (codigo == 2) {
			valorPg = quantItens * xSalada;
			System.out.println("Você escolheu X-Salada.");

		}else if (codigo == 3) {
			valorPg = quantItens * xBacon;
			System.out.println("Você escolheu X-Bacon.");
			
		}else if (codigo == 4) {
			valorPg = quantItens * torradaSimples;
			System.out.println("Você escolheu Torrada Simples.");
			
		}else if (codigo == 5) {
			valorPg = quantItens * refrigerante;
			System.out.println("Você escolheu Refrigerante.");

			
		}
		
		System.out.println("O item escolhido foi " +codigo+ " e o valor foi de " +valorPg);
	}

}
