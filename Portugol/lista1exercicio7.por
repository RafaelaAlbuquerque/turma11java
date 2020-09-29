programa
{
	
	funcao inicio()
	{
		escreva("Olá Mundo")
		/*
		 * 7.Escreva um sistema que lê os coeficientes a,b,c,d,e e f 
		 * e calcula e mostra os valores de x e y.
		 */


		 real A = 0, B = 0, C = 0, D = 0, E = 0, F = 0, x = 0, y = 0

		 escreva("Digite o valor de A: ")
		 leia(A)
		 escreva("Digite o valor de B: ")
		 leia(B)
		 escreva("Digite o valor de C: ")
		 leia(C)
		 escreva("Digite o valor de D: ")
		 leia(D)
		 escreva("Digite o valor de E: ")
		 leia(E)
		 escreva("Digite o valor de F: ")
		 leia(F)

		 x = ((C * E)-(B * F))/((A * E)-(B * D))
		 y = ((A * F)-(C * D))/((A * E)-(B * D))

		 escreva("O valor de x é: " + x)
		 escreva("O valor de y é: " + y)
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