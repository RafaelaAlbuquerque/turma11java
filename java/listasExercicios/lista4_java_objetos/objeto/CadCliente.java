package objeto;

import java.util.Scanner;

import classe.Cliente;


public class CadCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 1) Crie uma classe cliente e apresente os atributos e métodos referentes
		esta classe, em seguida crie um objeto cliente, defina as instancias deste
		objeto e apresente as informações deste objeto no console.
		 */
		Scanner leia = new Scanner(System.in);
		
		Cliente primeiro = new Cliente(" ");
		
		
		nome();
		primeiro.nome=leia.next().toUpperCase();
		
		sexo();
		primeiro.sexo=leia.next().toUpperCase().charAt(0);
		
		anoNascimento();
		primeiro.anoNascimento=leia.nextInt();
		
		cpf();
		primeiro.cpf=leia.next().toUpperCase();
		
		
		
		System.out.println("---Primeiro Cliente---");
		System.out.println("Nome: "+primeiro.nome);
		System.out.println("Sexo: "+primeiro.genero(primeiro.sexo));
		System.out.println("Idade: "+ primeiro.idade());
		System.out.println("CPF: "+primeiro.cpf);
		;
		
		
		leia.close();
	}
	
	public static void nome() {
		System.out.print("Digite o seu nome: ");
	}
	
	public static void cpf() {
		System.out.print("Digite o seu CPF: ");
	}

	public static void sexo() {
		System.out.print("Digite o sexo, M- masculino, F -feminino ou O-outros: ");	
	}

	public static void anoNascimento() {
		System.out.print("Digite o ano de nascimento: ");
	}
}
