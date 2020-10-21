package programa;

	import java.util.Scanner;
	import classes.Animal;
	import classes.HumanoDono;

		public class PetShop {
			
			public static void main(String[] args) {
				
			   HumanoDono dono = new HumanoDono();
			   Animal pet = new Animal ();
			   Scanner leia= new Scanner (System.in);
			
			   fichaTecnica();
			   System.out.println();
			   dono.nome();
			   dono.idade();
			   dono.genero(dono.sexo);
			   dono.rg();
			   dono.cpf();
			   dono.endereco();
			  
				
			   pet.petNome();
			   pet.especie();
			   pet.raca();
			   pet.idade();
			   pet.genero(pet.sexo);
			   pet.castrado();
			   
			   for(int i=0;i<10;i++) {
				   System.out.println();
			   }
			   
			   System.out.println("━━★━━━━ ★ "+ (pet.getNome())+" ★ ━━━━★━━");
			   System.out.printf("★ Espécie: %s",pet.getEspecie());
			   System.out.println();
			   System.out.printf("★ Raça: %s",pet.getRaca());
			   System.out.println();  
			   System.out.printf("★ Meses: %d",pet.idade);
			   System.out.println();
			   System.out.printf("★ Gênero: %s", ((pet.sexo=='F')?"Fêmea":"Macho"));
			   System.out.println();
			   System.out.printf("★ Castrado: %s", pet.castrado==true?"Sim":"Não");
			   System.out.println();
			   linha();
			   System.out.println();
			   System.out.printf("★ Endereço: %s",dono.getEndereco() );
			   System.out.println();
			   linha();
			   System.out.println();
			   System.out.printf("★ Dono: %s",dono.getNome());
			   System.out.println();
			   System.out.printf("★ CPF: %s",dono.getCpf() );
			   System.out.println();	   
			   System.out.printf("★ RG: %s",dono.getRg() );
			   System.out.println();
			   System.out.printf("★ Idade: %d",dono.idade);
			   System.out.println();
			   System.out.printf("★ Genero: %s", ((dono.sexo=='F')?"Feminino":(dono.sexo=='M')?"Masculino":"Outrxs"));
			   System.out.println();  
			   linha();
			}
			
			public static void fichaTecnica() {
			System.out.print("━━━━━━━ ★ Dados Cadastrais ★ ━━━━━━━");
			}
			
			public static void linha() {
			System.out.print("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			}
		}
