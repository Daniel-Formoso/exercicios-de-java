package applicationEx2;

import java.util.Locale;
import java.util.Scanner;
import entitiesEx2.Funcionario;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Nome: ");
		funcionario.nome = sc.nextLine();
	
		System.out.print("Salário Bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		
		System.out.print("Imposto: ");
		funcionario.imposto = sc.nextDouble();
		
		System.out.println("Funcionário: " +funcionario);
		
		System.out.print("Qual o aumento? ");
		double porcentagem = sc.nextDouble();
		funcionario.aumentoSalarial(porcentagem);
		
		System.out.println("Agora: " +funcionario);
		
		
		sc.close();
		
	}

}
