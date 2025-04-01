package com.libsystem.biblioteca.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

public class Emprestimo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String dataEmp;
	private String dataDev;
	private String status;
	
	@OneToOne
	@JoinColumn(name = "livro_id")
	private Livro livro;
	
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDataEmp() {
		return dataEmp;
	}

	public void setDataEmp(String dataEmp) {
		this.dataEmp = dataEmp;
	}

	public String getDataDev() {
		return dataDev;
	}

	public void setDataDev(String dataDev) {
		this.dataDev = dataDev;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	

}
