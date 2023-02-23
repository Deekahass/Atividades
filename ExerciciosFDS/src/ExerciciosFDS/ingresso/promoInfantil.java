package ExerciciosFDS.ingresso;

public class promoInfantil extends Ingresso {

	private String IngressoInfantil;

	public promoInfantil(String espetaculo, float valor, String data, String hora, String genêro,
			String ingressoInfantil) {
		super(espetaculo, valor, data, hora, genêro);
		IngressoInfantil = ingressoInfantil;
	}

	public String getIngressoInfantil() {
		return IngressoInfantil;
	}

	public void setIngressoInfantil(String ingressoInfantil) {
		IngressoInfantil = ingressoInfantil;
	}
    public void visualizar() {
    	super.visualizar();
	}
	
	

}
