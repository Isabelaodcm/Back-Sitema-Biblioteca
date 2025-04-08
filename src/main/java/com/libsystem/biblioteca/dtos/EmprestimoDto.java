package com.libsystem.biblioteca.dtos;

import java.time.LocalDate;

import com.libsystem.biblioteca.models.Cliente;
import com.libsystem.biblioteca.models.Emprestimo;
import com.libsystem.biblioteca.models.StatusEmprestimo;

public class EmprestimoDto {
	private LocalDate dataEmp;
	private LocalDate dataDev;
	private StatusEmprestimo status;
	private Cliente cliente;
	
	public EmprestimoDto(Emprestimo emprestimo) {
		this.dataEmp = emprestimo.getDataEmp();
		this.dataDev = emprestimo.getDataDev();
		this.status = emprestimo.getStatus();

	}
	public LocalDate getDataEmp() {
		return dataEmp;
	}
	public LocalDate getDataDev() {
		return dataDev;
	}
	public StatusEmprestimo getStatus() {
		return status;
	}
	public Cliente getCliente() {
		return cliente;
	}

	
}
