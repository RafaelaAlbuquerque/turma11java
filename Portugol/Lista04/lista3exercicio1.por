programa
{
	/*
	 * 1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de
	uma atividade e o escreva em seguida. Encontre após a maior pontuação e a
	apresente.
	 */
	 
	funcao inicio()
	{
		const inteiro LIMITE = 5
		inteiro vetor[LIMITE],pontuacao=0
		inteiro maiorPontuacao

		para (inteiro x=0;x<5;x++){
			
			limpa()

			escreva("\n Digite a ", x+1,"ª pontuação")
			leia(vetor[pontuacao])

			
		}

		

		para (inteiro x=0;x<5;x++){

			escreva("As notas foram: ", vetor[x])			
		}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 504; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */