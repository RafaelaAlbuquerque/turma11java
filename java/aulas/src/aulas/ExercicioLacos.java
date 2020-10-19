package aulas;

import java.util.Scanner;

public class ExercicioLacos {

	public static void main(String[] args) {
	
	//LAÇO QUE MOSTRE NA TELA UMA SEQUENCIA DE NUMEROS DE 1 A 1000

	Scanner leia= new Scanner (System.in);
	/*
	 * for(int x=0;x<=1000;x++) {
		System.out.println(x);
	}
	
	
	 */
	
	
	// Mesmo com o while:
	/*
	 * int x=0;
	while(x<=1000) {
		System.out.println(x);
		x++;
	}
	 */
	
	//LAÇO QUE MOSTRE NA TELA UMA SEQUENCIA DE NUMEROS ATE QUANDO O USUARIO DECIDIR
	/*
	 *	int x=0;
	char continua;
	do {
		System.out.println(x);
		x++;
		System.out.print("Continua S - Sim ou N - Não: ");
		continua = leia.next().toUpperCase().charAt(0);
	} while (continua=='S'); 
	 */

	 
	   int x=0;
	   char continua=' ';
	   
	   System.out.print("Iniciar o programa S - Sim ou N - Não: ");
	   continua = leia.next().toUpperCase().charAt(0);
	   
	   while(continua=='S'){
		   System.out.println(x);
		   System.out.print("Continua S - Sim ou N - Não: ");
		   continua = leia.next().toUpperCase().charAt(0);
		   x++;
	   }

	leia.close();
	
	
	}
}
