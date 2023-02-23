package ExerciciosFDS.funcionario;

public class Funcionario {
	
	private String nome;
	private float salario;
	private String horasExtras;
	private String diaDefolga;
	private String cargo;
	
	
    public Funcionario(String nome, float salario, String horasExtras, String diaDefolga, String cargo) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.horasExtras = horasExtras;
		this.diaDefolga = diaDefolga;
		this.cargo = cargo;
		
		
		
    }


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public float getSalario() {
		return salario;
	}


	public void setSalario(float salario) {
		this.salario = salario;
	}


	public String getHorasExtras() {
		return horasExtras;
	}


	public void setHorasExtras(String horasExtras) {
		this.horasExtras = horasExtras;
	}


	public String getDiaDefolga() {
		return diaDefolga;
	}


	public void setDiaDefolga(String diaDefolga) {
		this.diaDefolga = diaDefolga;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
		
	}
	

	public void visualizar() {
		System.out.println("****************************************************");
		System.out.println("*            ARMAZÉM DO GEPPETTO                   *");
		System.out.println("****************************************************");
		System.out.println("Nome do funcionário:    "    + this.nome             );
		System.out.println("cargo:            " + this.cargo);
		System.out.println("horasExtras: " + this.horasExtras);
		System.out.println("Salário: " + this.salario);
		System.out.println("diaDeFolga: " + this.diaDefolga);
		System.out.println("****************************************************");
		
	}
}
    
