programa
{
	// recebe nome  usuario, identifica o genero, ano nascimento
	// conforme a idade chama de idoso/idosa, maduro/madura, jovem
	//ACIMA DE 60 ANOS (60 INCLUSIVE),,MADURO ENTRE 25 E 59 ANOS, JOVEM ABAIXO DE 25

	funcao inicio()
	{
		cadeia nomeUsuario
		caracter opcao // caracter le apenas uma letra
		inteiro anoNascimento = 0
		inteiro anoAtual = 2020
		inteiro idade = anoNascimento - anoAtual
		
		escreva("Digite o seu nome:")
		leia(nomeUsuario)

		escreva("Digite F (feminino) ou M (masculino):")
		leia(opcao)

		escreva("Digite o seu ano de nascimento:")
		leia(anoNascimento)

		se (idade >= 60 e opcao=='F'){
			escreva("Oie, ", nomeUsuario, " você é idosa!")
		}
/*
		senao se (idade >= 60 ){
			
			
		}


		escreva("Oie, ", nomeUsuario, " você é idoso!")
		
		escreva("Oie, ", nomeUsuario, " você é jovem!")
		escreva("Oie, ", nomeUsuario, " você é maduro!")
		escreva("Oie, ", nomeUsuario, " você é madura!")

	*/	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 594; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */