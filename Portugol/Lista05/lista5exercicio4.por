programa
{
	/*
	 * 4- Faça um programa que calcula e escreve a seguinte soma: soma = 1/1 + 3/2 + 5/3 + 7/4
		+ ... + 99/50
	 */
	funcao pulaLinha(){
		escreva("\n")
	}
	
	funcao inicio()
	{
	
		inteiro somax = 0
		inteiro somay = 0
		inteiro x=1
		inteiro y=1
		somax= x
		somay=y

			para(x=1;somax<=99;x++){
			escreva(somax, "/", somay)
			somax= somax+2
			somay=somay+1
			pulaLinha()
			
			}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 389; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */