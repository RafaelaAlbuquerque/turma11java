package objeto;

import java.util.Scanner;



import classe.Aviao;

public class DadosEmbarqueAviao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2) Crie uma classe avião e apresente os atributos e métodos referentes
			esta classe, em seguida crie um objeto avião, defina as instancias deste
			objeto e apresente as informações deste objeto no console.
		 */
		Scanner leia = new Scanner(System.in);
		//INSTANCIAR
		Aviao passageiro1 = new Aviao(" ");
		Aviao passageiro2 = new Aviao(" "," "," ");
		
		
		//perguntaNome();
		//passageiro2.nome=leia.next();
		
		perguntaGenero();		
		passageiro2.sexo=leia.next().toUpperCase().charAt(0);
		
		perguntaAnoNascimento();
		passageiro2.anoNascimento=leia.nextInt();
		
		perguntaPassaporte();
		passageiro2.passaporte=leia.next();
		
		perguntaNacionalidade(); 
		passageiro2.nacionalidade=leia.next();
		
		perguntaDestino();
		passageiro2.destino=leia.next();
		
		passageiro2.pegarDados();
		System.out.printf("Nome: %s",passageiro2.nome);
		System.out.println();
		System.out.printf("Idade: %d",passageiro2.idade());
		System.out.println();
		System.out.printf("Gênero: %s",passageiro2.genero(passageiro2.sexo));
		System.out.println();
		System.out.printf("Passaporte: %s", passageiro2.passaporte);
		System.out.println();
		System.out.printf("Nacionalidade: %s", passageiro2.nacionalidade);
		System.out.println();
		System.out.printf("Destino: %s", passageiro2.destino);
		
		
		
		
		
		leia.close();
	}
	
	public static void perguntaNome(){
		System.out.println("Digite o seu nome: ");
	}
	
	public static void perguntaAnoNascimento() {
		System.out.println("Digite o ano de nascimento: ");
	}
	
	public static void perguntaGenero() {
		System.out.println("Digite F-feminino, M-masculino, O-outrxs: ");
	}
	
	public static void perguntaPassaporte() {
		System.out.println("Informe o passaporte: ");
	}
	
	public static void perguntaNacionalidade() {
		System.out.println("Digite a nascionalidade: ");
	}

	public static void perguntaDestino() {
		System.out.println("Digite o destino escolhido: ");
	}
}
