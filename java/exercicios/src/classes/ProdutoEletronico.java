package classes;

public class ProdutoEletronico {
	//atributos
	public double preco;
	public int expectativaVida;
	public String cor;
	public byte procedencia;
	
	//construtor
	public ProdutoEletronico(double valor) {
		this.preco=valor;
	}
	
	//sobrecarga
	public ProdutoEletronico(float valor, byte origem) {
		this.preco=valor;
		this.procedencia=origem;
	}
	
	//metodos
	
	public String genero (char sexo) {
		return ((sexo=='F')?"Feminino":(sexo=='M')?"Masculino":"Outrxs");
	}
	
	public String novoOuUsado (byte procedencia) {
		return ((procedencia==1)?"Novo":"Usado");
	}
}
