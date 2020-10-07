programa
{
	/*
	 * 2. Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um
	programa que gere um vetor com os lançamentos, escreva esse vetor. A seguir
	determine e imprima a média aritmética dos lançamentos, contabilize e apresente
	também quantas foram as ocorrências da maior pontuação.
	 */
	funcao pulaLinha(){
		escreva("\n")
	}
	
	funcao inicio()
	{
		inteiro dado[10]
		inteiro maiorPontuacao = 0
		real mediaLancamento = 0.0, soma = 0.0
		
		
		para (inteiro x=0;x<=9;x++){
			
			escreva("Digite o resultado do dado no lançamento ", x+1, ": ")
			leia(dado[x])
			limpa()
			soma=soma+dado[x]
			se(dado[x] ==6){
				maiorPontuacao++
			}
		}

		para(inteiro x=0;x<=9;x++){
			escreva("Lançamento", x, ":", dado[x])
			pulaLinha()
		}

		mediaLancamento = (soma/10)
		
		escreva("O valor 6 no dado foi obtido ", maiorPontuacao, " vezes")
		pulaLinha()
		escreva("A média dos lançamentos é: " ,mediaLancamento)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 532; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */