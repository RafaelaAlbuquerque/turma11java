package aulas;
import java.util.Scanner;
public class ExercicioBeneficio {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		String nome;
		int anoNascimento, idade;
		char chefeFamilia, sexo;
		System.out.print("Digite seu nome: ");
		nome = tec.next();
		System.out.print("Digite seu ano de nascimento: ");
		anoNascimento = tec.nextInt();
		System.out.print("Voc� � chefe de fam�lia (s) ou (n): ");
		chefeFamilia = tec.next().toLowerCase().charAt(0);
		System.out.print("Voc� � masculino ou feminino (m) ou (f): ");
		sexo = tec.next().toLowerCase().charAt(0);
		
		idade = 2020 - anoNascimento;
		
		if (idade >= 18 && chefeFamilia == 's') {
			if (sexo == 'f') {
				System.out.printf("Ol�, %s, voc� tem direito a R$ 1200,00", nome);
			} else {
				System.out.printf("Ol�, %s, voc� tem direito a R$ 600,00", nome);
			}
		} else {
			System.out.printf("Ol�, %s, voc� n�o tem direito ao aux�lio emergencial", nome);
		}
		
		tec.close();
	}
}
