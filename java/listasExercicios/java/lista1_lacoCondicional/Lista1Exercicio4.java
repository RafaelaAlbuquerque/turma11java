package lista1_lacoCondicional;

import java.util.Scanner;

public class Lista1Exercicio4 {

	public static void main(String[] args) {
		/*
		 * 4-	Faça um programa em que permita a entrada de um número qualquer e 
		 * exiba se este número é par ou ímpar. Se for par exiba também a 
		 * raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
		 */
	
	
		Scanner leia = new Scanner (System.in);
		double valorUsuario;
		double resultadoRaiz=0.0;
		System.out.print("Digite um valor: ");
		valorUsuario = leia.nextDouble();
		resultadoRaiz = valorUsuario;
		
		if (valorUsuario > 0) {
			
			if ((valorUsuario % 2) == 0) {
			
				resultadoRaiz=Math.sqrt(resultadoRaiz);
				System.out.printf("O valor é positivo e par, sua raiz quadrada é: %.2f",resultadoRaiz);	
			}
			
			else {
				System.out.printf("O valor é positivo e ímpar e elevado ao quadrado: %.2f", (valorUsuario*valorUsuario));
			}
		}
		else if (valorUsuario <0) {
			if ((valorUsuario % 2) == 0) {
				
				resultadoRaiz=Math.sqrt(resultadoRaiz);
				System.out.printf("O valor é negativo e par, sua raiz quadrada é: %.2f",resultadoRaiz);
			}
			else {
				System.out.printf("O valor é negativo e ímpar e elevado ao quadrado: %.2f", (valorUsuario*valorUsuario));
			}
		}
		else {
			System.out.print("Você digitou 0");
		}
		
		leia.close();
	
	
	}

}
