package ExerciciosFDS.Produto;

public class Produto {
	
	private String nomeDoJogo;
	private String plataforma;
	private String distribuidora;
	private float preco;
	private String genêro;

	public Produto(String nomeJogo, String plataforma, String distribuidora, float preco, String genêro) {
		super();
		this.nomeDoJogo = nomeJogo;
		this.plataforma = plataforma;
		this.distribuidora = distribuidora;
		this.preco = preco;
		this.genêro = genêro;
		
	}

	public String getNomeDoJogo() {
		return nomeDoJogo;
	}

	public void setNomeDoJogo(String nomeDoJogo) {
		this.nomeDoJogo = nomeDoJogo;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public String getDistribuidora() {
		return distribuidora;
	}

	public void setDistribuidora(String distribuidora) {
		this.distribuidora = distribuidora;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getLancamento() {
		return genêro;
	}

	public void setLancamento(String lancamento) {
		this.genêro = genêro;
	}
	
	public void visualizar() {
		System.out.println("**********************************************");
		System.out.println("*               GAMES DA HASS                *");
		System.out.println("**********************************************");
		System.out.println("    Jogo:          " + this.nomeDoJogo         );
		System.out.println("Distribuidora:     " + this.distribuidora      );
		System.out.println("Plataforma:        " + this.plataforma         );
		System.out.println("Genêro:            " + this.genêro             );
		System.out.println("Preço:             " + this.preco              );
		System.out.println("**********************************************");
	
	}
}
