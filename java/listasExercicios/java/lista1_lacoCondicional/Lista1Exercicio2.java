package lista1_lacoCondicional;

import java.util.Scanner;

public class Lista1Exercicio2 {

	public static void main(String[] args) {
		/*
		 * 2-	Faça um programa que entre com três números e coloque em ordem crescente.
		 */
		
		int num1, num2, num3;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite o primeiro valor inteiro: ");
		num1 = leia.nextInt();
		System.out.print("Digite o segundo valor inteiro: ");
		num2 = leia.nextInt();
		System.out.print("Digite o terceiro valor inteiro: ");
		num3 = leia.nextInt();
		
		if(num1<num2) {
			
			if (num2<num3) {
				System.out.printf("A ordem crescente é %d %d %d",num1,num2, num3);
			}
			
			else {
				System.out.printf("A ordem crescente é %d %d %d",num1,num3, num2);
			}
		}
		else if(num2>num1) {
			
			if (num1<num3) {
				System.out.printf("A ordem crescente é %d %d %d",num2,num1, num3);
			}
			
			else {
				System.out.printf("A ordem crescente é %d %d %d",num2,num3, num1);
			}
		}
	   
		else if(num3>num1) {
			
			if (num1<num2) {
				System.out.printf("A ordem crescente é %d %d %d",num3,num1, num2);
			}
			
			else {
				System.out.printf("A ordem crescente é %d %d %d",num3,num2, num1);
			}
		}
		else {
			System.out.printf("Todos os valores sao iguais %d = %d = %d", num1,num2,num3);
		}
	}

}
