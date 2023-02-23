package ExerciciosFDS.Cliente6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteCliente6 {
	
	Scanner leia = new Scanner(System.in);

    List<Cliente6> clienteList = new ArrayList<>();

    String cpf; 
    String cnpj;
    String resultado;
    
    
    
    do {
        System.out.println("Nome: ");
        leia.skip("\\R?");
        String nome = leia.nextLine();

        System.out.println("Telefone: ");
        leia.skip("\\R?");
        String telefone = leia.nextLine();

        System.out.println("Idade: ");
        leia.skip("\\R?");
        Integer idade = leia.nextInt();

        System.out.println("Email: ");
        leia.skip("\\R?");
        String email = leia.nextLine();

        System.out.println("Endereço: ");
        leia.skip("\\R?");
        String endereco = leia.nextLine();

        System.out.println("Tipo: ");
        int tipo = leia.nextInt();

        switch (tipo){
            case 1 ->{
                System.out.println("CPF: ");
                leia.skip("\\R?");
                cpf = leia.nextLine();
                clienteList.add(new PessoaFisica(nome, telefone, idade, email, tipo, endereco, cpf));
            }
            case 2 ->{
                System.out.println("CNPJ: ");
                leia.skip("\\R?");
                cnpj = leia.nextLine();
                clienteList.add(new PessoaJuridica(nome, telefone, idade, email, tipo, endereco, cnpj));
            }
        }

        System.out.println("Deseja digitar mais um cliente: ");
        leia.skip("\\R?");
        resultado = leia.nextLine();

    }while (resposta.equalsIgnoreCase("s"));

    for (Cliente6 cliente : clienteList) {
        cliente.visualizar();
		
    }
		
   }
}
	
	
