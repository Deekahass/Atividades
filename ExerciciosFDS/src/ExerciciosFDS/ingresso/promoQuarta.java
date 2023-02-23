package ExerciciosFDS.ingresso;

public class promoQuarta extends Ingresso {
	
	private String quartaPromo;

	public promoQuarta(String espetaculo, float valor, String data, String hora, String genêro, String quartaPromo) {
		super(espetaculo, valor, data, hora, genêro);
		this.quartaPromo = quartaPromo;
	}

	public String getQuartaPromo() {
		return quartaPromo;
	}

	public void setQuartaPromo(String quartaPromo) {
		this.quartaPromo = quartaPromo;
	}
	public void visualizar() {
		 super.visualizar();
	}	 

}
