package objetos;

import java.util.Scanner;

import classes.ProdutoEletronico;

public class compraProdutoEletronico {
	public static void main(String[] args) {
	/*
	 * 3) Crie uma classe produto eletr�nico e apresente os atributos e m�todos
	referentes esta classe, em seguida crie um objeto produto eletr�nico,
	defina as instancias deste objeto e apresente as informa��es deste objeto
	no console.

	 */
	
	Scanner leia = new Scanner (System.in);
	ProdutoEletronico vendedor = new ProdutoEletronico(000.0);

	preco();
	vendedor.preco=leia.nextDouble();
	procedencia();
	vendedor.procedencia=leia.nextByte();
	expectativaVida();
	vendedor.expectativaVida=leia.nextInt();
	cor();
	vendedor.cor=leia.next();
	
	
	System.out.printf("---- Ficha T�cnica ----");
	System.out.println();
	System.out.printf("Pre�o: %.2f",vendedor.preco);
	System.out.println();
	System.out.printf("Cor: %s",vendedor.cor);
	System.out.println();
	System.out.printf("Procedencia: %s",vendedor.novoOuUsado(vendedor.procedencia));
	System.out.println();
	System.out.printf("Expectativa de vida: %d meses",vendedor.expectativaVida);
}
	public static void procedencia() {
		System.out.println("Este produto � 1-Usado ou � 2-Novo?");
	}

	public static void preco() {
		System.out.println("Quanto custa?");
	}
	
	public static void cor() {
		System.out.println("Qual a cor do produto?");
	}
	
	public static void expectativaVida() {
		System.out.println("Qual a expectativa de vida em meses?");
	}

}



