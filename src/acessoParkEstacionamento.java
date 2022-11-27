import java.util.Locale;
import java.util.Scanner;

public class acessoParkEstacionamento {

	public static void main(String[] args) {
		Locale.setDefault ( Locale.US );
		Scanner sc = new  Scanner (System.in);
		
		int valor  ;
		
		System.out.print("COLOQUE VALOR PARA ENTRADA $10.00 COM SEGURANÇA e SOMBRA ou $5.00 SÓ ESTACIONAMENTO: ");
		valor = sc.nextInt();
		
		while (valor >= 10) {
			System.out.print("Acesso com sombra e seguranças" );
			valor = sc.nextInt();
		}
			while (valor >= 5) {
				System.out.print("Acesso sem sombra e sem seguranças" ); 
				valor = sc.nextInt();	
		}
	
		sc.close();

	}

	}
