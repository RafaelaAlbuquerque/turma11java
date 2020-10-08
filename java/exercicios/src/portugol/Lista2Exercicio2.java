package portugol;

import java.util.Scanner;
//import java.util.*;
public class Lista2Exercicio2 {

	public static void main(String[] args) {
		/*
		 * 2) Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
	horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
	por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
	armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
	trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
	excedente.
	
	
	funcao inicio()
	{
		inteiro N, E
		cadeia C
		
		escreva("Digite o seu código: ")
		leia(C)

		escreva("Digite o número de horas trabalhadas: ")
		leia(N)

		limpa ()

		se(N>50){
			E = N - 50

			escreva("Identificação do funcionário: ",C ,"\n O salário total é: ", ((50*10)+(E*20)) , "\n O salário excedente é: ",E*20 )
			
		}

		senao {
			E = 0
			escreva("Identificação do funcionário: ",C ,"\n O salário total é: ", ((50*10)+(E*20)) , "\n O salário excedente é: ",E*20 )
		}

		
	}
		 */
		Scanner leia = new Scanner (System.in);
		
		int N, E, salarioTotal=0;
		String C = " ";
		
		System.out.print("Digite o seu código: ");
		C=leia.next();
		

		System.out.print("Digite o número de horas trabalhadas: ");
		N=leia.nextInt();
		

		

		if(N>50){
			E = N - 50;
			System.out.printf("Identificação do funcionário: %s",C);
			salarioTotal=((50*10)+(E*20));
			System.out.printf("\nO salário total é: %d",salarioTotal );
			System.out.printf("\nO salário excedente é: %d",E*20);
		}

		else {
			E = 0;
			System.out.printf("Identificação do funcionário: %s",C);
			salarioTotal=((50*10)+(E*20));
			System.out.printf("\nO salário total é: %d", salarioTotal);
			System.out.printf("\nO salário excedente é: %d",E*20);
		}
	
		leia.close();
		
	}
	

}
