import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int cdgp1;
		System.out.print("Informe o código da peça 1: ");
		cdgp1 = entrada.nextInt();
		
		int np1;
		System.out.print("Insira o número total de peças: ");
		np1 = entrada.nextInt();
		
		double vup1;
		System.out.print("Insira o valor da peça 1: ");
		vup1 = entrada.nextDouble();
		
		int cdgp2;
		System.out.print("Informe o códi02go da peça 2: ");
		cdgp2 = entrada.nextInt();
		
		int np2;
		System.out.print("Insira o número total de peças: ");
		np2 = entrada.nextInt();
		
		double vup2;
		System.out.print("Insira o valor da peça 2: ");
		vup2 = entrada.nextDouble();
		
		double vtp1 = np1 * vup1;
		
		double vtp2 = np2 * vup1;
		
		double vtp1e2 = vtp1 + vtp2;
		
		System.out.println("Você comprou " +np1+ " da peça " +cdgp1);
		System.out.println("Você comprou " +np2+ " da peça " +cdgp2);
		System.out.println("O valor total em peças é de: " +vtp1e2);
		
	}

}
