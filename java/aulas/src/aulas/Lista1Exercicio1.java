package aulas;

import java.util.Scanner;

public class Lista1Exercicio1 {

	public static void main(String[] args) {
	/*
	 * 1-	Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
	 */

		int num1, num2, num3;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite o primeiro valor inteiro: ");
		num1 = leia.nextInt();
		System.out.print("Digite o segundo valor inteiro: ");
		num2 = leia.nextInt();
		System.out.print("Digite o terceiro valor inteiro: ");
		num3 = leia.nextInt();
		
		if(num1>num2 && num1>num3) {
			System.out.printf("O primeiro valor � o maior %d",num1);
		}
		else if(num2>num1 && num2>num3) {
			System.out.printf("O segundo valor � o maior %d",num2);
		}
		else if(num3>num1 && num3>num2) {
			System.out.printf("O terceiro valor � o maior %d",num3);
		}
		else {
			System.out.printf("Voc� digitou 3 valores iguais %d = %d = %d",num1,num2,num3);
		}
		
		
		leia.close();
	}

}
