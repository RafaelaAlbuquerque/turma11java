package lista2_portugol;

import java.util.Scanner;

public class Lista2Exercicio6 {

	public static void main(String[] args) {
		/*
		 * /*
	 * 6) Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes
	categorias:
	Infantil A = 5 a 7 anos
	Infantil B = 8 a 11 anos
	Juvenil A = 12 a 13 anos
	Juvenil B = 14 a 17 anos
	Adultos = Maiores de 18 anos
	
	funcao inicio()
	{
		inteiro idade = 0,infantilA = 0, infantilB = 0, juvenilA = 0, juvenilB = 0, adultos = 0

		
		escreva("Digite a sua idade: ")
		leia(idade)

		limpa ()

		se (idade>=18){
			escreva(" Voc� � adulto! ")
		}

		senao se (idade>=5 e idade<=7) {
			escreva("Voc� � infantil A!")
		}

		senao se (idade>=8 e idade<=11) {
			escreva("Voc� � infantil B!")
		}

		senao se (idade>=12 e idade<=13) {
			escreva("Voc� � juvenil A!")
		}

		senao se (idade>=14 e idade<=17) {
			escreva("Voc� � juvenil B!")
		}

		senao {
			escreva ("Esta idade n�o possui categoria")
		}
	}
		 */
		
		Scanner leia = new Scanner (System.in);
		
		int idade = 0,infantilA = 0, infantilB = 0, juvenilA = 0, juvenilB = 0, adultos = 0;

				System.out.print("Digite a sua idade: ");
				idade = leia.nextInt();
				
				if (idade>=18){
					System.out.print(" Voc� � adulto! ");
				}

				else if (idade>=5 && idade<=7) {
					System.out.print("Voc� � infantil A!");
				}

				else if (idade>=8 && idade<=11) {
					System.out.print("Voc� � infantil B!");
				}

				else if (idade>=12 && idade<=13) {
					System.out.print("Voc� � juvenil A!");
				}

				else if (idade>=14 && idade<=17) {
					System.out.print("Voc� � juvenil B!");
				}

				else {
					System.out.print("Esta idade n�o possui categoria");
					
				}
		leia.close();
	}

}
