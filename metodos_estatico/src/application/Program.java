package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conversor;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conversor conversor = new Conversor();
		
		System.out.print("Preço do dólar: ");
		conversor.precoDolar = sc.nextDouble();
		
		System.out.print("Quer comprar quantos dólares? ");
		double dolaresComprar = sc.nextDouble();
		
		double valorReal = conversor.valorReal(dolaresComprar);
		
		System.out.printf("Você vai pagar em reais: %.2f%n", valorReal);
		
		sc.close();
		
	}

}
