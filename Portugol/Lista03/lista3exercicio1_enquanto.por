programa
{
	inclua biblioteca Matematica --> mat
	
	/*
	 * 1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
	apresente no final o total do somatório, a média e o total de valores lidos. O programa
	deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
	positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor
	negativo.
	 */

	funcao pulaLinha(){
		escreva("\n")
	}
	
	funcao inicio()
	{
		real numero = 0.0, soma = 0.0, media = 0.0
		inteiro totalLidos = 0
		
		enquanto (numero>=0)
		{
			escreva("Digite um número positivo, que seja maior ou igual a zero: ")
			leia(numero)
			se (numero>=0){
				totalLidos++
				soma=soma+numero
				media=soma/totalLidos	
				media = mat.arredondar(media, 2)
			}
				
		}
		
		limpa()
		escreva("Total somatório: ", soma)
		pulaLinha()
		escreva("Média: ", media)
		pulaLinha()
		escreva("Total valores lidos: ", totalLidos)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 795; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */