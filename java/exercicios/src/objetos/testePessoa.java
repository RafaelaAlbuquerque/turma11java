package objetos;

import java.util.Scanner;

import classes.Fornecedor;

public class testePessoa {
	public static void main (String[] args) {
	/*
	 * 2. Considere, como subclasse da classe Pessoa (desenvolvida no exercício anterior) a classe
		Fornecedor. Considere que cada instância da classe Fornecedor tem, para além dos atributos
		que caracterizam a classe Pessoa, os atributos valorCredito (correspondente ao crédito
		máximo atribuído ao fornecedor) e valorDivida (montante da dívida para com o fornecedor).
		Implemente na classe Fornecedor, para além dos usuais métodos seletores e modificadores,
		um método obterSaldo() que devolve a diferença entre os valores dos atributos valorCredito e
		valorDivida. Depois de implementada a classe Fornecedor, crie um programa de teste
		adequado que lhe permita verificar o funcionamento dos métodos implementados na classe
		Fornecedor e os herdados da classe Pessoa.
	
	 */

	Scanner leia= new Scanner (System.in);
	Fornecedor pessoa1 = new Fornecedor ();
	
	nome();
	pessoa1.setNome(leia.next());
	
	endereco();
	pessoa1.setEndereco(leia.next());
	
	telefone();
	pessoa1.setTelefone(leia.next());
	
	valorCredito();
	pessoa1.setValorCredito(leia.nextDouble());
	
	valorDivida();
	pessoa1.setValorDivida(leia.nextDouble());
	
	
	
	System.out.println("-----Dados Fornecedor-----");
	System.out.printf("Nome: %s",pessoa1.getNome());
	System.out.println();
	System.out.printf("Telefone: %s",pessoa1.getTelefone());
	System.out.println();
	System.out.printf("Endereço: %s",pessoa1.getEndereco());
	System.out.println();
	System.out.printf("Crédito: %.2f Dívida:%.2f  Saldo: %.2f",pessoa1.getValorCredito(),pessoa1.getValorDivida(),pessoa1.obterSaldo(pessoa1.getValorCredito(),pessoa1.getValorDivida()));
}


	public static void nome() {
		System.out.print("Digite o nome: ");
	}
	
	public static void endereco() {
		System.out.print("Digite o endereço: ");
	}
	public static void telefone() {
		System.out.print("Digite o telefone: ");
	}
	public static void valorCredito() {
		System.out.print("Digite o crédito: ");
	}
	public static void valorDivida() {
		System.out.print("Digite a dívida: ");
	}
}