package lista1_portugol;

import java.util.Scanner;

public class Lista1Exercicio7 {

	public static void main(String[] args) {
		/*
		 *funcao inicio()
	{
		inteiro
		a , b , c , d , E , f  , x , y
		
		escreva (" informe o Valor de A : ")
		leia (a)
		pula()
		escreva (" informe o Valor de B : ")
		leia (b)
		pula()
		escreva (" informe o Valor de C : ")
		leia (c)
		pula()
		escreva (" informe o Valor de D : ")
		leia (d)
		pula()
		escreva (" informe o Valor de E : ")
		leia (E)
		pula()
		escreva (" informe o Valor de F : ")
		leia (f)
		pula()
		 x = ( ( (c*E) - (b*f) ) / ( (a*E) - (b*d) ) )
		 y =  ( ( (a*f) - (c*d) ) / ( (a*E) - (b*d) ) )
		 escreva (" O valor de X � : " , x )
		 pula()
		 escreva (" O valor de Y � : " , y)
	}
		 */

		Scanner leia = new Scanner(System.in); 
		
		int	a , b , c , d , E , f; 
		double x=0 , y=0;
		
		System.out.print("Digite o Valor de A : ");
		a = leia.nextInt();
		
		System.out.print("Digite o Valor de B : ");
		b = leia.nextInt();
		
		System.out.print("Digite o Valor de C : ");
		c = leia.nextInt();
		
		System.out.print("Digite o Valor de D : ");
		d = leia.nextInt();
		
		System.out.print("Digite o Valor de E : ");
		E = leia.nextInt();
		
		System.out.print("Digite o Valor de F : ");
		f = leia.nextInt();
		
		x = ( ( (c*E) - (b*f) ) / ( (a*E) - (b*d) ) );
		y = ( ( (a*f) - (c*d) ) / ( (a*E) - (b*d) ) );
		
		System.out.printf("O valor de X � : %.2f" , x);
		System.out.printf("\nO valor de Y � : %.2f" , y);
		leia.close();
	}

}
