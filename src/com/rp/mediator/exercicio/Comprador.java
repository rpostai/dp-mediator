package com.rp.mediator.exercicio;

public class Comprador extends Associado {

	private String nome;

	public Comprador(String nome, ClubeCompras clube) {
		super(clube);
		this.nome = nome;
		clube.incluirComprador(this);
	}

	public void verAnuncio(Anuncio a) {
		System.out.println("Comprador " + nome + " vendo anuncio " + a);
	}
}
