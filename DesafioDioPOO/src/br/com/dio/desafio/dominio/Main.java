package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Curso curso1 = new Curso("Java Basico", "teste", 20);
		Curso curso2 = new Curso("GitHub","teste2", 15);
		Mentoria mentoria = new Mentoria("GitHub","teste2",LocalDate.now() );
		
		
		Bootcamp bootcamp = new Bootcamp("Bootcamp Java e IA", "Curso do basico ao avancado em Java com APIS de IA");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev dev1 = new Dev("Mauro");
		dev1.inscreverBootcamp(bootcamp);
		System.out.println("\nDEV Mauro\nConteudos Inscritos" + dev1.getConteudoInscritos());
		dev1.progredir();
		System.out.println("Conteudos Concluidos" + dev1.getConteudoConcluidos());
		System.out.println("Após progredir\nConteudos Inscritos" + dev1.getConteudoInscritos());
		
		Dev dev2 = new Dev("Joao");
		dev2.inscreverBootcamp(bootcamp);
		System.out.println("\nDEV João\nConteudos Inscritos" + dev2.getConteudoInscritos());	
		dev2.progredir();
		System.out.println("Conteudos Concluidos" + dev2.getConteudoConcluidos());
		System.out.println("Após progredir\nConteudos Inscritos" + dev2.getConteudoInscritos());
	}
	
	
}
