package portugol;

import java.util.Scanner;

public class Lista1Exercicio8 {

	public static void main(String[] args) {
		/*
		 * funcao inicio()
	{
		escreva("Ol� Mundo")
		/*
		 * 8. O custo ao consumidor de um carro novo � a soma do custo de f�brica 
		 * com a percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica). 
		 * Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
		  escrever um sistema que leia o custo de f�brica de um carro e escreva o custo
		  ao consumidor.
		 

		 real custoFabrica = 0, custoTotal = 0, percentagemDistribuidor = 0.28, impostos = 0.45

		 escreva("Digite o custo de f�brica: ")
		 leia(custoFabrica)

		 custoTotal = custoFabrica + (custoFabrica*percentagemDistribuidor) + (custoFabrica*impostos)

		 escreva("O custo total �: " + custoTotal)
	}
		 */
		
		Scanner leia = new Scanner (System.in);
		
		double custoFabrica = 0, custoTotal = 0, percentagemDistribuidor = 0.28, impostos = 0.45;
	
		System.out.print("Digite o custo de f�brica: ");
		custoFabrica=leia.nextDouble();
		
		custoTotal = custoFabrica + (custoFabrica*percentagemDistribuidor) + (custoFabrica*impostos);
		
		System.out.printf("O custo total �: %.2f ", custoTotal);
		
		leia.close();

	}
	

}
