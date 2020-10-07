package portugol;

import java.util.Scanner;

public class Lista1Exercicio6 {

	public static void main(String[] args) {
		/*
		 * funcao inicio()
	{
		/*
		 * 6. Construa um programa em c que, 
		 * tendo como dados de entrada dois 
		 * pontos quaisquer no plano, P(x1, y1) 
		 * e P(x2, y2), escreva a distância entre 
		 * eles. 
		 

		 real x1 = 0, x2 = 0, y1 = 0, y2 = 0, resultadoX = 0, resultadoY = 0, resultadoPontos = 0, d =0 

		escreva("Digite o valor de X1: ")
		leia(x1)
		escreva("Digite o valor de Y1: ")
		leia(y1)
		escreva("Digite o valor de X2: ")
		leia(x2)
		escreva("Digite o valor de Y2: ")
		leia(y2)

		resultadoX = ( (x2 - x1) * (x2 - x1) )
		resultadoY = ( (y2 - y1) * (y2 - y1) )
		resultadoPontos = ( resultadoX + resultadoY )
		d = mat.raiz(resultadoPontos,2)

		escreva("O valor de d é" + d)

		
		}
		 */
		 Scanner leia = new Scanner (System.in);
		 
		 double x1 = 0, x2 = 0, y1 = 0, y2 = 0, resultadoX = 0, resultadoY = 0, resultadoPontos = 0, d =0 ;
	
		 System.out.print("Digite o valor de X1: ");
		 x1 = leia.nextDouble();
		 
		 System.out.print("Digite o valor de Y1: ");
		 y1 = leia.nextDouble();
		 
		 System.out.print("Digite o valor de X2: ");
		 x2 = leia.nextDouble();
		 
		 System.out.print("Digite o valor de Y2: ");
		 y2 = leia.nextDouble();
		 
		 
		 resultadoX = ( (x2 - x1) * (x2 - x1) );
		 resultadoY = ( (y2 - y1) * (y2 - y1) );
		 resultadoPontos = ( resultadoX + resultadoY );
		 d = Math.sqrt(resultadoPontos);
		 
		 System.out.printf("O valor de d é %f",d);
		 
		 
		 leia.close();
	}

}
