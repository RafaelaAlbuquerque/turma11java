package lista1_lacoCondicional;

import java.util.Scanner;

public class Lista1Exercicio4 {

	public static void main(String[] args) {
		/*
		 * 4-	Fa�a um programa em que permita a entrada de um n�mero qualquer e 
		 * exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m a 
		 * raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.
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
				System.out.printf("O valor � positivo e par, sua raiz quadrada �: %.2f",resultadoRaiz);	
			}
			
			else {
				System.out.printf("O valor � positivo e �mpar e elevado ao quadrado: %.2f", (valorUsuario*valorUsuario));
			}
		}
		else if (valorUsuario <0) {
			if ((valorUsuario % 2) == 0) {
				
				resultadoRaiz=Math.sqrt(resultadoRaiz);
				System.out.printf("O valor � negativo e par, sua raiz quadrada �: %.2f",resultadoRaiz);
			}
			else {
				System.out.printf("O valor � negativo e �mpar e elevado ao quadrado: %.2f", (valorUsuario*valorUsuario));
			}
		}
		else {
			System.out.print("Voc� digitou 0");
		}
		
		leia.close();
	
	
	}

}
