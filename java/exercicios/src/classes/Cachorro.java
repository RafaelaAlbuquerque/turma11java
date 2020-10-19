package classes;

public class Cachorro extends Animal {

	public Cachorro() {
		super();
	}
	
	
	
	public Cachorro(String nome) {
		super(nome);
		
	}
   
	@Override	
	public void emitirSom(){
		System.out.println("Au Au Au..");
	}
	
	
	public void correr() {
		System.out.println("O cachorro está correndo...");
	}
	
	
	
}
