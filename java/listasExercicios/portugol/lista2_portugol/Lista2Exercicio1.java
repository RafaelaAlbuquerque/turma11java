package lista2_portugol;

import java.util.Scanner;

public class Lista2Exercicio1 {

	public static void main(String[] args) {
		/*
		 * /*
	 * 1) João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o
	rendimento diário de seu trabalho. Toda vez que ele traz um peso de tomate maior que o
	estabelecido pelo regulamento do estado de São Paulo (50 quilos) deve pagar um multa de
	R$ 4,00 por quilo excedente. João precisa que você faça um sistema que leia a variável P
	(peso de tomates) e verifique se há excesso. Se houver, gravar na variável E (Excesso) e na
	variável M o valor da multa que João deverá pagar. Caso contrário mostrar tais variáveis
	com o conteúdo ZERO.
	
	
	funcao inicio()
	{
		real P = 0, E = 0, M = 0

	
		escreva("Digite o peso de tomates: ")
		leia(P)

		limpa ()

		se ( P>50){
			E = P - 50
			M = E * 4.00

			escreva("Peso excedente: ", E, "\n O valor da multa é: ", M)
		}

		senao {
			E = 0
			M = 0
			escreva("Peso excedente é : ", E, "\n então o valor da multa é: ", M)
		}
	}
		 */

		Scanner leia = new Scanner (System.in);
		double P = 0, E = 0, M = 0;

		System.out.print("Digite o peso de tomates: ");		
		P =leia.nextDouble();

				

		if ( P>50){
		E = P - 50;
		M = E * 4.00;
		System.out.printf("Peso excedente: %.2f", E);
		System.out.printf(" O valor da multa é: %.2f", M);
		}

		else {
		E = 0;
		M = 0;
		System.out.printf("Peso excedente é : %.2f", E);
		System.out.printf(" então o valor da multa é: %.2f", M);
		}
		leia.close();
	}

}
