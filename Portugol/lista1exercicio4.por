programa
{
	
	funcao inicio()
	{
		
		/*
		 * 4. Escreva um sistema que leia três números inteiros e positivos (A, B, C) 
		 * e calcule a seguinte expressão:
		 */

		inteiro A = 0,B = 0,C = 0,R = 0,S = 0,D = 0

		escreva("Digite o valor de A: ")
		leia(A)
		escreva("Digite o valor de B: ")
		leia(B)
		escreva("Digite o valor de C: ")
		leia(C)

		R = ( (A + B) * ( A + B) )
		S = ( (B + C) * ( B + C) )
		D = (R + S)/ 2

		escreva("O valor de D é:" + D)

		

		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 458; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */