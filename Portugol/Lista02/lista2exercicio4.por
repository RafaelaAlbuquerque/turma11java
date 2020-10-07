programa
{
	
	/*
	 * 4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este
	número é par ou ímpar, e se é positivo ou negativo.
	 */
	 
	funcao inicio()
	{
		inteiro numero = 0, par = 0, impar = 0, positivo = 0, negativo = 0

		escreva("Digite um número inteiro: ")
		leia(numero)

		se ( (numero % 2 == 0 ) e (numero>0) ){
			escreva("Este número é par e positivo")
		}

		senao se ( (numero % 2 != 0 ) e (numero>0) ){
			escreva("Este número é impar e positivo")
		}

		senao se ( (numero % 2 == 0 ) e (numero<0) ){
			escreva("Este número é par e negativo")
		}

		senao se (numero == 0){
			escreva("O zero é um número neutro, ou seja, não é um número nem positivo e nem negativo. E compartilha todas as propriedades comuns a todos os números pares, portanto, conclui-se que ele é par!")
		}

		senao {
			escreva("Este número é impar e negativo")
		}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 883; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */