import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
				
		Scanner entrada = new Scanner(System.in);
		
		//Exercício a
		
		double raio;
		double area;
		System.out.print("Informe o valor do raio: ");
		raio = entrada.nextDouble();
		
		area = raio * raio * 3.14159;
		
		System.out.printf("A área deste círculo vale: %.4f \n", area);
		
		//Exercício b
		
		int raio2;
		double area2;
		
		raio2 = entrada.nextInt();
		
		area2 = raio2 * raio2 * 3.14159;
		
		System.out.printf("Raio2: %.4f \n", area2);
		
	}

}
