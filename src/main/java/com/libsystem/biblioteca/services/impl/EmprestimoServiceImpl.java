package com.libsystem.biblioteca.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.libsystem.biblioteca.models.Emprestimo;
import com.libsystem.biblioteca.repositories.EmprestimoRepository;
import com.libsystem.biblioteca.services.EmprestimoService;

@Service
public class EmprestimoServiceImpl implements EmprestimoService{
	
	@Autowired
	private EmprestimoRepository repository;
	
	@Override
	public ResponseEntity<List<Emprestimo>> listarEmprestimos(){
		List<Emprestimo> emprestimos = repository.findAll();
		return ResponseEntity.ok(emprestimos);
	}
	
	@Override
	public Emprestimo findById(@PathVariable Long id) {
		return repository.findById(id).get();
	}
	
	@Override
	public String deleteById(@PathVariable Long id) {
		repository.deleteById(id);
		return "Empréstimo excluído com sucesso.";
	}
	
	@Override
	public Emprestimo create(Emprestimo emprestimo) {
		Emprestimo newEmp = repository.save(emprestimo);
		return newEmp;
	}
	
	@Override
	public Emprestimo update(@PathVariable Long id, Emprestimo editarEmprestimo) {
		Emprestimo empEditado = repository.findById(id).get();
		
		empEditado.setDataEmp(editarEmprestimo.getDataEmp());
		empEditado.setDataDev(editarEmprestimo.getDataDev());
		empEditado.setStatus(editarEmprestimo.getStatus());
		empEditado.setLivro(editarEmprestimo.getLivro());
		
		repository.save(empEditado);
		
		return empEditado;
	}
}
