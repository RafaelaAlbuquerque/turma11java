package classes;

	import java.util.Scanner;

		public class Animal extends SerVivo {
			
			Scanner leia = new Scanner (System.in);
		
			//atributos
			
			private String especie;
			private String raca;
			public boolean castrado;
			
			//construtor
		
			public Animal () {
				
				super();
				
			}
			
			//sobrecarga
			
			public Animal(String especie, String raca, boolean castrado) {
				
				this.especie=especie;
				this.raca=raca;
				this.castrado=castrado;
				
			}
			
			//encapsulamento
			
			public String getEspecie() {
				
				return especie;
				
			}
			
			public void setEspecie(String especie) {
				
				this.especie = especie;
				
			}
			
			public String getRaca() {
				
				return raca;
				
			}
			

			public void setRaca(String raca) {
				
				this.raca = raca;
				
			}

			@Override
			public void idade() {
				
				System.out.print("★ Digite a idade em meses: ");
				super.idade=leia.nextInt();
				
			}
			
			//@Override
			public void genero(char sexo){
				
				System.out.print("★ Digite F-fêmea M-macho para o genero do pet: ");
				super.sexo=leia.next().toUpperCase().charAt(0);
				
			}
			
			//métodos
			
			public void petNome(){
				
				System.out.print("★ Digite o nome do pet: ");
				super.setNome(leia.next().toUpperCase());
				
			}
			
			public void especie(){
				
				System.out.print("★ Digite a espécie do pet: ");
				especie=leia.next();
				
			}
			
			public void raca(){
				
				System.out.print("★ Digite a raça do pet: ");
				raca=leia.next();
				
			}
				
			public void castrado() {
				
				System.out.print("★ O pet é castrado?Se sim digite 'true' ou 'false' caso contrario:");
				castrado=leia.nextBoolean();
			
			}
		
		}
