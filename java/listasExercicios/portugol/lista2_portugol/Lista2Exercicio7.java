package lista2_portugol;

import java.util.Scanner;

public class Lista2Exercicio7 {

	public static void main(String[] args) {
		/*
		 * 
	/*
	 * 7) Receber valores de base e altura de um tri�ngulo e verificar se s�o valores v�lidos
	(positivos maiores que zero). Em caso afirmativo, calcular a �rea do tri�ngulo.
	
	 
	funcao inicio()
	{
		real base, altura

		escreva("Digite a base: ")
		leia(base)
		escreva("Digite a altura: ")
		leia(altura)

		limpa ()

		se (base>0 e altura>0){
			escreva("A �rea do tri�ngulo �: ",  (base*altura) / 2)
		}
	}
		 */
		Scanner leia = new Scanner (System.in);
		
		double base, altura;
		
		System.out.print("Digite a base: ");
		base = leia.nextDouble();
		
		System.out.print("Digite a altura: ");
		altura = leia.nextDouble();
		


		if (base>0 && altura>0){
			System.out.printf("A �rea do tri�ngulo �: %.2f", ( (base*altura) / 2));
			
		}
		
		leia.close();
	}

}
