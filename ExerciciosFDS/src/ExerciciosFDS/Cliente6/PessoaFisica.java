package ExerciciosFDS.Cliente6;

public class PessoaFisica extends Cliente6 {
	
	private String cpf;


	
	public PessoaFisica(String nome, String rG, int encomenda, String local, float valorDeEnvio, String tipo,
			String cpf) {
		super(nome, rG, encomenda, local, valorDeEnvio, tipo);
		this.cpf = cpf;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
    
	public void visualizar() {
        super.visualizar();
        System.out.println(" , " + cpf);
	}
}
