programa
{
	inclua biblioteca Matematica --> mat
	
	
	/*
	 
	 * O IMC – Índice de Massa Corporal é um critério da Organização Mundial de Saúde para dar 
		uma indicação sobre a condição de peso de uma pessoa adulta. A fórmula é IMC = peso / ( altura )2 
		Elabore um programa que leia o peso e a altura de um adulto e mostre sua condição de acordo com 
		a tabela abaixo. 
		IMC em adultos Condição 
		Abaixo de 18,5 Abaixo do peso 
		Entre 18,5 e 25 Peso normal 
		Entre 25 e 30 Acima do peso 
		Acima de 30 obeso

	 */
	 
	funcao inicio()
	{
		real peso = 0.0,  altura = 0.0, imc = 0.0
		
		escreva("Digite o seu peso: ")
		leia(peso)
		escreva("Digite a sua altura: ")
		leia(altura)
		
		imc = peso / (altura*altura)

		imc = mat.arredondar(imc, 2)
		

		limpa()


		se(imc<18.5){
			escreva("Seu imc é: ", imc, " Classificado como: Abaixo do peso")
		}

		senao se (imc<25){
			escreva("Seu imc é: ", imc, " Classificado como: Peso normal")
		}

		senao se (imc<30){
			escreva("Seu imc é: ", imc, " Classificado como: Acima do peso")
		}

		senao {
			escreva("Seu imc é: ", imc, " Classificado como: obeso")
		}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 767; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */