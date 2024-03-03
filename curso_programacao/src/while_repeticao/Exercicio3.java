package while_repeticao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Qual combustível você quer? 1-Álcool; 2-Gasolina; 3-Diesel; 4-Fim; ");
		
		int ndig;
		System.out.println();
		ndig = entrada.nextInt();
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
				
		while (ndig != 4) {
			if (ndig == 1) {
				alcool += ndig;
			}else if (ndig == 2) {
				gasolina += ndig;
			}else if (ndig == 3) {
				diesel += ndig;
			}
			
			ndig = entrada.nextInt();

		}
		
		System.out.println("Muito obrigado!");
		System.out.println("Álcool: " +alcool);
		System.out.println("Gasolina: " +gasolina);
		System.out.println("Diesel: " +diesel);
		entrada.close();
		
	}

}
