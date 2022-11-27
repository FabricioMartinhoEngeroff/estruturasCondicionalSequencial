import java.util.Locale;
import java.util.Scanner;

public class validarNotas {

	public static void main(String[] args) {
		Locale.setDefault ( Locale.US );
		Scanner sc = new  Scanner ( System . in );
		
		boolean notaValida = false;
		
		do {
		
		System.out.println("Entre com uma nota: ");
		double nota = sc.nextDouble();
		
		if(nota >= 0 && nota <= 10) {
			notaValida = true;
			System.out.println("Voce digitou a nota: " + nota);
		}
		else {
			System.out.println("Nota ivalida, digite novament.");
		}
		
		} while(notaValida == false);
		
		sc.close();
	}

}
