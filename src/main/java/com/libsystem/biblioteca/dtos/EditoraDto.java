package com.libsystem.biblioteca.dtos;

import com.libsystem.biblioteca.models.Editora;

public class EditoraDto {
	private Long id;
	private String nome; 
	private String cidade;
	private String pais;
//	private Integer livrosCad;
	
	public EditoraDto(Editora editora) {
		this.id = editora.getId();
		this.nome = editora.getNome();
		this.cidade = editora.getCidade();
		this.pais = editora.getPais();
//		this.livrosCad = editora.getLivrosCad();
	}
	
	public String getNome() {
		return nome;
	}

	public Long getId() {
		return id;
	}

	public String getCidade() {
		return cidade;
	}

	public String getPais() {
		return pais;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	
//	public Integer getLivrosCad() {
//		return livrosCad;
//	}
//	
	
}
