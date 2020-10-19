package lista1_portugol;

import java.util.Scanner;

public class Lista1Exercicio3 {

	public static void main(String[] args) {
		/*
		 * funcao inicio()
	{	
		 * 3. Faça um sistema que leia o tempo de duração 
		 * de um evento em uma fábrica expressa em segundos 
		 * e mostre-o expresso em horas, minutos e segundos.
		 
		 inteiro tempoDuracao = 0
		 inteiro horas = 0
		 inteiro minutos = 0
		 inteiro segundos = 0
		 
		escreva("Digite o tempo de duração do evento em segundos: ")
		leia(tempoDuracao)

		horas = tempoDuracao / 3600
		escreva("\n Total horas: ", horas)
		minutos = ( (tempoDuracao % 3600) / 60 )
		escreva("\n Total de minutos: ", minutos)
		segundos = ( (tempoDuracao % 3600) % 60 )
		escreva("\n Total segundos: ", segundos)
		*/
		
		 Scanner leia = new Scanner(System.in); 
		 int tempoDuracao=0, horas=0, minutos=0, segundos=0;
		 
		 System.out.print("Digite o tempo de duração do evento em segundos: ");
		 tempoDuracao= leia.nextInt();
		 horas = tempoDuracao / 3600;
		 minutos = ( (tempoDuracao % 3600) / 60 );
		 segundos = ( (tempoDuracao % 3600) % 60 );
		 
		 System.out.printf("O evento durou %d hora(s), %d minuto(s) e %d segundo(s)",horas,minutos,segundos);
			
		 
		 
		 
	
		 
		 leia.close();
	}

}
