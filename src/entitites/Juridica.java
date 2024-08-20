package entitites;

public class Juridica extends Pessoa {
	private Integer n_funcionarios;
	
	public Juridica() {}

	public Juridica(String nome, Double renda, Integer n_funcionarios) {
		super(nome, renda);
		this.n_funcionarios = n_funcionarios;
	}

	public Integer getN_funcionarios() {
		return n_funcionarios;
	}

	public void setN_funcionarios(Integer n_funcionarios) {
		this.n_funcionarios = n_funcionarios;
	}

	@Override
	public double taxa() {
		double temp;
		if(n_funcionarios>10) {
			temp = getRenda()*0.14;
		}
		else {
			temp = getRenda()*0.16;
		}
		return temp;
	}

}
