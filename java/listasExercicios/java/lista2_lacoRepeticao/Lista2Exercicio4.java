package lista2_lacoRepeticao;

import java.util.Scanner;

public class Lista2Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 4-Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas psicol�gicas 
		 * dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas era perguntado: 
		 * idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es (1, se a pessoa era calma;
		 *  2, se a pessoa era nervosa e 3, se a pessoa era agressiva). Pede-se para elaborar um 
		 *  sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
		o n�mero de pessoas calmas; 
		o n�mero de mulheres nervosas; 
		o n�mero de homens agressivos; 
		o n�mero de outros calmos;
		o n�mero de pessoas nervosas com mais de 40 anos; 
		o n�mero de pessoas calmas com menos de 18 anos.
		 */
		
		Scanner leia = new Scanner (System.in);
		
		int pessoas=1,idade=0, sexo=0, comportamento=0;
		
		while(pessoas<=3) {
			System.out.print("Informe sua idade: ");
			idade=leia.nextInt();
			System.out.print("Informe seu genero 1-feminino, 2-masculino, 3-Outros: ");
			sexo=leia.nextInt();
			System.out.print("Digite a op��o da sua caracteristica comportamental 1- calma, 2- nervosa e 3- agressiva:");
			comportamento=leia.nextInt();
			pessoas++;
			
		}
		
		leia.close();
	}

}
