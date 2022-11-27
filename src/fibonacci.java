import java.util.Locale;
import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		Locale.setDefault ( Locale.US );
		Scanner sc = new  Scanner ( System . in );
		
		System.out.println("Entre com o n-ésim termo da serie de fibonacci: ");
		int n = sc.nextInt();
		
		int primeiro = 1;
		int segundo = 1;
		int proximo;
		
		System.out.println(primeiro);
		System.out.println(segundo);
		
		for (int i=3; i<=n; i++) {
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			
			System.out.println(proximo);
		}
		
		
		
		sc.close();

	}

}
