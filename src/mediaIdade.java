import java.util.Locale;
import java.util.Scanner;

public class mediaIdade {

	public static void main(String[] args) {
		Locale.setDefault ( Locale.US );
		Scanner sc = new  Scanner (System.in);
		
		int idade, pessoas;
		double soma, media;
		
		System.out.println("Digite as idades:");
		idade = sc.nextInt();
		
		if (idade < 0) {
			System.out.print("Imposivel Calcula");
		}
		else {
			
			soma = 0;
			pessoas = 0;
		while(idade >= 0) {
			soma = soma + idade;
			pessoas++;
			idade = sc.nextInt();
		}
		
		media = soma / pessoas;
		
		System.out.printf("Media = %.2f\n", media);
		}
		
		sc.close();

	}

}
