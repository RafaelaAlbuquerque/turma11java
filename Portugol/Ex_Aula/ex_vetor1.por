programa
{
	funcao pulaLinha(){
		escreva("\n")
	}
	funcao inicio()
	{
		cadeia nome [5]
		nome[0] = "Rafaela"
		nome[1] = "Beatriz"
		nome[2] = "Gabriele"
		nome[3] = "Giovana"
		nome[4] = "Taína"
		inteiro posicao = 0
		
		escreva("Digite a posição desejada: ")
		leia(posicao)
		//escreva(nome[posicao])

		para(inteiro x=0;x<=posicao;x++){
			escreva(nome[x])
			pulaLinha()
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 378; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */