package ExerciciosFDS.ingresso;

public class Ingresso {
	
	private String espetaculo;
	private float valor;
	private String data;
	private String hora;
	private String genêro;
	
	public Ingresso(String espetaculo, float valor, String data, String hora, String genêro) {
		super();
		this.espetaculo = espetaculo;
		this.valor = valor;
		this.data = data;
		this.hora = hora;
		this.genêro = genêro;
	}

	public String getEspetaculo() {
		return espetaculo;
	}

	public void setEspetaculo(String espetaculo) {
		this.espetaculo = espetaculo;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getGenêro() {
		return genêro;
	}

	public void setGenêro(String genêro) {
		this.genêro = genêro;
	}
	
	public void visualizar() {
	System.out.println("**********************************************");
	System.out.println("             A CASA DOS ARTISTAS              ");
	System.out.println("**********************************************");
	System.out.println("               I N G R E S S O                ");
	System.out.println("**********************************************");
	System.out.println("Espetáculo:          " + this.espetaculo);
	System.out.println("Data:                " + this.data);
	System.out.println("Hora:                " + this.hora);
	System.out.println("Cadeira:             " + this.genêro);
	System.out.println("Preço:            R$ " + this.valor);
	System.out.println("**********************************************");	
}

}
