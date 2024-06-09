package tiposContas;

import modelos.Cliente;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato(String nomeCliente) {
		System.out.println("=========Sua Conta Poupança "+ nomeCliente +"=========");
		super.imprimirInfosComuns();
	}
}
