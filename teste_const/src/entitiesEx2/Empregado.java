package entitiesEx2;

public class Empregado {

	private String nome;
	private String sobrenome;
	private double salarioMensal;
	
	public Empregado(String nome, String sobrenome, double salarioMensal) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salarioMensal = salarioMensal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}
	
	public double calcularAumento() {
		return salarioMensal *  10 / 100;
		/*salarioMensal += 1.1;*/
	}
	
	public double calcularNovoSalario() {
		return calcularAumento() + salarioMensal;
	}
	
	public double calcularSalarioAnual() {
		return salarioMensal * 12;
	}
	
}
