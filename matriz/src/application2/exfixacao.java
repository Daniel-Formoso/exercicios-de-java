package application2;

import java.util.Scanner;

public class exfixacao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escreva o primeiro número: ");
		int n = sc.nextInt();
		
		System.out.print("Escreva o segundo número: ");
		int m = sc.nextInt();
		
		//matriz
		int[][] mat = new int[m][n];
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int x = sc.nextInt();
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] == 0) {
					System.out.println("Posição " + i + "," + j + ":");
				}if (i )
			}
		}
		
		
		
		sc.close();
		
	}

}
