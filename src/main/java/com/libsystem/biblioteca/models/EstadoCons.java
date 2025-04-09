package com.libsystem.biblioteca.models;

public enum EstadoCons {
	
	NOVO(0, "Novo"),
	BOM(1, "Bom"), 
	DANIFICADO(2, "Danificado");
	
	private final String descricao;
	private final int id;

	EstadoCons(int id, String descricao) {
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
