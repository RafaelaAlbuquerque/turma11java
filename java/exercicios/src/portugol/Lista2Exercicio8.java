package portugol;

import java.util.Scanner;

public class Lista2Exercicio8 {

	public static void main(String[] args) {
		/*
		 * programa
{
	
	/*
	 * 8) Construa um sistema para ler uma variável numérica N e imprimi-la somente se a mesma
	for maior que 100, caso contrário imprimi-la com o valor zero.
	 
	 
	funcao inicio()
	{
		real N
		
		escreva("Digite o valor de N:")
		leia(N)

		limpa()

		se (N>100){
			escreva("O valor de N é : ", N)
		}

		senao {
			escreva("O valor é zero!")
		}
	}
}
		 */
		
		Scanner leia = new Scanner (System.in);
		
		double N;
		
		System.out.print("Digite o valor de N:");
		N=leia.nextDouble();
		
	

		if (N>100){
			System.out.printf("O valor de N é : %.2f", N);
			
		}

		else {
			System.out.print("O valor é zero!");
		}
		
		leia.close();
	}

}
