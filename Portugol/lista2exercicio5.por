programa
{
	
	/*
	 * 5) A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de
	indústrias que são altamente poluentes do meio ambiente. O índice de poluição aceitável
	varia de 0,05 até 0,25. Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas a
	suspenderem suas atividades, se o índice crescer para 0,4 as industrias do 1º e 2º grupo são
	intimadas a suspenderem suas atividades, se o índice atingir 0,5 todos os grupos devem ser
	notificados a paralisarem suas atividades. Faça um sistema que leia o índice de poluição
	medido e emita a notificação adequada aos diferentes grupos de empresas.
	 */
	 
	funcao inicio()
	{
		real poluicao = 0
	
		escreva("Digite o índice de poluição: ")
		leia(poluicao)

		limpa()

		se (poluicao>=0.3 e poluicao<0.4){
			escreva(" 1º grupo foi intimado a suspender as suas atividades")
		}

		senao se (poluicao>=0.4 e poluicao<0.5){
			escreva(" 1º e 2º grupos foram intimados a suspender as suas atividades")
		}

		senao se (poluicao>=0.5){
			escreva(" Todos os grupos foram intimados a suspender as suas atividades")
		}

		senao {
			escreva("O índice de poluição está aceitável")
		}

			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 759; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */