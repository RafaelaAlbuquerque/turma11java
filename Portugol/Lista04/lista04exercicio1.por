programa
{
	/*
	 * 1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de
	uma atividade e o escreva em seguida. Encontre após a maior pontuação e a
	apresente.
	 */
	funcao pulaLinha(){
		escreva("\n")
	}
	
	funcao inicio()
	{

		inteiro pontuacao [5]
		inteiro maiorPontuacao = 0

		para (inteiro x=0;x<=4;x++){
			
			escreva("Digite a pontuação ", x+1, ": ")
			leia(pontuacao[x])
			limpa()
			se (maiorPontuacao<pontuacao[x]){
				maiorPontuacao=pontuacao[x]
			}
			
		}

		para(inteiro x=0;x<=4;x++){
			escreva("Pontuação ", x+1, ":", pontuacao[x])
			pulaLinha()
		}
		
		escreva("Maior pontuação: ", maiorPontuacao)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 656; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */