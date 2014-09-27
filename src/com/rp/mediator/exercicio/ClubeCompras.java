package com.rp.mediator.exercicio;

import java.util.ArrayList;
import java.util.List;

public class ClubeCompras {
	
	public List<Vendedor> vendedores = new ArrayList<Vendedor>();
	public List<Comprador> compradores = new ArrayList<Comprador>();

	public void incluirVendedor(Vendedor v) {
		this.vendedores.add(v);
	}
	
	public void incluirComprador(Comprador c) {
		this.compradores.add(c);
	}
	
	public void anunciar(Anuncio anuncio, Vendedor vendedor) {
		for (Comprador c: compradores) {
			c.verAnuncio(anuncio);
		}
	}
}
