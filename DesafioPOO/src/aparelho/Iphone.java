package aparelho;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
	
	private void carregarDados() {
		System.out.println("Dados carregados");
	}
	
	public void ligarAparelho() {
		System.out.println("Iphone ligado");
		carregarDados();
	}

	//ReprodutorMusical
	public void tocar() {
		System.out.println("Tocando musica!");
		
	}

	public void pausar() {
		System.out.println("Pausando Musica!");
		
	}

	public void selecionarMusica(String musica) {
		System.out.println("Musica "+musica+" selecionada!");
		
	}


	//NavegadorInternet
	public void exibirPagina(String url) {
		System.out.println("Pagina "+url+" exibida!");
		
	}

	public void adicionarNovaAba() {
		System.out.println("Aba adicionada!");
		
	}

	public void atualizarPagina() {
		System.out.println("Página atualizada!");
		
	}
	

	//AparelhoTelefonico
	public void ligar(String numero) {
		System.out.println("Ligando para "+numero);
		
	}

	public void atender() {
		System.out.println("Atendendo telefone!");
		
	}

	public void iniciarCorreioVoz() {
		System.out.println("Correio de voz iniciado!");
		
	}
	
}
