package portugol;
import java.util.Scanner;
public class Lista1Exercicio1 {
	public static void main(String[] args) {
		
		int totalAnos = 0, totalMeses = 0, totalDias = 0, totalDiasFinal = 0;
		
		//criar um teclado dentro do programa
				Scanner tec = new Scanner(System.in); //criou o teclado
		
		System.out.println("Digite total de anos: ");
		totalAnos = tec.nextInt();
		System.out.println("Digite total de meses: ");
		totalMeses = tec.nextInt();
		System.out.println("Digite total de dias: ");
		totalDias = tec.nextInt();
		
		totalDiasFinal = (totalDias +(totalAnos*365) + (totalMeses*30));
		
		System.out.printf("Sua idade total em dias é: %s", totalDiasFinal);
	}
}
