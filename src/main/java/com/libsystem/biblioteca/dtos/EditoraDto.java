package com.libsystem.biblioteca.dtos;

import com.libsystem.biblioteca.models.Editora;

public class EditoraDto {
	private String nome; 
	private String cidade;
	private String pais;
//	private Integer livrosCad;
	
	public EditoraDto(Editora editora) {
		this.nome = editora.getNome();
		this.cidade = editora.getCidade();
		this.pais = editora.getPais();
//		this.livrosCad = editora.getLivrosCad();
	}
	
	public String getNome() {
		return nome;
	}

	public String getCidade() {
		return cidade;
	}

	public String getPais() {
		return pais;
	}

//	public Integer getLivrosCad() {
//		return livrosCad;
//	}
//	
	
}
