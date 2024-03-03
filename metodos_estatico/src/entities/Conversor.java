package entities;

public class Conversor {

	public static double precoDolar;
	public static double IOF = 0.06;
	
	public static double valorReal(double quantia) {
		return quantia * precoDolar * (1.0 + IOF);
	}
	
}
