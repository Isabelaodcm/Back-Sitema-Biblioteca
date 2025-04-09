package com.libsystem.biblioteca.models;

public enum StatusLivro {
	
	DISPONIVEL(0, "Disponível"),
	INDISPONIVEL(1, "Indisponível"); 
	
	private final String descricao;
	private final int id;

	StatusLivro(int id, String descricao) {
		 this.id = id;
		 this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public int getId() {
		return id;
	}	

}
