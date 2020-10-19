package lista1_portugol;

import java.util.Scanner;

public class Lista1Exercicio4 {

	public static void main(String[] args) {
		/*
		 * funcao inicio()
	{
		
		/*
		 * 4. Escreva um sistema que leia três números inteiros e positivos (A, B, C) 
		 * e calcule a seguinte expressão:
		 

		inteiro A = 0,B = 0,C = 0,R = 0,S = 0,D = 0

		escreva("Digite o valor de A: ")
		leia(A)
		escreva("Digite o valor de B: ")
		leia(B)
		escreva("Digite o valor de C: ")
		leia(C)

		R = ( (A + B) * ( A + B) )
		S = ( (B + C) * ( B + C) )
		D = (R + S)/ 2

		escreva("O valor de D é:" + D)

		

		 
	}
		 */
		
		int A = 0, B = 0, C = 0, R = 0, S = 0, D = 0;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite o valor de A: ");
		A=leia.nextInt();
		System.out.print("Digite o valor de B: ");
		B=leia.nextInt();
		System.out.print("Digite o valor de C: ");
		C=leia.nextInt();
		
		R = ( (A + B) * ( A + B) );
		S = ( (B + C) * ( B + C) );
		D = ( (R + S)/ 2);

		System.out.printf("O valor de D é: " + D);
		leia.close();
		
	}

}
