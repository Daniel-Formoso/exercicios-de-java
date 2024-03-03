import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		//Exercicio a
	
		Scanner entrada = new Scanner(System.in);
		
		int a;
		System.out.print("Digite o primeiro número: ");
		a = entrada.nextInt();
		
		int b;
		System.out.print("Digite o segundo número: ");
		b = entrada.nextInt();
		
		int c = a + b;
		
		System.out.println("A soma de " +a+ " + " +b+ " é igual a " +c);
		
		//Exercicio b
		
		int a2;
		a2 = entrada.nextInt();
		
		int b2;
		b2 = entrada.nextInt();
		
		int c2 = a2 + b2;
		
		System.out.println("Soma: " +c2);
		
	}

}
