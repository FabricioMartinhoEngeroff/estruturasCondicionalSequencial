import java.util.Locale;
import java.util.Scanner;

public class mediaGastoLivros {

	public static void main(String[] args) {
		Locale.setDefault ( Locale.US );
		Scanner sc = new  Scanner (System.in);
		
		System.out.println("Entre quantidades de livros no ano:");
		double livros =sc.nextDouble();
		
		double preço;
		double soma = 0;
		
		for (int i=1; i<= livros; i++) {
			
			System.out.println("Informe o valor pago por cada livro:" + i);
			preço = sc.nextDouble();
			
			soma += preço;
		}
		double media = soma  / livros;
		
		System.out.println("Media gasta com cada livro" + media);
		
		sc.close();

	}

}
