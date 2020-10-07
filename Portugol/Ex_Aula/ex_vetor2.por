programa
{
	funcao pulaLinha(){
		escreva("\n")
	}
	funcao inicio()
	{
		cadeia nome [5]
		

		para (inteiro x=0;x<=4;x++){
			
			escreva("Digite a posição ", x, ": ")
			leia(nome[x])
			limpa()
		}

		para(inteiro x=0;x<=4;x++){
			escreva("Posição ", x, ":", nome[x])
			pulaLinha()
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 196; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */