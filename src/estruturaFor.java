import java.util.Locale;
import java.util.Scanner;

public class estruturaFor {

	public static void main(String[] args) {
		Locale.setDefault ( Locale.US );
		Scanner sc = new  Scanner (System.in);
		
		for (int i=0; i<10; i++) {
			System.out.println("Valor de i: " + i);
		}
		
		sc.close();
	}

}
