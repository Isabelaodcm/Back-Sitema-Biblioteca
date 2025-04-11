package com.libsystem.biblioteca.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Livro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titulo;
	private String anoPublicacao;
	private String isbn;
	private int edicao;
	private StatusLivro status = StatusLivro.DISPONIVEL;
	private String obs;
	private EstadoCons estadoCons;
	
	@ManyToOne
	@JoinColumn(name = "id_autor")
	private Autor autor;

	@ManyToOne
	@JoinColumn(name = "id_editora")
	private Editora editora;
	
	public Livro(Long id, String titulo, String anoPublicacao, String isbn, Integer edicao, StatusLivro status, String obs, EstadoCons estadoCons) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.anoPublicacao = anoPublicacao;
		this.isbn = isbn;
		this.edicao = edicao;
		this.status = status;
		this.obs = obs;
		this.estadoCons = estadoCons;
	}
	
	public Livro() {
		
	}

	public Long getId() {  
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(String anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	public StatusLivro getStatus() {
		return status;
	}

	public void setStatus(StatusLivro status) {
		this.status = status;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public EstadoCons getEstadoCons() {
		return estadoCons;
	}

	public void setEstadoCons(EstadoCons estadoCons) {
		this.estadoCons = estadoCons;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	
	
}
