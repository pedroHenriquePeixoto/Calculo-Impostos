package entitites;

public class Fisica extends Pessoa{
	private Double despesasSaude;
	
	public Fisica() {}

	public Fisica(String nome, Double renda, Double despesasSaude) {
		super(nome, renda);
		this.despesasSaude = despesasSaude;
	}

	public Double getDespesasSaude() {
		return despesasSaude;
	}

	public void setDespesasSaude(Double despesasSaude) {
		this.despesasSaude = despesasSaude;
	}

	@Override
	public double taxa() {
		double taxatemp=0;
		if(getRenda() < 20000) {
			if(despesasSaude>0) {
				taxatemp= (super.getRenda()*(0.15))-(despesasSaude*0.5);
			}
			else {
				taxatemp=(super.getRenda()*(0.15));
			}
		}
		else if(getRenda()>=20000) {
			if(despesasSaude>0) {
				taxatemp = (super.getRenda()*(0.25))-(despesasSaude*0.5);
			}
			else {
				taxatemp = (super.getRenda()*(0.25));
			}
		}
		return taxatemp;
	}
	

}
