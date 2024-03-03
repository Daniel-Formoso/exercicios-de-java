package while_repeticao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int senha;
		System.out.print("Digite a senha: ");
		senha = entrada.nextInt();

		while (senha != 2002) {
			System.out.println("Senha inválida.");
			senha = entrada.nextInt();
		}

		System.out.println("Acesso permitido.");

	}

}
