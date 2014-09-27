package com.rp.mediator;

// Colleague
public abstract class Usuario {

	private final SalaBatePapo sala;
	private final String nome;

	public Usuario(SalaBatePapo sala, String nome) {
		this.sala = sala;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void enviar(String mensagem) {
		System.out.println("Enviando a mensagem " + mensagem);
		sala.enviar(mensagem, this);
	}

	public void receber(String mensagem, Usuario usuario) {
		System.out.println("Eu, " + this.getNome() + ", estou recebendo a mensagem: " + mensagem + " de "
				+ usuario.getNome());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((sala == null) ? 0 : sala.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (sala == null) {
			if (other.sala != null)
				return false;
		} else if (!sala.equals(other.sala))
			return false;
		return true;
	}

}
