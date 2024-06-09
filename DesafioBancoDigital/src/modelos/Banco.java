package modelos;
import java.util.ArrayList;
import java.util.Scanner;

import tiposContas.Conta;
import tiposContas.ContaCorrente;
import tiposContas.ContaPoupanca;

import java.util.List;

public class Banco {
	
	List<Conta> clientes = new ArrayList<Conta>();
	Scanner scanner = new Scanner(System.in);
	
	public void menuBanco() {
		limparConsole();
		int resposta;
		do {
			System.out.println("\n=========MENU BANCO DIGITAL=========");
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
					limparConsole();
					System.out.println("Saindo...");
				break;
				default:
					limparConsole();
					System.out.println("Opção não existente!");
					resposta = 0;
				break;		
			}
			
		}while(resposta != 3);
	}
	
	private void menuAcoes() {
		
		if(!clientes.isEmpty()) {
			System.out.print("Informe o numero da conta: ");
			int numeroConta = scanner.nextInt();
			
			for(Conta conta: clientes) {
				if(conta.numero == numeroConta) {
					int resposta;
					do {
						limparConsole();
						System.out.println("\n=========MENU AÇÕES=========");
						System.out.println("|1- Sacar\n|2- Depositar\n|3- Transferir\n|4- Sair");
						conta.imprimirExtrato(conta.cliente.getNome());
						resposta = scanner.nextInt();
						
						switch(resposta) {
						case  1:
							conta.sacar();
							conta.imprimirExtrato(conta.cliente.getNome());
						break;
						case 2:
							conta.depositar();
							conta.imprimirExtrato(conta.cliente.getNome());
						break;
						case 3:
							if(!(clientes.size() < 2)) {
								System.out.print("Informe o numero da conta destino: ");
								int nContaDestino = scanner.nextInt();
								boolean contaAchada = false;
								for(Conta contaDestino: clientes) {
									if(contaDestino.numero == nContaDestino) {
										conta.transferir(contaDestino);
										conta.imprimirExtrato(conta.cliente.getNome());
										contaAchada = true;
										break;
									}
								} 
								if(contaAchada == false){
									System.out.print("\nO numero da conta destino não foi encontrado!\n(Precione 'Enter' para continuar)");
									scanner.nextLine();
									scanner.nextLine();
								}
							}else {
								System.out.print("\nNão há outras contas para realizar a transferencia\n(Precione 'Enter' para continuar)");
								scanner.nextLine();
								scanner.nextLine();
							}
						break;
						case 4:
							System.out.println("Saindo...");
						break;
						default:
							System.out.println("Opção não existente!(Precione 'Enter' para continuar)");
							scanner.nextLine();
							scanner.nextLine();
							resposta = 0;
						break;		
					}
						
					}while(resposta != 4);
					
					
				}else {
					limparConsole();
					System.out.print("\n\tNumero de conta não existente!\n");
				}
			}	
		}else {
			limparConsole();
			System.out.print("\n\tNão há contas cadastradas!\n");
		}
	}
	
	private void criarConta() {
		System.out.println("Informe tipo de conta(1-ContaCorrente 2-ContaPoupança): ");
	    int tipoConta = scanner.nextInt();
	    
	    scanner.nextLine(); // Consome a quebra de linha

	    System.out.println("Informe seu nome: ");
	    String nomeCliente = scanner.nextLine();
	
		Cliente cliente = new Cliente(nomeCliente);
		if(tipoConta == 1) {
			Conta conta = new ContaCorrente(cliente);
			clientes.add(conta);
			limparConsole();
			System.out.println("\n\tConta Criada");
			conta.imprimirExtrato(nomeCliente);
		}else if(tipoConta == 2) {
			Conta conta = new ContaPoupanca(cliente);
			clientes.add(conta);
			limparConsole();
			System.out.println("\n\tConta Criada");
			conta.imprimirExtrato(nomeCliente);
		}else {
			
		}
		
		
	}
	
	public void limparConsole() {
		 for (int i = 0; i < 100; i++) {
		        System.out.println();
		    }
	}
}
