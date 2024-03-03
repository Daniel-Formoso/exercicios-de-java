package estrutura_condicional;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		double salario;
		System.out.print("Qual o seu salário? ");
		salario = entrada.nextDouble();
		
		double impostoRenda;
		double novoSalario;
		double taxaIsencao = 2000.00;
		double salarioImposto;
		
		if (salario >= 0.00 || salario <= 2000.00) {
			System.out.println("Isento.");
			
		}else if (salario == 2000.01 || salario <= 3000.00) {
			novoSalario = salario * (8 / 100);
			System.out.println("Desconto de 8%. O seu novo salário é de R$: " +novoSalario);
			
		}else if (salario == 3000.01 || salario <= 4500.00) {
			salarioImposto = salario - taxaIsencao;
			novoSalario = salarioImposto * (18 / 100);
			System.out.println("Desconto de 18%. O seu novo salário é de R$: " +novoSalario);
			
		}else if (salario > 4500.00) {
			salarioImposto = salario - taxaIsencao;
			novoSalario = salarioImposto * (28 / 100);
			System.out.println("Desconto de 28%. O seu novo salário é de R$: " +novoSalario);
		}
		
	}

}
