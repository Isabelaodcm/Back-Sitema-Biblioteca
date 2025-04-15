package com.libsystem.biblioteca.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.libsystem.biblioteca.models.Cliente;
import com.libsystem.biblioteca.models.Emprestimo;
import com.libsystem.biblioteca.models.Livro;
import com.libsystem.biblioteca.models.StatusLivro;
import com.libsystem.biblioteca.repositories.ClienteRepository;
import com.libsystem.biblioteca.repositories.EmprestimoRepository;
import com.libsystem.biblioteca.repositories.LivroRepository;
import com.libsystem.biblioteca.services.EmprestimoService;

@Service
public class EmprestimoServiceImpl implements EmprestimoService{
	
	@Autowired
	private EmprestimoRepository repository;
	
	@Autowired
	private LivroRepository livroRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
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
		Livro livro = livroRepository.findById(emprestimo.getLivro().getId())
		        .orElseThrow(() -> new RuntimeException("Livro não encontrado"));
		
		livro.setStatus(StatusLivro.INDISPONIVEL);
		
		Cliente cliente = clienteRepository.findById(emprestimo.getCliente().getId())
		        .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
		
		emprestimo.setLivro(livro);
	    emprestimo.setCliente(cliente);
	    
		Emprestimo newEmp = repository.saveAndFlush(emprestimo);
		return newEmp;
	}
	
	@Override
	public Emprestimo update(@PathVariable Long id, Emprestimo editarEmprestimo) {
		Emprestimo empEditado = repository.findById(id).get();
		
		Livro livro = livroRepository.findById(editarEmprestimo.getLivro().getId())
		        .orElseThrow(() -> new RuntimeException("Livro não encontrado"));
		
		Cliente cliente = clienteRepository.findById(editarEmprestimo.getCliente().getId())
		        .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
		
		empEditado.setDataEmp(editarEmprestimo.getDataEmp());
		empEditado.setDataDev(editarEmprestimo.getDataDev());
		empEditado.setStatus(editarEmprestimo.getStatus());
		
		empEditado.setLivro(livro);
		empEditado.setCliente(cliente);
		
		repository.save(empEditado);
		
		return empEditado;
	}
}
