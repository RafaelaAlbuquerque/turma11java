package aulas;

import java.util.Scanner;

public class Lista2Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
		Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
		 */
		Scanner leia = new Scanner (System.in);
		
		int idade=0, menorIdade=0, maiorIdade=0;
		
		while(idade!=-99) {
			System.out.print("Digite a sua idade: ");
			idade=leia.nextInt();
			
			if(idade<21 && idade!=-99) {
				menorIdade++;
			}
			else if (idade>50) {
				maiorIdade++;
			}
		}
		
		System.out.printf("Total de pessoas com menos de 21 anos: %d ", menorIdade);
		System.out.println();
		System.out.printf("Total de pessoas com mais de 50 anos: %d ",maiorIdade);
		
		leia.close();
	}

}
