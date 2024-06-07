
public interface IConta {
	void sacar();
	void depositar();
	void transferir(Conta contaDestino);
	void imprimirExtrato();
}
