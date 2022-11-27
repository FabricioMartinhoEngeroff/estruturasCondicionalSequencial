import java.util.Locale;
import java.util.Scanner;

public class parImpar {

	public static void main(String[] args) {
		Locale.setDefault ( Locale.US );
		Scanner sc = new  Scanner (System.in);
		
		int num;
		int pares = 0;
		int impares = 0;
		
		for (int i=0; i<10; i++) {
			
			System.out.println("Entre com um numero: ");
			num = sc.nextInt();
		
			if(num % 2 == 0) {
				pares++;
			}else {
				impares++;
			}
		
	        System.out.println("Pares: " + pares);
			System.out.println("Impares: " + impares);
		}

		sc.close();
		}
	}


