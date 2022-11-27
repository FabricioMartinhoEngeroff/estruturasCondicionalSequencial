import java.util.Locale;
import java.util.Scanner;

public class populcaoUltrapasarTempo {

	public static void main(String[] args) {
		Locale.setDefault ( Locale.US );
		Scanner sc = new  Scanner ( System . in );
		
		double populacaoA ;
		double populacaoB;
		double conta = 0;
		
		System.out.println("digite o numeros de habitantes A: ");
		populacaoA = sc.nextDouble();
		
		System.out.println("Digitr o numero de habitantes B :");
		populacaoB = sc.nextDouble();
		
		while (populacaoA < populacaoB) {
			
			populacaoA += (populacaoA/100) * 3;
			populacaoB += (populacaoB/100) * 1.5;
			conta++;
		}
		System.out.println("População A: " + populacaoA);
		System.out.println("População B: " + populacaoB);
		System.out.println("quantos anos a populão A vai passa B? " + conta);
		
		sc.close();

	}

}
