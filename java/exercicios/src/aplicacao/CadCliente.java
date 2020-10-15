package aplicacao;

import java.util.Scanner;

import entidades.Cliente;



public class CadCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 1) Crie uma classe cliente e apresente os atributos e métodos referentes
		esta classe, em seguida crie um objeto cliente, defina as instancias deste
		objeto e apresente as informações deste objeto no console.
		 */
		Scanner leia = new Scanner(System.in);
		
		Cliente primeiro = new Cliente();
		
		
		System.out.print("Digite o seu nome: ");
		primeiro.nome=leia.next().toUpperCase();
		
		System.out.print("Digite o sexo, M- masculino, F -feminino ou O-outros: ");	
		primeiro.sexo=leia.next().toUpperCase().charAt(0);
		
		System.out.print("Digite o ano de nascimento: ");
		primeiro.anoNascimento=leia.nextInt();
		
		System.out.print("Digite o seu CPF: ");
		primeiro.cpf=leia.next().toUpperCase();
		
		
		
		System.out.println("Primeiro Cliente:");
		System.out.println("Nome: "+primeiro.nome);
		System.out.println("Sexo: "+((primeiro.sexo=='F')?"Feminino":(primeiro.sexo=='M')?"Masculino":"Outros"));
		System.out.println("Idade: "+ (2020-primeiro.anoNascimento));
		System.out.println("CPF: "+primeiro.cpf);
		;
		
		
		leia.close();
	}

}
