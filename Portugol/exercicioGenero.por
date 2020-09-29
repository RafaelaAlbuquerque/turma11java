programa
{
	
	funcao inicio()
	{
		// pegar/receber o nome e retornar bom dia
		// variar genero no pronome de tratamento de acordo com a escolha do usuario 
		
		cadeia nomeUsuario
		caracter opcao // caracter le apenas uma letra
		
		escreva("Digite o seu nome:")
		leia(nomeUsuario)

		escreva("Digite F (feminino) ou M (masculino):")
		leia(opcao)
		
		
		
		se (opcao == 'F'){ //aspas simples quando é caracter, aspas dupla quando cadeia
			
			escreva("Bom dia Sra. " + nomeUsuario + "!!!")
			
		}
		
		senao se (opcao == 'F') {
			
			escreva("Bom dia Sr. " + nomeUsuario + "!!!")
			
		}

		senao {
			
			escreva("Bom dia Srx. " + nomeUsuario + "!!!")
			
		}

		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 360; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */