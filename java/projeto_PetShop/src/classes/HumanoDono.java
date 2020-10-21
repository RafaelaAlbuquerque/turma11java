package classes;

	import java.util.Scanner;

		public class HumanoDono extends SerVivo {
			
			Scanner leia = new Scanner (System.in);
			
			//atributos
			
			private String rg;
			private String cpf;
		
			//construtor 
			
			public HumanoDono () {
				
				super();
				
			}
			
			//sobrecarga
			
			public HumanoDono (String rg,String cpf) {
				
				this.rg=rg;
				this.cpf=cpf;
				
			}
		
			
			
			//encapsulamento
			
			public String getRg() {
				
				return rg;
				
			}
		
		
			public String getCpf() {
				
				return cpf;
				
			}
			
			@Override
			
			public void idade() {
				
				System.out.print("★ Digite a idade em anos: ");
				super.idade=leia.nextInt();
				
			}
			
			@Override
			
			public void genero(char sexo){
				
				System.out.print("★ Digite para seu gênero, F-feminino M-masculino O-outrx: ");
				super.sexo=leia.next().toUpperCase().charAt(0);
				
			}
			
			//métodos
			
			public void rg() {
				
				System.out.print("★ Digite o seu RG: ");
				rg=leia.next();
				
			}
			
			public void cpf() {
				
				System.out.print("★ Digite o seu CPF: ");
				cpf=leia.next();
				
			}
		   
		   public void nome() {
			   
			    System.out.print("★ Digite o seu nome: ");
			    super.setNome(leia.next());
			    
		   }
		   
		  public void endereco() {
			  
			  System.out.print("★ Digite o seu endereço: ");
			  super.setEndereco(leia.next());
			  
		  }
		   
	
				
		}
	


