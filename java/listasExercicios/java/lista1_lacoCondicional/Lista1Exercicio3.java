package lista1_lacoCondicional;

import java.util.Scanner;

public class Lista1Exercicio3 {

	public static void main(String[] args) {
		/*
		 * 3-	Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
			•	10-14 infantil
			•	15-17 juvenil
			•	18-25 adulto

		 */

		
Scanner leia = new Scanner (System.in);
		
		int idade = 0,infantilA = 0, infantilB = 0, juvenilA = 0, juvenilB = 0, adultos = 0;

				System.out.print("Digite a sua idade: ");
				idade = leia.nextInt();
				
				if (idade>=18){
					System.out.print("Adulto! ");
				}

				else if (idade>=15 && idade<=17) {
					System.out.print("Juvenil!");
				}

				else if (idade>=10 && idade<=14) {
					System.out.print("Infantil!");
				}

		leia.close();
	}

}
