package portugol;

import java.util.Scanner;

public class Lista1Exercicio5 {

	public static void main(String[] args) {
	
		/*
		 * 
	funcao inicio()
	{
		

		 * 5. Fa�a um sistema que leia as 3 notas de um aluno e 
		 * calcule a m�dia final deste aluno. Considerar que a 
		 * m�dia � ponderada e que o peso das notas 
		 * �: 2,3 e 5, respectivamente.
		 * 2+3+5=10
		 
		 real primeiraNota,segundaNota, terceiraNota, mediaPonderada

		 escreva("Digite a primeira nota: ")
		 leia(primeiraNota)
		 escreva("Digite a segunda nota: ")
		 leia(segundaNota)
		 escreva("Digite a terceira nota: ")
		 leia(terceiraNota)

		 mediaPonderada = ( (primeiraNota * 2) + (segundaNota * 3) + (terceiraNota * 5) ) / 10

		 escreva("A m�dia ponderada �: " + mediaPonderada)
		 
	}
		*/  
		
		Scanner leia = new Scanner (System.in);
		
		double primeiraNota,segundaNota, terceiraNota, mediaPonderada;
		
		System.out.print("Digite a primeira nota: ");
		primeiraNota = leia.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		segundaNota = leia.nextDouble();
		
		System.out.print("Digite a terceira nota: ");
		terceiraNota = leia.nextDouble();
		
		mediaPonderada = ( (primeiraNota * 2) + (segundaNota * 3) + (terceiraNota * 5) ) / 10;
		
		System.out.printf("A m�dia ponderada �: %.2f", mediaPonderada);
		
		leia.close();
	}

}
