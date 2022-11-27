import java.util.Locale;
import java.util.Scanner;

public class criarSenha {

	public static void main(String[] args) {
		Locale.setDefault ( Locale.US );
		Scanner sc = new  Scanner ( System . in );
		
		boolean infoValidas = false;
		
		do {
			System.out.println("Entre com o nome do usuario: ");
			String nomeUser = sc.next();
			
			System.out.println("Entre com a senha: ");
			String senha = sc.next();
			
			if (nomeUser.equalsIgnoreCase(senha) ) {
				System.out.println("Senha incoreta!!! Digite novamente!!!" );
			}else  {
				infoValidas = true;
						System.out.println("Senha e Usuario Correto!!!");
			}
		}while(!infoValidas); 
		
		sc.close();

	}

}
