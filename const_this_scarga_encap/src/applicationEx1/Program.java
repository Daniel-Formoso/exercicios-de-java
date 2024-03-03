package applicationEx1;

import java.util.Locale;
import java.util.Scanner;

import entitiesEx1.Conta;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
	
		System.out.print("Número da conta: ");
		int numConta = sc.nextInt();
		System.out.print("Nome: ");
		sc.nextLine();
		String nomeCliente = sc.nextLine();
		System.out.print("Possui depósito inicial? (s/n)");
		char resp = sc.next().charAt(0);
		if (resp == 's') {
			System.out.print("Informe o depósito inicial: ");
			double depositoIncial = sc.nextDouble();
			conta = new Conta(numConta, nomeCliente, depositoIncial);
		}else {
			conta = new Conta(numConta, nomeCliente);
		}
		
		System.out.println();	
		System.out.println("Informações da conta: ");	
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Qual o valor do depósito? ");	
		double valorDeposito = sc.nextDouble();
		conta.deposito(valorDeposito);
		System.out.println("Informações da conta: ");	
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Qual o valor do saque? ");
		double valorSaque = sc.nextDouble();
		conta.saque(valorSaque);
		System.out.println("Informações da conta: ");	
		System.out.println(conta);
		
		sc.close();
		
	}

}
