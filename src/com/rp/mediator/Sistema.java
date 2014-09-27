package com.rp.mediator;

public class Sistema {

	public static void main(String[] args) {
		
		SalaBatePapo s1 = new SalaBatePapoProjetoSistemas();
		
		UsuarioSimples u1 = new UsuarioSimples(s1, "Paulo");
		UsuarioSimples u2 = new UsuarioSimples(s1, "Pedro");
		UsuarioSimples u3 = new UsuarioSimples(s1, "Lucas");
		UsuarioSimples u4 = new UsuarioSimples(s1, "João");
		
		s1.adicionaUsuario(u1);
		s1.adicionaUsuario(u2);
		
		u1.enviar("Primeira mensagem");
		
		s1.adicionaUsuario(u3);
		
		u3.enviar("Segunda mensagem");
		
		s1.adicionaUsuario(u4);
		
		u2.enviar("Terceira mensagem");
		
	}
}
