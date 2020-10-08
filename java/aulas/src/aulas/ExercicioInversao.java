package aulas;

import java.util.Scanner;

public class ExercicioInversao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
		int a=0, b=0, c=0;
		
		System.out.println("Leia A: ");
		a = leia.nextInt();
		
		System.out.println("Leia B: ");
		b = leia.nextInt();
		System.out.println("\n");
		System.out.printf("Valores antes da inversão A: %d e B: %d",a,b);
		/*
		 *c = a;
		  a = b;
		  b = c; 
		 */
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("\n");
		
		System.out.printf("Valores após da inversão A: %d e B: %d",a,b);
		
		leia.close();
		
	}

}
