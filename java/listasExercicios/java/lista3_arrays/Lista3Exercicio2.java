package lista3_arrays;

import java.util.Scanner;

public class Lista3Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2- Faça um programa que receba 6 números inteiros e mostre:
			• Os números pares digitados;
			• A soma dos números pares digitados;
			• Os números ímpares digitados;
			• A quantidade de números ímpares digitados.
		 */
		Scanner leia = new Scanner (System.in);
		int num[] = new int[6];
		int par=0;
		int impar = 0;
		int valor =0;


		for(int x = 0 ; x< num.length; x++) 
		{
			System.out.print("Digite um número: ");
			 valor = leia.nextInt();
			 num[x]=valor;
			if(valor%2 ==0) 
			{
				System.out.printf("O número %d  é par!\n", valor);
				par++;
			}else 
			{
				System.out.printf("O número %d é ímpar!\n", valor);
				impar++;

			}
		}

		System.out.println("A quantidade de numeros pares digitada é: "+ par);
		System.out.println("A quantidade de numeros impares digitada é: "+ impar);
		
	leia.close();
	}

}