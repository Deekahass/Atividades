package ExerciciosFDS.Cliente6;

public class PessoaJuridica extends Cliente6{

	private String CNPJ ;


	public PessoaJuridica(String nome, String rG, int encomenda, String local, float valorDeEnvio, String tipo,
			String cNPJ) {
		super(nome, rG, encomenda, local, valorDeEnvio, tipo);
		CNPJ = cNPJ;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public void visualizar() {
		super.visualizar();
		
	}
	

}
