import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Banco {
	
	List<Conta> clientes = new ArrayList<Conta>();
	Scanner scanner = new Scanner(System.in);
	
	public void menuBanco() {
		int resposta;
		do {
			System.out.println("====MENU BANCO DIGITAL====");
			System.out.println("1- Entrar\n2- Criar Conta\n3- Sair");
			resposta = scanner.nextInt();
			
			switch(resposta) {
				case  1:
					menuAcoes();
				break;
				case 2:
					criarConta();
				break;
				case 3:
					System.out.println("Saindo...");
				break;
				default:
					System.out.println("Opção não existente!");
					resposta = 0;
				break;		
			}
			
		}while(resposta != 3);
	}
	
	private void menuAcoes() {
		System.out.print("Informe o numero da conta: ");
		int numeroConta = scanner.nextInt();
		
		for(Conta conta: clientes) {
			if(conta.numero == numeroConta) {
				int resposta;
				do {
					System.out.println("====MENU AÇÕES====");
					System.out.println("1- Sacar\n2- Depositar\n3- Transferir\n4- Sair");
					resposta = scanner.nextInt();
					
					switch(resposta) {
					case  1:
						conta.sacar();
					break;
					case 2:
						conta.depositar();
					break;
					case 3:
						System.out.print("Informe o numero da conta destino: ");
						int nContaDestino = scanner.nextInt();
						for(Conta contaDestino: clientes) {
							if(contaDestino.numero == nContaDestino) {
								conta.transferir(contaDestino);
							}
						}
					break;
					default:
						System.out.println("Opção não existente!");
						resposta = 0;
					break;		
				}
					
				}while(resposta != 3);
			}
		}
	}
	
	private void criarConta() {
		System.out.println("Informe tipo de conta(1-ContaCorrente 2-ContaPoupança: ");
		int tipoConta = scanner.nextInt();
		System.out.println("Informe seu nome: ");
		String nomeCliente = scanner.nextLine();
	
		scanner.nextLine();
		
		Cliente cliente = new Cliente(nomeCliente);
		if(tipoConta == 1) {
			Conta conta = new ContaCorrente(cliente);
			clientes.add(conta);
			conta.imprimirExtrato();
		}else if(tipoConta == 2) {
			Conta conta = new ContaPoupanca(cliente);
			clientes.add(conta);
			conta.imprimirExtrato();
		}else {
			
		}
		
		
		System.out.println("Conta Criada");
	}
}
