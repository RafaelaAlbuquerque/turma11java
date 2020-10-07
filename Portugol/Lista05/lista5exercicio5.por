programa
{
	/*
	 * 5- Faça um programa que leia um vetor de 5 posições para números reais e, depois, um
		código inteiro. Se o código for zero, finalize o programa; se for 1, mostre o vetor na
		ordem direta; se for 2, mostre o vetor na ordem inversa. Caso, o código for diferente
		de 1 e 2, escreva uma mensagem informando que o código inválido.
	 */
	funcao pulaLinha(){
		escreva("\n")
	}
	
	funcao inicio()
	{
		inteiro vetor [5]
		inteiro codigo = 0
		
		
		para (inteiro x=0;x<=4;x++){
			
			escreva("Digite a posição ", x, ": ")
			leia(vetor[x])
			limpa()
		}

		escreva("Digite 1 para ordem direta e 2 para ordem inversa: ")
		leia(codigo)

		se(codigo>2){
			escreva("Código inválido!")
		}

		senao se(codigo==1){
			para(inteiro x=0;x<=4;x++){
			escreva("Ordem direta - Posição ", x, ":", vetor[x])
			pulaLinha()
			}
		}
		
		senao se (codigo==2){
			para(inteiro x=4;x>=0;x--){
			escreva("Ordem inversa - Posição ", x, ":", vetor[x])
			pulaLinha()
			}
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 280; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */