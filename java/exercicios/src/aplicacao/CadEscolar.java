package aplicacao;

import java.util.Scanner;

import entidades.Aluno;
import entidades.Professor;

public class CadEscolar {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		// Dados primeiro professor
		/*
		 * Professor primeiro = new Professor ();
		char info;
		
		System.out.print("Digite o seu nome: ");
		primeiro.nome=leia.next().toUpperCase();
		System.out.print("Digite o sexo, M- masculino, F -feminino ou O-outros: ");
		primeiro.sexo=leia.next().toUpperCase().charAt(0);
		System.out.print("Digite a especialidade: ");
		primeiro.especialidade=leia.next().toUpperCase();	
		System.out.print("Digite o ano de nascimento: ");
		primeiro.anoNascimento=leia.nextInt();
		System.out.print("O professor é F-fixo ou C-convidado: ");
		info=leia.next().toUpperCase().charAt(0);
		
		if(info=='C') {
			primeiro.convidado=true;
		}
		else {
			primeiro.convidado=false;
		}
		
		System.out.println("Dados do primeiro professor: ");
		System.out.println("Nome: "+primeiro.nome);
		System.out.println("Sexo: "+((primeiro.sexo=='F')?"Feminino":(primeiro.sexo=='M')?"Masculino":"Outros"));
		System.out.println("Idade: "+ (2020-primeiro.anoNascimento));
		
		 */
		
		//Dados alunos
		Aluno primeiro = new Aluno();
		String situacao;
		System.out.print("Digite o seu nome: ");
		primeiro.nome=leia.next().toUpperCase();
		
		System.out.print("Digite o sexo, M- masculino, F -feminino ou O-outros: ");	
		primeiro.sexo=leia.next().toUpperCase().charAt(0);
		
		System.out.print("Digite o ano de nascimento: ");
		primeiro.anoNascimento=leia.nextInt();
		
		System.out.print("Digite o nome do curso: ");
		primeiro.curso=leia.next().toUpperCase();
		
		System.out.println("Digite sua nota geral: ");
		primeiro.notaGeral=leia.nextFloat();
		
		if(primeiro.notaGeral>=5) {
			situacao="Aprovado";
		}
		else {
			situacao="Reprovado";
		}
		
		
		System.out.println("Primeiro Aluno:");
		System.out.println("Nome: "+primeiro.nome);
		System.out.println("Sexo: "+((primeiro.sexo=='F')?"Feminino":(primeiro.sexo=='M')?"Masculino":"Outros"));
		System.out.println("Idade: "+ (2020-primeiro.anoNascimento));
		System.out.println("Curso: "+primeiro.curso);
		System.out.println("Nota geral: "+(primeiro.notaGeral)+" Situação: "+(situacao));
		;
		
		
		
		leia.close();	
	}

	
			
}
