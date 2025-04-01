package com.libsystem.biblioteca.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Autor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome; 
	private String cidade; 
	private String pais; 
	private String anoNasc;
	private String anoFalesc;
	
	public Autor() {
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getAnoNasc() {
		return anoNasc;
	}
	public void setAnoNasc(String anoNasc) {
		this.anoNasc = anoNasc;
	}
	public String getAnoFalesc() {
		return anoFalesc;
	}
	public void setAnoFalesc(String anoFalesc) {
		this.anoFalesc = anoFalesc;
	}
	
	
}
