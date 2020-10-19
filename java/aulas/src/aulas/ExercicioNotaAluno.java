package aulas;

import java.util.Scanner;

public class ExercicioNotaAluno {

	public static void main(String[] args) {
	
		Scanner leia= new Scanner (System.in);
		
		String nomeAlunos[]={"Bruna dos Santos", "Bruno Correia da Costa", "Bruno de Freitas Sousa", "Carla Cristina Conceição de Paula", "Christian Garcia Amantino", "Cleiton Ortega dos Santos", "Debora Miranda Carmona", "Everton Luiz Rosário de Oliveira", "Gabriel Reis Ritter", "Gildenor Junior da Silva Costa", "Guilherme Marcionilo Pedroso do Rosario Silva", "Herick Willians Canhete Rocha", "Jacqueline Alves Barbosa", "João Victor dos Santos Rigoleto", "Jonas De Oliveira Santos", "Jonathan Cavalcanti De Paula", "Juliana Cavalaro de Oliveira", "Karina Soares Lima", "Larissa Meira Dominguez", "Leonardo Iamur Terra", "Lysandro Andrade Martin", "Matheus Araujo de moraes", "Matheus Fernandes Rodrigues", "Matheus Trindade Torok", "Mônica dos santos ribeiro", "Natália Lopes moreno", "Phelipe Almeida de Souza", "Rafaela de Albuquerque", "Ricardo Martins Corrêa", "Sarah Lidia De Oliveira Braia", "Stefanie Dias Costa", "Tiago Diniz Gomes", "Victor Augusto de Souza Tavares", "Vivian Rodrigues Nakano", "Washington pereira dos santos", "Wellington Vieira", "Wesley Bueno da Silva", "Yago Tonoli Domingues", "Zaine de Queiros Jesus"};
		int codigoAluno=0, y=0;
		int notasAlunos[]=new int [nomeAlunos.length];
		
		
		for(int x=0;x<nomeAlunos.length;x++) {
			System.out.print("Digite o código do aluno: ");
			codigoAluno=leia.nextInt();
			y = codigoAluno-1;
			System.out.printf("Digite a nota do aluno %s: ",nomeAlunos[y]);
			System.out.println();
		}
		
		
		
		
		
		
		
		leia.close();
		
	}

}
