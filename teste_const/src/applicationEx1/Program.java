/*Crie uma classe em Java chamada fatura para uma loja de
suprimentos de informática. A classe deve conter quatro variáveis – o número (String), a
descrição (String), a quantidade comprada de um item (int) e o preço por item
(double). A classe deve ter um construtor e um método get e set para cada variável de
instância. Além disso, forneça um método chamado getTotalFatura que calcula o valor
da fatura e depois retorna o valor como um double. Se o valor não for positivo, ele deve ser
configurado como 0. Se o preço por item não for positivo, ele deve ser configurado como 0.0.
Escreva um aplicativo de teste chamado FaturaTeste (em outro arquivo) que demonstra
as capacidades da classe Fatura. 
*/

package applicationEx1;

import java.util.Locale;
import java.util.Scanner;

import entitiesEx1.Fatura;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Número da fatura: ");
		int num = sc.nextInt();
		System.out.print("Descição: ");
		String descricao = sc.next();
		System.out.print("Quantidade comprada: ");
		int quantItens = sc.nextInt();
		System.out.print("Preço do item: ");
		double precoItens = sc.nextDouble();
		Fatura fat = new Fatura(num, descricao, quantItens, precoItens);
		
		System.out.println("Total: " +fat.getTotalFatura());
		
		
		sc.close();
		
	}

}
