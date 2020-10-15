package aplicacao;

import java.util.Scanner;

import entidades.Aviao;



public class DadosEmbarqueAviao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2) Crie uma classe avião e apresente os atributos e métodos referentes
			esta classe, em seguida crie um objeto avião, defina as instancias deste
			objeto e apresente as informações deste objeto no console.
		 */
		Scanner leia = new Scanner(System.in);
		
		Aviao primeiro = new Aviao();
		
		
		System.out.print("Digite o seu nome: ");
		primeiro.nome=leia.next().toUpperCase();
		
		System.out.print("Digite o sexo, M- masculino, F -feminino ou O-outros: ");	
		primeiro.sexo=leia.next().toUpperCase().charAt(0);
		
		System.out.print("Digite o ano de nascimento: ");
		primeiro.anoNascimento=leia.nextInt();
		
		System.out.print("Digite o seu CPF: ");
		primeiro.cpf=leia.next().toUpperCase();
		
		System.out.print("Digite o seu passaporte: ");
		primeiro.passaporte=leia.next().toUpperCase();
		
		System.out.print("Digite o seu destino: ");
		primeiro.destino=leia.next().toUpperCase();
		
		System.out.println("Primeiro Passageiro:");
		System.out.println("Nome: "+primeiro.nome);
		System.out.println("Sexo: "+((primeiro.sexo=='F')?"Feminino":(primeiro.sexo=='M')?"Masculino":"Outros"));
		System.out.println("Idade: "+ (2020-primeiro.anoNascimento));
		System.out.println("Destino: "+primeiro.destino);
		System.out.println("CPF: "+primeiro.cpf);
		System.out.println("Passaporte: "+primeiro.passaporte);
		;
		
		
		leia.close();
	}

}
