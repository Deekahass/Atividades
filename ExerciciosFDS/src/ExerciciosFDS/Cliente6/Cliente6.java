package ExerciciosFDS.Cliente6;

public class Cliente6 {
	
	private String nome;
	private String RG;
	private int encomenda;
	private String local;
	private float valorDeEnvio ;
	private String tipo;
	
	
	public Cliente6(String nome, String rG, int encomenda, String local, float valorDeEnvio, String tipo) {
		super();
		this.nome = nome;
		RG = rG;
		this.encomenda = encomenda;
		this.local = local;
		this.valorDeEnvio = valorDeEnvio;
		this.tipo = tipo;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		RG = rG;
	}

	public int getEncomenda() {
		return encomenda;
	}

	public void setEncomenda(int encomenda) {
		this.encomenda = encomenda;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public float getHorario() {
		return valorDeEnvio;
	}

	public void setHorario(float horario) {
		this.valorDeEnvio = horario;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void getTipo(String tipo) {
		
	}

	public void visualizar() {
		
		String tipo = "";
		
		switch(this.tipo) {
		
		case 1 -> tipo = "Pessoa Física";
		case 2 -> tipo = "Pessoa júridica";
			
		}
		
		
		System.out.println("****************************************");
		System.out.println("            CORREIOS DA PRAÇA           ");
		System.out.println("****************************************");
		System.out.println("Nome:           " + this.nome);
		System.out.println("RG             "+ this.RG);
		System.out.println("encomenda:      " + this.encomenda);
		System.out.println("local:          " + this.local);
		System.out.println("valorDeEnvio:   " + this.valorDeEnvio);
		System.out.println("****************************************");
		
	}
}
