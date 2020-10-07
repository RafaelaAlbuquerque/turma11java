programa
{
	
	funcao inicio()
	{
		inteiro anos = 0
		inteiro meses = 0
		inteiro dias = 0
		inteiro totalDias = 0
		
		escreva("Digite os anos: ")
		leia(anos)
		escreva("Digite os meses: ")
		leia(meses)
		escreva("Digite os dias: ")
		leia(dias)

		totalDias = ( (anos*365) + (meses*30) + dias )

		escreva("Você viveu : " + totalDias + " dias")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 342; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */