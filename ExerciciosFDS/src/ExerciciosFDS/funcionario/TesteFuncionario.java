package ExerciciosFDS.funcionario;

public class TesteFuncionario {
	
	public  static  void  principal ( String [] args ) {
		Funcionario  func1 = new  Funcionario ( "Pedro Henrique" , 2800.0f, "controlador de acesso" , "21h de extras" , "terça-feira" );
		
		func1.visualizar ();
		
		Funcionario  func2 = new  Funcionario ( "Julianna" , 3600.0f, "secretária"  , "10h de extras" , "sabádo" );
		
		func2.visualizar ();
	}
}
