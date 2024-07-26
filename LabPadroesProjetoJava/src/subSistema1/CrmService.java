package subSistema1;

public class CrmService {
	private CrmService() {
		super();
	}
	
	public static void gravarCliente(String nome, String cep ,String estado, String cidade) {
		System.out.println("Cliente salvo com sistema de CRM");	
		System.out.println(nome +" "+ cep +" "+ estado +" "+ cidade);
		}
}
