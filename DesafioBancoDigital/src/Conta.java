
public abstract class Conta implements IConta {
	
	protected static int AGENCIA_PADRAO = 1;
	
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected int saldo;

	public Conta() {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
	}
	
	@Override
	public void sacar(double valor) {
		saldo -= valor;
		System.out.println();
	}
	@Override
	public void depositar(double valor) {
		saldo += valor;
	}
	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	protected void imprimirInfosComuns() {
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
