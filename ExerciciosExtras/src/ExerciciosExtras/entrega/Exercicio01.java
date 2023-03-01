package ExerciciosExtras.entrega;

import java.util.Scanner;

public class Exercicio01 {
	
	 public static void main(String[] args) {

	       Scanner leia = new Scanner(System.in);
	       

	        int num1 = leia.nextInt();
	        int num2 = leia.nextInt();
	        int num3 = leia.nextInt();

	        if (num1 < num2 && num1 < num3) {
	           if(num2 < num3) {
	               System.out.println(num1);
	               System.out.println(num2);
	               System.out.println(num3);
	           } else {
	               System.out.println(num1);
	               System.out.println(num3);
	               System.out.println(num2);
	           }
	        } else if (num2 < num3) {
	            if (num3 < num1) {
	                System.out.println(num2);
	                System.out.println(num3);
	                System.out.println(num1);
	            } else {
	                System.out.println(num2);
	                System.out.println(num1);
	                System.out.println(num3);
	            }
	        } else{
	            if (num2 < 1) {
	                System.out.println(num3);
	                System.out.println(num2);
	                System.out.println(num1);
	            } else {
	                System.out.println(num3);
	                System.out.println(num1);
	                System.out.println(num2);
	            }
	        }

	        System.out.println();
	        System.out.println(num1);
	        System.out.println(num2);
	        System.out.println(num3);
	 }
}
