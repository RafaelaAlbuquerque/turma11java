package classe;

import java.util.Scanner;

public class Aviao {
	
	//ATRIBUTOS
	public String nome;
	public String destino;
	public String nacionalidade;
	public String passaporte;
	public char sexo;
	public int anoNascimento;
	int anoAtual=2020;
	//CONSTRUTOR (mesmo nome da classe)
	
	public Aviao(String nome) {
		this.nome = nome;
		
	}
	
	//SOBRECARGA DO CONSTRUTOR (mesmo nome da classe)
	
	public Aviao(String nome,String nacionalidade, String destino) {
	this.nome = nome;
	this.nacionalidade=nacionalidade;
	this.destino=destino;
	}
	
	//METODO (só usa dentro da classe)
	public int idade () {
		return anoAtual - anoNascimento;
	}
	
	public String genero (char sexo) {
		return ((sexo=='F')?"Feminino":(sexo=='M')?"Masculino":"Outrxs");
	}
	
	public void pegarDados(){
		Scanner leia = new Scanner (System.in);
		System.out.println("Escreva seu nome: ");
		nome=leia.next();
	}
}
