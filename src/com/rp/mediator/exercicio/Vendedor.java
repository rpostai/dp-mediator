package com.rp.mediator.exercicio;

public class Vendedor extends Associado {

	private String nome;

	public Vendedor(String nome, ClubeCompras clube) {
		super(clube);
		this.nome = nome;
		clube.incluirVendedor(this);
	}

	public void anunciar(Anuncio anuncio) {
		System.out.println("Vendedor " + nome + " anunciando " + anuncio);
		clube.anunciar(anuncio, this);
	}

}
