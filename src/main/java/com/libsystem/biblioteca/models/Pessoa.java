package com.libsystem.biblioteca.models;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Pessoa {
	
//	@Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id;
	
	private String nome; 
	private String cpf;
	private String telefone;
	private String email;
	
	public Pessoa() {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public Pessoa(String nome, String cpf, String telefone, String email) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
	}
	
}
