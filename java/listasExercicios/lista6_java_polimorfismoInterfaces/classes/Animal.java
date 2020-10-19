package classes;

public class Animal {

	//atributos
	private String nome;
	private int idade;

	//costrutor padrao
	
	public Animal() {
		
	}
	
	//sobrecarga
	
	public Animal(String nome) {
		this.nome=nome;
	}
	
	//Encapsulamento 
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//metodo 
	public void emitirSom() {
		
	}
	
}
