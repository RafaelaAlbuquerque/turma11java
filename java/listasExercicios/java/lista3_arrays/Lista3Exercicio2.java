package lista3_arrays;

import java.util.Scanner;

public class Lista3Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2- Fa�a um programa que receba 6 n�meros inteiros e mostre:
			� Os n�meros pares digitados;
			� A soma dos n�meros pares digitados;
			� Os n�meros �mpares digitados;
			� A quantidade de n�meros �mpares digitados.
		 */
		Scanner leia = new Scanner (System.in);
		int num[] = new int[6];
		int par=0;
		int impar = 0;
		int valor =0;


		for(int x = 0 ; x< num.length; x++) 
		{
			System.out.print("Digite um n�mero: ");
			 valor = leia.nextInt();
			 num[x]=valor;
			if(valor%2 ==0) 
			{
				System.out.printf("O n�mero %d  � par!\n", valor);
				par++;
			}else 
			{
				System.out.printf("O n�mero %d � �mpar!\n", valor);
				impar++;

			}
		}

		System.out.println("A quantidade de numeros pares digitada �: "+ par);
		System.out.println("A quantidade de numeros impares digitada �: "+ impar);
		
	leia.close();
	}

}