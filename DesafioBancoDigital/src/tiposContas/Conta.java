package tiposContas;
import java.util.Scanner;

import interfaces.IConta;
import modelos.Cliente;

public abstract class Conta implements IConta {
	Scanner scanner = new Scanner(System.in);
	
	protected static int AGENCIA_PADRAO = 1;
	
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	public int numero;
	protected int saldo;
	public Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	@Override
	public void sacar() {
		System.out.print("Informe o valor que deseja sacar: ");
		int valor = scanner.nextInt();
		saldo -= valor;
		System.out.println();
	}
	@Override
	public void depositar() {
		System.out.print("Informe o valor que deseja depositar: ");
		int valor = scanner.nextInt();
		saldo += valor;
	}
	@Override
	public void transferir(Conta contaDestino) {
		System.out.print("Informe o valor que deseja transferir: ");
		int valor = scanner.nextInt();
		this.saldo -= valor;
		contaDestino.saldo =+ valor;
	}
	
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Cliente: "+cliente.getNome()));
		System.out.println(String.format("Agencia: "+agencia));
		System.out.println(String.format("Conta: "+numero));
		System.out.println(String.format("Saldo: "+saldo));
	}
	
	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public int getSaldo() {
		return saldo;
	}
	
	
	
}
