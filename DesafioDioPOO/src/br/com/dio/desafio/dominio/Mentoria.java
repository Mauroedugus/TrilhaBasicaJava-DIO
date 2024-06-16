package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
	
	private LocalDate data;
	
	public Mentoria(String titulo, String descricao, LocalDate data) {
		super(titulo, descricao);
		this.data = data;
	}
	
	public LocalDate getData() {
		return data;
	}

	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return XP_PADRAO + 20d;
	}

	@Override
	public String toString() {
		return "Mentoria"+ super.getTitulo()+" "+ super.getDescricao() + "data=" + data + "]";
	}	
	
	
}
