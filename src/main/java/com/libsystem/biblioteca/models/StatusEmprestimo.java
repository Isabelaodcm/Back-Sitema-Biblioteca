package com.libsystem.biblioteca.models;

public enum StatusEmprestimo {

	PENDENTE(0, "Pendente"),
	ATRASADO(1, "Atrasado"),
	DEVOLVIDO(2, "Devolvido");
	
	private final String descricao;
	private final int id;
	
	 StatusEmprestimo(int id, String descricao) {
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
