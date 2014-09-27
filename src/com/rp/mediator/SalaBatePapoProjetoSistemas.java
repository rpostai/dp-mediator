package com.rp.mediator;

import java.util.HashSet;
import java.util.Set;

public class SalaBatePapoProjetoSistemas implements SalaBatePapo {
	
	private Set<Usuario> usuarios = new HashSet<Usuario>();

	@Override
	public void enviar(String mensagem, Usuario usuario) {
		for (Usuario u: usuarios) {
			if (!u.equals(usuario)) {
				u.receber(mensagem, usuario);	
			}
		}
	}

	@Override
	public void adicionaUsuario(Usuario usuario) {
		if (!usuarios.add(usuario)) {
			throw new IllegalAccessError("Usu�rio " + usuario.getNome() + " j� existe nesta sala");
		}
		System.out.println("Usu�rio " + usuario.getNome() + " entrou na sala");
	}
}
