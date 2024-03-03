package applicationEx1;

import java.util.Locale;
import java.util.Scanner;
import entitiesEx1.Retangulo;

public class Program1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Retangulo ret = new Retangulo();
		
		System.out.print("Digite a largura do retângulo: ");
		ret.largura = sc.nextDouble();
		
		System.out.print("Digite a altura do retângulo: ");
		ret.altura = sc.nextDouble();
		
		System.out.printf("ÁREA: %.2f%n", ret.area());
		System.out.printf("PERÍMETRO: %.2f%n", ret.perimetro());
		System.out.printf("DIAGONAL: %.2f%n", ret.diagonal());
		
		sc.close();
		
	}

}
