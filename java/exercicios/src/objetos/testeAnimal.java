package objetos;

import classes.Cachorro;
import classes.Cavalo;
import classes.Preguica;


public class testeAnimal {
	public static void main(String[] args) {
	Preguica preguica = new Preguica();
	Cachorro cachorro = new Cachorro();
	Cavalo cavalo = new Cavalo();

	preguica.emitirSom();
	cachorro.emitirSom();
	cavalo.emitirSom();
	
	}
}
