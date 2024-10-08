package entitiesEx1;

public class Fatura {

	private int num;
	private String descricao;
	private int quantItens;
	private double precoItens;

	public Fatura(int num, String descricao, int quantItens, double precoItens) {
		this.num = num;
		this.descricao = descricao;
		this.quantItens = quantItens;
		this.precoItens = precoItens;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantItens() {
		return quantItens;
	}

	public void setQuantItens(int quantItens) {
		if (quantItens >= 0) {
			this.quantItens = quantItens;
		}else {
			this.quantItens = 0;
		}
	}

	public double getPrecoItens() {
		return precoItens;
	}

	public void setPrecoItens(double precoItens) {
		if (precoItens >= 0.0) {
			this.precoItens = precoItens;
		}else {
			this.precoItens = 0.0;
		}
	}
	
	public double getTotalFatura() {
		return quantItens * precoItens;
		}
	
}

