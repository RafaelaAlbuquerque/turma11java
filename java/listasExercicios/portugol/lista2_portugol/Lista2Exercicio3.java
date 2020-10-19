package lista2_portugol;

import java.util.Scanner;

public class Lista2Exercicio3 {

	public static void main(String[] args) {
		/*
		 * /*
	 * 3) Desenvolva um sistema em que:
	Leia 4 (quatro) números;
	Calcule o quadrado de cada um;
	Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
	Caso contrário, imprima os valores lidos e seus respectivos quadrados.
	
	 
	funcao inicio()
	{
		real num1 =0, num2 = 0, num3 =0, num4 = 0
		
		escreva("Digite o primeiro número: ")
		leia(num1)
		escreva("Digite o segundo número: ")
		leia(num2)
		escreva("Digite o terceiro número: ")
		leia(num3)
		escreva("Digite o quarto número: ")
		leia(num4)

		limpa()

		se (num3*num3>=1000){
			escreva(" O quadrado do terceiro número é: 1000")
		}

		senao{
			escreva("\n O quadrado do primeiro número é: ", num1*num1)
			escreva("\n O quadrado do segundo número é: ", num2*num2)
			escreva("\n O quadrado do terceiro número é: ", num3*num3)
			escreva("\n O quadrado do quarto número é: ", num4*num4)
			
		}
		 */

				Scanner leia = new Scanner (System.in);
				
				double num1 =0, num2 = 0, num3 =0, num4 = 0;
				
				System.out.print("Digite o primeiro número: ");
				num1=leia.nextDouble();
				
				System.out.print("Digite o segundo número: ");
				num2=leia.nextDouble();
				
				System.out.print("Digite o terceiro número: ");
				num3=leia.nextDouble();
				
				System.out.print("Digite o quarto número: ");
				num4=leia.nextDouble();
				

				

				if (num3*num3>=1000){
					System.out.print(" O quadrado do terceiro número é: 1000");
				}

				else{
					System.out.print("O quadrado do primeiro número é: " + (num1*num1));
					System.out.println();
					System.out.print("O quadrado do segundo número é: " + (num2*num2));
					System.out.println();
					System.out.print("O quadrado do terceiro número é: " + (num3*num3));
					System.out.println();
					System.out.print("O quadrado do quarto número é: " +(num4*num4));
					
				}
				
		leia.close();
	}
	

}
