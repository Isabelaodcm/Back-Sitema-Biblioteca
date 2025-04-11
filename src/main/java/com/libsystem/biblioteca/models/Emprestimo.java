package com.libsystem.biblioteca.models;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Emprestimo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate dataEmp;
	private LocalDate dataDev;
	
	private StatusEmprestimo status = StatusEmprestimo.PENDENTE;
	
	
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

	public LocalDate getDataEmp() {
		return dataEmp;
	}

	public void setDataEmp(LocalDate dataEmp) {
		this.dataEmp = dataEmp;
	}

	public LocalDate getDataDev() {
		return dataDev;
	}

	public void setDataDev(LocalDate dataDev) {
		this.dataDev = dataDev;
	}

	public StatusEmprestimo getStatus() {
		return status;
	}

	public void setStatus(StatusEmprestimo status) {
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
