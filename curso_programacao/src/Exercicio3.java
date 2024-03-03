import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		//Exercicio a
		
		Scanner entrada = new Scanner(System.in);
		
		int a;
		System.out.print("Informe o valor de A: ");
		a = entrada.nextInt();
		
		int b;
		System.out.print("Informe o valor de B: ");
		b = entrada.nextInt();
		
		int c;
		System.out.print("Informe o valor de C: ");
		c = entrada.nextInt();
		
		int d;
		System.out.print("Informe o valor de D: ");
		d = entrada.nextInt();
		
		int dif = a * b - c * d;
		
		System.out.println("O valor da diferença é: " +dif);
		
		//Exercicio b
		
		int a2;
		a2 = entrada.nextInt();
		
		int b2;
		b2 = entrada.nextInt();
		
		int c2;
		c2 = entrada.nextInt();
		
		int d2;
		d2 = entrada.nextInt();
		
		int dif2 = a2 * b2 - c2 * d2;
		
		System.out.println("Diferença2: " +dif2);
		
	}

}
