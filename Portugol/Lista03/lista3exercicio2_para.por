programa
{
	/*
	 * 2- Desenvolver um sistema que efetue a soma de todos os números ímpares que são
		múltiplos de três e que se encontram no conjunto dos números de 1 até 500.
	 * 
	 */
	funcao linha(){
		escreva("________________________________________")
	}

	funcao pulaLinha(){
		escreva("\n")
	}
	 
	funcao inicio()
	{
		
		inteiro x
		const inteiro LIMITE = 500
		inteiro soma=0

		para(x=1;x<=LIMITE;x++){
			se((x%3==0)e(x%2!=0)){
				soma=soma+x
				pulaLinha()
				escreva("\n O último valor somado foi: ",x, "\n O valor da soma é: ",soma)
				pulaLinha()
				linha()
			}
		}
	}

	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 592; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */