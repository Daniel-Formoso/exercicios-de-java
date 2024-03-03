package estrutura_condicional;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int horaInicial;
		System.out.print("Que horas começou o jogo? ");
		horaInicial = entrada.nextInt();
		
		int horaFinal;
		System.out.print("Que horas terminou o jogo? ");
		horaFinal = entrada.nextInt();
		
		int duracao;
		
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O jogo durou " +duracao+ " hora(s)");
		
	}

}
