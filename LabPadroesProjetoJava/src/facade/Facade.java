package facade;

import subSistema1.CrmService;
import subSistema2.CepApi;


public class Facade {
	public void migrarCliente(String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		
		CrmService.gravarCliente(nome, cep, estado, cidade);
	}
}
