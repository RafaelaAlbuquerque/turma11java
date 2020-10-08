package aulas;

import java.util.Scanner;

public class ExercicioTabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		
		int tab = 0;
		
		System.out.print("Digite qual tabuada você quer: ");
		tab= leia.nextInt();
		System.out.println("\n");
		System.out.printf("Tabuada do %d:", tab);
		System.out.println("\n");
		
		for(int x=1;x<=10;x++) {
			
			   System.out.printf("%d x %d = %d",tab,x, (tab*x));
			   System.out.println();
		    }
		
		/*
		 * for(int y=1;y<=10;y++) {
			
			System.out.printf("Tabula %d",y);
			System.out.println();
			System.out.println();
			for(int x=1;x<=10;x++) {
				
			   System.out.printf("%d x %d = %d",y,x, (y*x));
			   System.out.println();
		    }
			System.out.println();
		}
		
		 */
		
		leia.close();
	}

}
