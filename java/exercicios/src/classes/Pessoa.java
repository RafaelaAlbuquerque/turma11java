package classes;

public class Pessoa {
	/*
	 * 1. Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos seletores
	(getters) e modificadores (setters), e ainda o construtor padr�o e pelo menos mais duas
	op��es de construtores conforme sua percep��o. Atributos: String nome; String endere�o;
	String telefone;

	 */
	//atributos
	private String nome; 
	private String endereco;
	private String telefone;

	//construtor padr�o
	public Pessoa() {
		
	}
	
	//sobrecarga
	public Pessoa(String nome) {
		this.nome=nome;
	}
	
	public Pessoa(String nome, String endereco) {
		this.nome=nome;
		this.endereco=endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
