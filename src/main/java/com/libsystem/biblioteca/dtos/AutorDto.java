package com.libsystem.biblioteca.dtos;

import com.libsystem.biblioteca.models.Autor;

public class AutorDto {
	private Long id;
	private String nome; 
	private String cidade; 
	private String pais; 
	private String anoNasc;
	private String anoFalesc;
	
	public AutorDto(Autor autor) {
		this.id = autor.getId();
		this.nome = autor.getNome();
		this.cidade = autor.getCidade();
		this.pais = autor.getPais();
		this.anoNasc = autor.getAnoNasc();
		this.anoFalesc = autor.getAnoFalesc();
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

	public String getAnoNasc() {
		return anoNasc;
	}

	public String getAnoFalesc() {
		return anoFalesc;
	}

	public Long getId() {
		return id;
	}
	
	
}
