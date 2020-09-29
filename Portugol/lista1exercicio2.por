programa
{
	
	funcao inicio()
	{
		/*
		 * 2. Faça um sistema que leia a idade de uma pessoa expressa 
		 * em dias e mostre-a expressa em anos, meses e dias.
		 */

		 // variaveis

		 inteiro diasUsuario = 0
		 inteiro anos = 0
		 inteiro meses = 0
		 inteiro dias = 0

		 
		 

		// entrada

		escreva("Digite a sua idade em dias: ")
		leia(diasUsuario)

		limpa() // limpa console

		
		// processamento

		anos = (diasUsuario/365)
		meses = ( (diasUsuario%365) / 30 )
		dias = ( (diasUsuario%365) % 30 )

		
		// saída
		escreva("\n Total idade em anos: ",anos)
		escreva("\n Total idade em meses: ",meses)
		escreva("\n Total idade em dias: ",dias)

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 649; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */