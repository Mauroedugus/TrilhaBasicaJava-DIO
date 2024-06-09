package interfaces;

import tiposContas.Conta;

public interface IConta {
	void sacar();
	void depositar();
	void transferir(Conta contaDestino);
	void imprimirExtrato(String nomeCliente);
}
