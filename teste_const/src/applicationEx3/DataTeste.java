/*Crie uma classe em Java chamada Data que inclui três informações
como variáveis de instância – mês (int), dia (int) e ano (int). A classe deve ter métodos
get e set para cada variável e um construtor que inicializa as variáveis e assume que os valores
fornecidos são corretos. Forneça um método displayData que exibe o dia, o mês e o ano
separados por barras normais ( / ). Escreva um aplicativo de teste chamado DataTeste que
demonstra as capacidades da classe Data. */

package applicationEx3;

import java.util.Scanner;

import entitiesEx3.Data;

public class DataTeste {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dia: ");
		int dia = sc.nextInt();
		System.out.print("Mês: ");
		int mes = sc.nextInt();
		System.out.print("Ano: ");
		int ano = sc.nextInt();
		Data data = new Data(mes, dia, ano);
		
	    System.out.print("Nova data: ");
	    data.displayData();
		
	    sc.close();
		
	}

}
