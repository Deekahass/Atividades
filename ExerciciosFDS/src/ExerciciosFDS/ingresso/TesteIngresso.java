package ExerciciosFDS.ingresso;

public class TesteIngresso {
	
	public static void main(String[] args) {
		Ingresso ingresso1 = new Ingresso("stand-up Thiago Ventura", 69.99f, "03 de março de 2023", "19h30", "comédia");
		
		ingresso1.visualizar();
		
		Ingresso ingresso2 = new Ingresso("Alice No Pais das Maravilhas", 80.0f, "04 de março de 2023", "16:00", "Infátil");
		
		ingresso2.visualizar();

	}
}
