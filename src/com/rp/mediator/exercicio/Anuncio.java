package com.rp.mediator.exercicio;

import java.util.ArrayList;
import java.util.List;

public class Anuncio {
	private List<String> produtos = new ArrayList<String>();

	public void adicionaProduto(String nome) {
		this.produtos.add(nome);
	}

	@Override
	public String toString() {
		return "Anuncio [produtos=" + produtos + "]";
	}
}
