package portugol;

import java.util.Scanner;

public class Lista1Exercicio8 {

	public static void main(String[] args) {
		/*
		 * funcao inicio()
	{
		escreva("Olá Mundo")
		/*
		 * 8. O custo ao consumidor de um carro novo é a soma do custo de fábrica 
		 * com a percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). 
		 * Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
		  escrever um sistema que leia o custo de fábrica de um carro e escreva o custo
		  ao consumidor.
		 

		 real custoFabrica = 0, custoTotal = 0, percentagemDistribuidor = 0.28, impostos = 0.45

		 escreva("Digite o custo de fábrica: ")
		 leia(custoFabrica)

		 custoTotal = custoFabrica + (custoFabrica*percentagemDistribuidor) + (custoFabrica*impostos)

		 escreva("O custo total é: " + custoTotal)
	}
		 */
		
		Scanner leia = new Scanner (System.in);
		
		double custoFabrica = 0, custoTotal = 0, percentagemDistribuidor = 0.28, impostos = 0.45;
	
		System.out.print("Digite o custo de fábrica: ");
		custoFabrica=leia.nextDouble();
		
		custoTotal = custoFabrica + (custoFabrica*percentagemDistribuidor) + (custoFabrica*impostos);
		
		System.out.printf("O custo total é: %.2f ", custoTotal);
		
		leia.close();

	}
	

}
