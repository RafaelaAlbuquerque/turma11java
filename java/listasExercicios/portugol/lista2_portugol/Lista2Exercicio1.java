package lista2_portugol;

import java.util.Scanner;

public class Lista2Exercicio1 {

	public static void main(String[] args) {
		/*
		 * /*
	 * 1) Jo�o Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o
	rendimento di�rio de seu trabalho. Toda vez que ele traz um peso de tomate maior que o
	estabelecido pelo regulamento do estado de S�o Paulo (50 quilos) deve pagar um multa de
	R$ 4,00 por quilo excedente. Jo�o precisa que voc� fa�a um sistema que leia a vari�vel P
	(peso de tomates) e verifique se h� excesso. Se houver, gravar na vari�vel E (Excesso) e na
	vari�vel M o valor da multa que Jo�o dever� pagar. Caso contr�rio mostrar tais vari�veis
	com o conte�do ZERO.
	
	
	funcao inicio()
	{
		real P = 0, E = 0, M = 0

	
		escreva("Digite o peso de tomates: ")
		leia(P)

		limpa ()

		se ( P>50){
			E = P - 50
			M = E * 4.00

			escreva("Peso excedente: ", E, "\n O valor da multa �: ", M)
		}

		senao {
			E = 0
			M = 0
			escreva("Peso excedente � : ", E, "\n ent�o o valor da multa �: ", M)
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
		System.out.printf(" O valor da multa �: %.2f", M);
		}

		else {
		E = 0;
		M = 0;
		System.out.printf("Peso excedente � : %.2f", E);
		System.out.printf(" ent�o o valor da multa �: %.2f", M);
		}
		leia.close();
	}

}
