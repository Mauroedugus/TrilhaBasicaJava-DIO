package clientes;

import aparelho.Iphone;

public class Usuario {
	public static void main(String[] args) {
		Iphone iphone1 = new Iphone();
		
		iphone1.ligarAparelho();
		
		System.out.println("\nAPP Musica");
		iphone1.tocar();
		iphone1.pausar();
		iphone1.selecionarMusica("MusicaTeste");
		
		System.out.println("\nAPP Ligação");
		iphone1.ligar("16993833622");
		iphone1.atender();
		iphone1.iniciarCorreioVoz();
		
		System.out.println("\nAPP Navegador");
		iphone1.exibirPagina("https://ExemplodeURL.com");	
		iphone1.adicionarNovaAba();
		iphone1.atualizarPagina();
		
	}
}
