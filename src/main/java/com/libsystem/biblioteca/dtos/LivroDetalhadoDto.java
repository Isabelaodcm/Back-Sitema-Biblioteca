package com.libsystem.biblioteca.dtos;

import com.libsystem.biblioteca.models.EstadoCons;
import com.libsystem.biblioteca.models.Livro;
import com.libsystem.biblioteca.models.StatusLivro;

public class LivroDetalhadoDto {
	private String titulo;
	private String anoPublicacao;
	private String isbn;
	private int edicao;
	private StatusLivro status;
	private String obs;
	private EstadoCons estadoCons;
	private AutorDto autor;
	private EditoraDto editora;
	
	public LivroDetalhadoDto(Livro livro) {
		this.titulo = livro.getTitulo();
		this.anoPublicacao = livro.getAnoPublicacao();
		this.isbn = livro.getIsbn();
//		this.autor = new AutorDto(livro.getAutor());  // Convertendo Autor para AutorDto
//        this.editora = new EditoraDto(livro.getEditora()); // Convertendo Editora para EditoraDto
		this.status = livro.getStatus();
		this.edicao = livro.getEdicao();
		this.obs = livro.getObs();
		this.estadoCons = livro.getEstadoCons();
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAnoPublicacao() {
		return anoPublicacao;
	}

	public String getIsbn() {
		return isbn;
	}

	public int getEdicao() {
		return edicao;
	}

	public StatusLivro getStatus() {
		return status;
	}

	public String getObs() {
		return obs;
	}

	public EstadoCons getEstadoCons() {
		return estadoCons;
	}

	public AutorDto getAutor() {
		return autor;
	}

	public EditoraDto getEditora() {
		return editora;
	}
	
	
}
