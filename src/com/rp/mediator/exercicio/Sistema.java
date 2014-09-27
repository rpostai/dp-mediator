package com.rp.mediator.exercicio;

public class Sistema {

	public static void main(String[] args) {
		ClubeCompras c = new ClubeCompras();
		Vendedor v1 = new Vendedor("Loja X", c);
		Vendedor v2 = new Vendedor("Loja Y", c);
		
		Comprador c1 = new Comprador("Rodrigo",c);
		Comprador c2 = new Comprador("Fernanda",c);
		
		Anuncio a1 = new Anuncio();
		a1.adicionaProduto("Camiseta");
		a1.adicionaProduto("Calça");
		
		v1.anunciar(a1);
		
		Anuncio a2 = new Anuncio();
		a2.adicionaProduto("Sapato");
		a2.adicionaProduto("Tênis");
		v2.anunciar(a2);
		
		
		
	}
}
