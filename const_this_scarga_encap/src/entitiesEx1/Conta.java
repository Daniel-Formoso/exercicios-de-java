package entitiesEx1;

public class Conta {

	private int numConta;
	private String nomeCliente;
	private double saldo;

	public Conta(int numConta, String nomeCliente) {
		this.numConta = numConta;
		this.nomeCliente = nomeCliente;
	}

	public Conta(int numConta, String nomeCliente, double depositoInicial) {
		this.numConta = numConta;
		this.nomeCliente = nomeCliente;
		deposito(depositoInicial);
	}

	public int getNumConta() {
		return numConta;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public double deposito(double quantia) {
		return saldo += quantia;
	}

	public double saque(double quantia) {
		return saldo -= quantia + 5.0;
	}

	public String toString() {
		return "Conta "
				+ numConta
				+ ", Nome: "
				+ nomeCliente
				+ ", saldo: R$: "
				+ String.format("%.2f", saldo);
	}

}
