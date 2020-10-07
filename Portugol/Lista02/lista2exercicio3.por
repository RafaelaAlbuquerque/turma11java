programa
{
	
	/*
	 * 3) Desenvolva um sistema em que:
	Leia 4 (quatro) números;
	Calcule o quadrado de cada um;
	Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
	Caso contrário, imprima os valores lidos e seus respectivos quadrados.
	 */
	 
	funcao inicio()
	{
		real num1 =0, num2 = 0, num3 =0, num4 = 0
		
		escreva("Digite o primeiro número: ")
		leia(num1)
		escreva("Digite o segundo número: ")
		leia(num2)
		escreva("Digite o terceiro número: ")
		leia(num3)
		escreva("Digite o quarto número: ")
		leia(num4)

		limpa()

		se (num3*num3>=1000){
			escreva(" O quadrado do terceiro número é: 1000")
		}

		senao{
			escreva("\n O quadrado do primeiro número é: ", num1*num1)
			escreva("\n O quadrado do segundo número é: ", num2*num2)
			escreva("\n O quadrado do terceiro número é: ", num3*num3)
			escreva("\n O quadrado do quarto número é: ", num4*num4)
			
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 901; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */