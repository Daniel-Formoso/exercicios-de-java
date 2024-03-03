import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		//Exercio a
		
		Scanner entrada = new Scanner(System.in);
		
		int nfunc;
		System.out.print("Informe o número do funcionário: ");
		nfunc = entrada.nextInt();
		
		int nhtrab;
		System.out.print("Informe o número de horas trabalhadas: ");
		nhtrab = entrada.nextInt();
		
		double vrh;
		System.out.print("Informe o salário: ");
		vrh = entrada.nextDouble();
		
		double salario = vrh * nhtrab;
		
		System.out.printf("O funcionário de número %d recebe R$:%.2f\n", nfunc, salario);
		
		//Exercicio b
		
		int nfunc2;
		nfunc2 = entrada.nextInt();
		
		int nhtrab2;
		nhtrab2 =  entrada.nextInt();
		
		double vrh2;
		vrh2 = entrada.nextDouble();
		
		double salario2 =  vrh2 * nhtrab2;
		
		System.out.println("O funcionário de número " +nfunc2+ " recebe R$: " +salario2);
	}

}
