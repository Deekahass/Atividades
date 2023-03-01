package ExerciciosExtras.entrega;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int codigoDdd = leia.nextInt();

        switch (codigoDdd){
            case 61:
                System.out.print("Brasilia");
                break;
            case 71:
                System.out.print("Salvador");
                break;
            case 11:
                System.out.print("Sao Paulo");
                break;
            case 21:
                System.out.print("Rio de Janeiro");
                break;
            case 32:
                System.out.print("Juiz de Fora");
                break;
            case 19:
                System.out.print("Campinas");
                break;
            case 27:
                System.out.print("Vitoria");
                break;
            case 31:
                System.out.print("Belo Horizonte");
                break;
            default:
                System.out.print("DDD não cadastrado");
        }
	}
}
