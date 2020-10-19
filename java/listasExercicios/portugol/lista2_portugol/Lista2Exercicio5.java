package lista2_portugol;

import java.util.Scanner;

public class Lista2Exercicio5 {

	public static void main(String[] args) {
		/*
		 * /*
	 * 5) A Secretaria de Meio Ambiente que controla o �ndice de polui��o mant�m 3 grupos de
	ind�strias que s�o altamente poluentes do meio ambiente. O �ndice de polui��o aceit�vel
	varia de 0,05 at� 0,25. Se o �ndice sobe para 0,3 as ind�strias do 1� grupo s�o intimadas a
	suspenderem suas atividades, se o �ndice crescer para 0,4 as industrias do 1� e 2� grupo s�o
	intimadas a suspenderem suas atividades, se o �ndice atingir 0,5 todos os grupos devem ser
	notificados a paralisarem suas atividades. Fa�a um sistema que leia o �ndice de polui��o
	medido e emita a notifica��o adequada aos diferentes grupos de empresas.
	 
	 
	funcao inicio()
	{
		real poluicao = 0
	
		escreva("Digite o �ndice de polui��o: ")
		leia(poluicao)

		limpa()

		se (poluicao>=0.3 e poluicao<0.4){
			escreva(" 1� grupo foi intimado a suspender as suas atividades")
		}

		senao se (poluicao>=0.4 e poluicao<0.5){
			escreva(" 1� e 2� grupos foram intimados a suspender as suas atividades")
		}

		senao se (poluicao>=0.5){
			escreva(" Todos os grupos foram intimados a suspender as suas atividades")
		}

		senao {
			escreva("O �ndice de polui��o est� aceit�vel")
		}

			
	}
		 */
		Scanner leia = new Scanner (System.in);
		
		double poluicao = 0;
		
		System.out.print("Digite o �ndice de polui��o: ");		
		poluicao=leia.nextDouble();


		if (poluicao>=0.3 && poluicao<0.4){
			System.out.print(" 1� grupo foi intimado a suspender as suas atividades");
		}

		else if (poluicao>=0.4 && poluicao<0.5){
			System.out.print(" 1� e 2� grupos foram intimados a suspender as suas atividades");
		}
		
		else if (poluicao>=0.5){
			System.out.print(" Todos os grupos foram intimados a suspender as suas atividades");
		}

		else {
			System.out.print("O �ndice de polui��o est� aceit�vel");
		}
		
		leia.close();
	}

}
