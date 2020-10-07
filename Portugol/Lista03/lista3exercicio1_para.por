programa
{
	/*
	 * 1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
	coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:
	a) média do salário da população;
	b) média do número de filhos;
	c) maior salário;
	d) percentual de pessoas com salário até R$100,00.
	- Usar laço para
	 */
	funcao pulaLinha(){
		escreva("\n") 
	}
	funcao inicio()
	{

		const inteiro HABITANTES = 20
		real salario = 0.0, maiorSalario = 0.0
		inteiro filhos = 0
		inteiro percentualSalario = 0
		real mediaFilhos = 0.0, mediaSalario = 0.0, somaSalario = 0.0, somaFilhos = 0

		para(inteiro x=1;x<=HABITANTES;x++){
			escreva("Habitante número: ", x , ", por favor informe o seu salário: ")
			leia(salario)
			pulaLinha()
			escreva("Habitante número ", x ,", por favor informe o número de filhos: ")
			leia(filhos)
			limpa()
			
			se (salario<=100){
				percentualSalario = percentualSalario + 1
			}
			
			se (salario>maiorSalario){
				maiorSalario =salario				
			}

			somaSalario= (somaSalario + salario)
			somaFilhos = (somaFilhos + filhos)
		}

		
		mediaFilhos = (somaFilhos/HABITANTES)
		mediaSalario = (somaSalario/HABITANTES)
		escreva("A média do número de filhos é: ", mediaFilhos)
		
		pulaLinha()
		escreva("A média do salário é: ", mediaSalario)
		pulaLinha()
		escreva("Números de habitantes com salário igual ou menor que 100: ", percentualSalario)
		pulaLinha()
		escreva("Percentual de habitantes com salário igual ou menor que 100: ", percentualSalario*5, " %")
		pulaLinha()
		escreva("O maior salário é: ",maiorSalario)




	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1584; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */