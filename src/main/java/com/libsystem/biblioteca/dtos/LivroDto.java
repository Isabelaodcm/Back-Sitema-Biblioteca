package com.libsystem.biblioteca.dtos;

import com.libsystem.biblioteca.models.Livro;

public class LivroDto {
	private Long id;
	private String titulo;
	private AutorDto autor;
	private String anoPublicacao;
	private String status;
//	private EditoraDto editora;
	
	public LivroDto(Livro livro) {
		this.id = livro.getId();
		this.titulo = livro.getTitulo();
		this.anoPublicacao = livro.getAnoPublicacao();
		this.autor = new AutorDto(livro.getAutor());  // Convertendo Autor para AutorDto
//        this.editora = new EditoraDto(livro.getEditora());
		this.status = livro.getStatus();

	}
	
	public String getTitulo() {
		return titulo;
	}
	public AutorDto getAutor() {
		return autor;
	}
	
//	public EditoraDto getEditora() {
//		return editora;
//	}

	
	public String getAnoPublicacao() {
		return anoPublicacao;
	}
	public String getStatus() {
		return status;
	}

	public Long getId() {
		return id;
	}

	
}
