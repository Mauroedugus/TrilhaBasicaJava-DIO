import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
	
	public static void main(String[] args) {
		//TODO:Conhecer e importar a class Scanner, obter e exibir valores
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
			System.out.println("Bem vindo a Conta Banco\n");
		
			System.out.println("Informe o seu nome: ");
		 	String nomeCliente = scanner.nextLine();
		 
		 	System.out.println("Informe o nome da agência: ");
		 	String agencia = scanner.next();
		
		 	System.out.println("Informe o numero da agência: ");
			int numero = scanner.nextInt();
		 
			System.out.println("Informe o saldo: ");
		 	double saldo = scanner.nextDouble();
		 	
		 	System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua âgencia é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque.");
		  
	}
}