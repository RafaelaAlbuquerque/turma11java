package classe;

public class Cliente {
	
	//ATRIBUTOS
	public String nome;
	public String cpf;
	public char sexo;
	public int anoNascimento;
	
	//CONSTRUTOR (mesmo nome da classe)
	public Cliente(String nome) {
		this.nome=nome;
	}
	//SOBRECARGA DO CONSTRUTOR (mesmo nome da classe)
	public Cliente(String nome, int anoNascimento, String cpf) {
		this.nome=nome;
		this.anoNascimento=anoNascimento;
		this.cpf=cpf;
	}
	//METODO (só usa dentro da classe)
	public int idade () {
		int anoAtual=2020;
		return anoAtual - anoNascimento;
	}
	
	public String genero (char sexo) {
		return ((sexo=='F')?"Feminino":(sexo=='M')?"Masculino":"Outrxs");
	}
}

