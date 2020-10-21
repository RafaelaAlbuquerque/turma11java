package classes;

	import java.util.Scanner;
	
		public class SerVivo {
			
			Scanner leia = new Scanner (System.in);
			
			//atributos
			
			private String nome;
			public int idade;
			private String endereco;
			public char sexo;
			
			//construtor
			
			public SerVivo() {
				
			}
			
			//sobrecarga
			
			public SerVivo(String nome, int idade) {
				
				this.nome=nome;
				this.idade=idade;
				
			}
			
			// encapsulamento
			
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
			
			//métodos
			
			public void idade() {
				
			}
			
			public  void genero(char sexo){
				
			}
			
		}
