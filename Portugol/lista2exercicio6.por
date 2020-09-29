programa
{
	/*
	 * 6) Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes
	categorias:
	Infantil A = 5 a 7 anos
	Infantil B = 8 a 11 anos
	Juvenil A = 12 a 13 anos
	Juvenil B = 14 a 17 anos
	Adultos = Maiores de 18 anos
	 */
	 
	funcao inicio()
	{
		inteiro idade = 0,infantilA = 0, infantilB = 0, juvenilA = 0, juvenilB = 0, adultos = 0

		
		escreva("Digite a sua idade: ")
		leia(idade)

		limpa ()

		se (idade>=18){
			escreva(" Você é adulto! ")
		}

		senao se (idade>=5 e idade<=7) {
			escreva("Você é infantil A!")
		}

		senao se (idade>=8 e idade<=11) {
			escreva("Você é infantil B!")
		}

		senao se (idade>=12 e idade<=13) {
			escreva("Você é juvenil A!")
		}

		senao se (idade>=14 e idade<=17) {
			escreva("Você é juvenil B!")
		}

		senao {
			escreva ("Esta idade não possui categoria")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 794; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */