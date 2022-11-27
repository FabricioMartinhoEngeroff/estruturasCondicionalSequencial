import java.util.Locale;
import java.util.Scanner;

public class validarUsuario {

	public static void main(String[] args) {
		Locale.setDefault ( Locale.US );
		Scanner sc = new  Scanner ( System . in );
		
		boolean infoValida = false;
		String nome;
		int idade;
		double salario;
		
		do {
			
			System.out.println("Entre com o nome: ");
			
			nome = sc.next();
			
			if(nome.length() >= 5 ) {
			   infoValida = true;
			}else {
				System.out.println("Precisa no minimo 5 caracteres!!! ");
			}
		} while (!infoValida);
		
		infoValida = false;
		do {
			
			System.out.println("Entre com o idade: ");
			
			idade = sc.nextInt();
			
			if(idade >= 18 && idade <= 150 ) {
			   infoValida = true;
			}else {
				System.out.println("Idade precisa ser entre 0 e 150. ");
			}
		} while (!infoValida);
		
		infoValida = false;
		do {
			
			System.out.println("Entre com o salario: ");
			
			salario = sc.nextDouble();
			
			if(salario >= 900 ) {
			   infoValida = true;
			}else {
				System.out.println("Salario acima de 900 R$.");
			}
		} while (!infoValida);
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salario: " + salario);
	
		sc.close();

		}
}
