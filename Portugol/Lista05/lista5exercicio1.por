programa
{
	inclua biblioteca Matematica --> mat
	
	funcao pulalinha()
	{
		escreva("\n")
	}
	
	funcao inicio()
	{
		/*
		 * 1-	Elabore um programa que calcule o que deve ser pago por um produto,
		 * considerando o preço normal de etiqueta e a escolha da condição de pagamento
		 * .Utilize os códigos da tabela a seguir para ler qual a condição de pagamento
		 * escolhida e efetuar o cálculo adequado.
			Código Condição de pagamento
			1 À vista em dinheiro ou cheque, recebe 20% de desconto
			2 À vista no cartão de crédito, recebe 15% de desconto
			3 Em duas vezes, preço normal de etiqueta sem juros
			4 Em três vezes, preço normal de etiqueta mais juros de 10%
		 *
		 */
		 
		const inteiro LIMITE=4
		cadeia produtos[] = {"Camisa","Calça","Camiseta","Vestido"}
		real precos[] = {100.00, 300.50, 90.75, 250.00}
		inteiro x
		inteiro codigo
		inteiro formaPagamento
		real valorPagamento=0.0, valorParcela=0.0

		para (x = 0; x<LIMITE;x++){
			escreva("Código produto ",x+1," ",produtos[x],"  R$ ",precos[x])
			pulalinha()
		}
		
		
		escreva("Informe o código do produto desejado: ")
		leia(codigo)
		
		se (codigo==0 ou codigo>4){
			escreva("Você escolheu uma opção inválida")
			pulalinha()
		}
		senao{
			codigo= codigo-1
			limpa()
			escreva("Vc escolheu ",produtos[codigo]," no valor de ", precos[codigo])
			pulalinha()
			escreva("Qual a forma de pagamento desejada: ")
			pulalinha()
			escreva("1- À vista em dinheiro ou cheque, recebe 20% de desconto")
			pulalinha()
			escreva("2- À vista no cartão de crédito, recebe 15% de desconto")
			pulalinha()
			escreva("3- Em duas vezes, preço normal de etiqueta sem juros")
			pulalinha()
			escreva("4- Em três vezes, preço normal de etiqueta mais juros de 10%")
			pulalinha()
			escreva("Digite o número da opção:")
			leia(formaPagamento)

			

			escolha(formaPagamento){
				
				caso 1:
					valorPagamento = ((precos[codigo])-(precos[codigo]*0.20))
					escreva("Preço com 20% de desconto: ",valorPagamento)
				pare
				
				caso 2:
					valorPagamento = ((precos[codigo])-(precos[codigo]*0.15))
					escreva("Preço com 15% de desconto: ",valorPagamento)
				pare
				
				caso 3:
					escreva("Preço normal sem juros: ", precos[codigo] ,"\nValor de cada parcela: ",(precos[codigo])/2)
				pare
				
				caso 4:
					valorPagamento = ((precos[codigo])+(precos[codigo]*0.10))
					valorParcela = (valorPagamento/3)
					valorParcela = mat.arredondar(valorParcela, 2)
					escreva("Preço normal com 10% de juros: ", valorPagamento ,"\nValor de cada parcela: ",valorParcela)
				pare
				
				caso contrario:
					escreva("Opção inválida")
			}
			
			
		}
			
		
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */