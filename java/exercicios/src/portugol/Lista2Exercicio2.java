package portugol;

import java.util.Scanner;
//import java.util.*;
public class Lista2Exercicio2 {

	public static void main(String[] args) {
		/*
		 * 2) Elabore um sistema que leia as vari�veis C e N, respectivamente c�digo e n�mero de
	horas trabalhadas de um oper�rio. E calcule o sal�rio sabendo-se que ele ganha R$ 10,00
	por hora. Quando o n�mero de horas exceder a 50 calcule o excesso de pagamento
	armazenando-o na vari�vel E, caso contr�rio zerar tal vari�vel. A hora excedente de
	trabalho vale R$ 20,00. No final do processamento imprimir o sal�rio total e o sal�rio
	excedente.
	
	
	funcao inicio()
	{
		inteiro N, E
		cadeia C
		
		escreva("Digite o seu c�digo: ")
		leia(C)

		escreva("Digite o n�mero de horas trabalhadas: ")
		leia(N)

		limpa ()

		se(N>50){
			E = N - 50

			escreva("Identifica��o do funcion�rio: ",C ,"\n O sal�rio total �: ", ((50*10)+(E*20)) , "\n O sal�rio excedente �: ",E*20 )
			
		}

		senao {
			E = 0
			escreva("Identifica��o do funcion�rio: ",C ,"\n O sal�rio total �: ", ((50*10)+(E*20)) , "\n O sal�rio excedente �: ",E*20 )
		}

		
	}
		 */
		Scanner leia = new Scanner (System.in);
		
		int N, E, salarioTotal=0;
		String C = " ";
		
		System.out.print("Digite o seu c�digo: ");
		C=leia.next();
		

		System.out.print("Digite o n�mero de horas trabalhadas: ");
		N=leia.nextInt();
		

		

		if(N>50){
			E = N - 50;
			System.out.printf("Identifica��o do funcion�rio: %s",C);
			salarioTotal=((50*10)+(E*20));
			System.out.printf("\nO sal�rio total �: %d",salarioTotal );
			System.out.printf("\nO sal�rio excedente �: %d",E*20);
		}

		else {
			E = 0;
			System.out.printf("Identifica��o do funcion�rio: %s",C);
			salarioTotal=((50*10)+(E*20));
			System.out.printf("\nO sal�rio total �: %d", salarioTotal);
			System.out.printf("\nO sal�rio excedente �: %d",E*20);
		}
	
		leia.close();
		
	}
	

}
