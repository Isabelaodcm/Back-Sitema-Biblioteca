package com.libsystem.biblioteca.dtos;

import com.libsystem.biblioteca.models.Livro;

public class LivroDto {
	private String titulo;
	private AutorDto autor;
	private EditoraDto editora;
	private String anoPublicacao;
	private String status;
	private Integer edicao;
	
	public LivroDto(Livro livro) {
		this.titulo = livro.getTitulo();
		this.anoPublicacao = livro.getAnoPublicacao();
		this.autor = new AutorDto(livro.getAutor());  // Convertendo Autor para AutorDto
        this.editora = new EditoraDto(livro.getEditora()); // Convertendo Editora para EditoraDto
		this.status = livro.getStatus();
		this.edicao = livro.getEdicao();
		
	}
	
	public String getTitulo() {
		return titulo;
	}
	public AutorDto getAutor() {
		return autor;
	}
	public EditoraDto getEditora() {
		return editora;
	}
	
	public String getAnoPublicacao() {
		return anoPublicacao;
	}
	public String getStatus() {
		return status;
	}
	public Integer getEdicao() {
		return edicao;
	}

	
}
