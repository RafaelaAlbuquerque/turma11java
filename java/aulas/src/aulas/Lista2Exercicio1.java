package aulas;

public class Lista2Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1 - Informar todos os n�meros de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)
		 */
	
		System.out.println("N�meros de 1000 a 1999 que quando divididos por 11, obtemos resto = 5: ");
		for(int x= 1000;x<=1999;x++) {
			if(x%11==5){
				
				System.out.printf("- %d",x);
				System.out.println();
			}
		}
	
	
	
	}

}
