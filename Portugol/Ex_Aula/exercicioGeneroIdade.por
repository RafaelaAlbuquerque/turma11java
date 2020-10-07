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
		inteiro idade = 0
		
		escreva("Digite o seu nome:")
		leia(nomeUsuario)

		escreva("Digite F (feminino) ou M (masculino):")
		leia(opcao)

		escreva("Digite o seu ano de nascimento:")
		leia(anoNascimento)

		limpa()

		idade = (anoAtual - anoNascimento)

		se (idade<25){
			escreva("Oie, ", nomeUsuario, "!! Você tem: ",idade, " anos. Você é jovem!")
		}

		senao se (idade>=25 e idade<=59){
			se (opcao=='F' ou opcao=='f'){
				escreva("Oie, ", nomeUsuario, "!! Você tem: ",idade, " anos. Você é madura!")
			}

			senao se (opcao == 'M' ou opcao=='m'){
				escreva("Oie, ", nomeUsuario, "!! Você tem: ",idade, " anos. Você é maduro!")
			}
		}

		 senao se (idade >= 60) {
		 	se (opcao=='F' ou opcao=='f'){
		 		escreva("Oie, ", nomeUsuario, "!! Você tem: ",idade, " anos. Você é idosa!!")
		 	}
		 	
		 	senao se (opcao == 'M' ou opcao=='m'){
		 		escreva("Oie, ", nomeUsuario, "!! Você tem: ",idade, " anos. Você é idoso!!")
		 	}
		 	
		 	
		 }
		

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1295; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */