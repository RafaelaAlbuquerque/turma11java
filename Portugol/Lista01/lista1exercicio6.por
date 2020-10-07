programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		/*
		 * 6. Construa um programa em c que, 
		 * tendo como dados de entrada dois 
		 * pontos quaisquer no plano, P(x1, y1) 
		 * e P(x2, y2), escreva a distância entre 
		 * eles. 
		 */

		 real x1 = 0, x2 = 0, y1 = 0, y2 = 0, resultadoX = 0, resultadoY = 0, resultadoPontos = 0, d =0 

		escreva("Digite o valor de X1: ")
		leia(x1)
		escreva("Digite o valor de Y1: ")
		leia(y1)
		escreva("Digite o valor de X2: ")
		leia(x2)
		escreva("Digite o valor de Y2: ")
		leia(y2)

		resultadoX = ( (x2 - x1) * (x2 - x1) )
		resultadoY = ( (y2 - y1) * (y2 - y1) )
		resultadoPontos = ( resultadoX + resultadoY )
		d = mat.raiz(resultadoPontos,2)

		escreva("O valor de d é" + d)

		
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */