package com.libsystem.biblioteca.dtos;

public class ClienteDto {
	
	private Long id;
	
//	@NotBlank(message = "O campo não pode estar vazio")
	private String nome;
	
//	@Size (min = 14, max = 14, message = "O CPF deve ser escirto no formato correto")
	private String cpf;
	private String telefone;
	private String email;
	
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	} 
	
	

}
