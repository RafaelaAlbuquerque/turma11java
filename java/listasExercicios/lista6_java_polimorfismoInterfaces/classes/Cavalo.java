package classes;

public class Cavalo extends Animal {
	
	public Cavalo() {
		super();
	}
	
	@Override
	public void emitirSom(){
		System.out.println("Hiin in in");
	}
	
	public void correr() {
		System.out.println("O cavalo está correndo...");
	}
}
