package lista2_lacoRepeticao;

import java.util.Scanner;

public class Lista2Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2 -Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		
		Scanner leia = new Scanner (System.in);
		
		int numero=0, par=0, impar=0;
		
		for(int x=1;x<=10;x++) {
			System.out.printf("Digite o %d� n�mero:",x);
			numero=leia.nextInt();
			
			if(numero%2==0) {
				par++;
			}
			
			else {
				impar++;
			}
		}
		System.out.printf("Foram lidos %d n�meros pares",par);
		System.out.println();
		System.out.printf("Foram lidos %d n�meros impares",impar);
		
		
		
		leia.close();
	}

}
