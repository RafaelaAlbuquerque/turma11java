package lista2_lacoRepeticao;

import java.util.Scanner;

public class Lista2Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2 -Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		
		Scanner leia = new Scanner (System.in);
		
		int numero=0, par=0, impar=0;
		
		for(int x=1;x<=10;x++) {
			System.out.printf("Digite o %dº número:",x);
			numero=leia.nextInt();
			
			if(numero%2==0) {
				par++;
			}
			
			else {
				impar++;
			}
		}
		System.out.printf("Foram lidos %d números pares",par);
		System.out.println();
		System.out.printf("Foram lidos %d números impares",impar);
		
		
		
		leia.close();
	}

}
