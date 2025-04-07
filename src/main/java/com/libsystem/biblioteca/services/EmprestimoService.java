package com.libsystem.biblioteca.services;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import com.libsystem.biblioteca.models.Emprestimo;

public interface EmprestimoService {
	
	ResponseEntity<List<Emprestimo>> listarEmprestimos();
	Emprestimo findById(@PathVariable Long id);
	String deleteById(@PathVariable Long id);
	Emprestimo create(Emprestimo emprestimo);
	Emprestimo update(@PathVariable Long id, Emprestimo emprestimoEditado);

}
