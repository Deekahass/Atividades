package ExerciciosFDS.Produto;

public class TesteProduto {
	
public static void main(String[] args) {
		
		Produto jogo = new Produto("Fortnite", "Nintendo Switch", "Sony", 160.0f, "tiro em terceira pessoa");
		
		jogo.visualizar();
		
		Produto jogoNovo = new Produto("God of War Ragnarök", "Playstation 4", "Sony", 110.0f, "Ação e Aventura");
		
		jogoNovo.visualizar();
		
    }
}
