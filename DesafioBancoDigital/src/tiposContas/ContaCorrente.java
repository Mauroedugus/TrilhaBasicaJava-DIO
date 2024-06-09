package tiposContas;

import modelos.Cliente;

public class ContaCorrente extends Conta{

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato(String nomeCliente) {
		System.out.println("=========Sua Conta Poupança "+ nomeCliente +"=========");
		super.imprimirInfosComuns();
	}
	
}
