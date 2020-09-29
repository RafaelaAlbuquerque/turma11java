programa
{
	
	funcao inicio()
	{
		cadeia nomeUsuario
		inteiro anoNascimento
		real salarioUsuario
		inteiro idadeUsuario = 0
		
		escreva("Digite o nome do usuário: ")
		leia(nomeUsuario)
		
		escreva("Digite o ano de nascimento: ")
		leia(anoNascimento)
		
		escreva("Digite o salário do usuário: ")
		leia(salarioUsuario)

		idadeUsuario = 2020 - anoNascimento
		
		escreva("\n Meu nome é ", nomeUsuario )
		escreva("\n Nasci em ",anoNascimento)
		escreva("\n Meu salário é ",salarioUsuario)
		escreva("\n Minha idade é " + idadeUsuario + " anos")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 545; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */