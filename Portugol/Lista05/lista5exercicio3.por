programa
{
	
	funcao pulalinha()
	{
		escreva("\n")
	}
	
	/*
	 * 3- Escrever um programa que leia uma quantidade desconhecida de números e conte
	quantos deles estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. A
	entrada de dados deve terminar quando for lido um número negativo.
	 */
	 
	funcao inicio()
	{

		real numero = 0.0
		inteiro primeiroIntervalo = 0 , segundoIntervalo = 0 , terceiroIntervalo = 0 , quartoIntervalo = 0
		caracter parar = 'N'
		
		enquanto (parar != 'S')
		{
			escreva("Digite um número positivo, que seja maior ou igual a zero: ")
			leia(numero)
			pulalinha()
			escreva("Se quiser parar digite S ou N para continuar:")
			leia(parar)

			
		se (numero<0){
		escreva("Número Negativo!")		
		}

		senao se (numero>=0 e numero<=25){
			primeiroIntervalo++
		}

		senao se (numero>=26 e numero<=50){
			segundoIntervalo++
		}

		senao se (numero>=51 e numero<=75){
			terceiroIntervalo++
		}

		senao se (numero>=76 e numero<=100){
			quartoIntervalo++
		}
		
		}
		escreva("No intervalo [0-25], foram digitados: ", primeiroIntervalo ," vezes")
		pulalinha()
		escreva("No intervalo [26-50], foram digitados: ", segundoIntervalo ," vezes")
		pulalinha()
		escreva("No intervalo [51-75], foram digitados: ", terceiroIntervalo ," vezes")
		pulalinha()
		escreva("No intervalo [76-100], foram digitados: ", quartoIntervalo ," vezes")

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 652; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */