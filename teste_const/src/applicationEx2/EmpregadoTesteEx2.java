/**Crie uma classe em Java chamada Empregado que inclui três partes de
informações como variáveis de instância – nome (String), sobrenome (String) e um
salário mensal (double). A classe deve ter um construtor, métodos get e set para cada
variável de instância. Escreva um aplicativo de teste chamado EmpregadoTeste que cria
dois objetos Empregado e exibe o salário anula de cada objeto. Então dê a cada Empregado
um aumento de 10% e exiba novamente o salário anual de cada Empregado. */

package applicationEx2;

import java.util.Locale;
import java.util.Scanner;

import entitiesEx2.Empregado;

public class EmpregadoTesteEx2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Funcionário: ");
		System.out.print("Nome: ");
		String nome = sc.next();
		System.out.print("Sobrenome: ");
		String sobrenome = sc.next();
		System.out.print("Salário: ");
		double salarioMensal = sc.nextDouble();
		
		Empregado emp = new Empregado(nome, sobrenome, salarioMensal);
		
		
		System.out.printf("O valor do aumento é de %.2f e o novo salário é de %.2f%n", emp.calcularAumento(), emp.calcularNovoSalario());
		System.out.printf("O salário anual do funcionário %s é de %.2f%n", emp.getNome(), emp.calcularSalarioAnual());
		
		sc.close();
		
	}

}
