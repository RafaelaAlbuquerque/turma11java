programa
{
	/*
	 * vetor chamado familia que tem meu nome e mais 3 parentes, 
	 * exibir usando laço para o nome de cada pessoa pulando linha
	 */
	 
	funcao pulaLinha(){
		escreva("\n")
	}
	
	funcao inicio()
	{
		inteiro indice = 0
		cadeia familia[4] = {"Rafaela", "Gabriel", "Maria", "Maura"}
		
		para(indice=0;indice<4;indice++){
			escreva(familia[indice])
			pulaLinha()	
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 323; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */