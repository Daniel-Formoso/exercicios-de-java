package entitiesEx3;

public class Aluno {

	public String nome;
	public double n1;
	public double n2;
	public double n3;

	
	public double somaNota() {
		return n1 + n2 + n3;
	}
	
	public double pontosFaltantes() {
		if (somaNota() < 60.0) {
			return 60.0 - somaNota();
		}else {
			return 0;
		}
	}


}
