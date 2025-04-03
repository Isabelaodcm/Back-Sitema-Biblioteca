package com.libsystem.biblioteca.dtos;

import com.libsystem.biblioteca.models.Editora;

public class EditoraDto {
	private String nome; 
	private String  rua;
	private Integer numero;
	private String cidade;
	private String pais;
	private String cep;
	private String bairro; 
	private Integer livrosCad;
	
	public EditoraDto(Editora editora) {
		this.nome = editora.getNome();
		this.rua = editora.getRua();
		this.numero = editora.getNumero();
		this.cidade = editora.getCidade();
		this.pais = editora.getPais();
		this.cep = editora.getCep();
		this.bairro = editora.getBairro();
		this.livrosCad = editora.getLivrosCad();
	}

	public String getNome() {
		return nome;
	}

	public String getRua() {
		return rua;
	}

	public Integer getNumero() {
		return numero;
	}

	public String getCidade() {
		return cidade;
	}

	public String getPais() {
		return pais;
	}

	public String getCep() {
		return cep;
	}

	public String getBairro() {
		return bairro;
	}

	public Integer getLivrosCad() {
		return livrosCad;
	}
	
	
}
