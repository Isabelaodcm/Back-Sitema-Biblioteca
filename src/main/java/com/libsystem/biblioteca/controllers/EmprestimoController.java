package com.libsystem.biblioteca.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.libsystem.biblioteca.models.Emprestimo;
import com.libsystem.biblioteca.services.impl.EmprestimoServiceImpl;

@RequestMapping(value = "/emprestimo")
@RestController
@CrossOrigin("*")
public class EmprestimoController {

	@Autowired
	private EmprestimoServiceImpl service;
	
	@GetMapping(value = "/lista-emprestimos")
	public ResponseEntity<List<Emprestimo>> listarEmprestimos(){
		return service.listarEmprestimos();
	}
	
	@GetMapping(value = "/busca-emprestimo/{id}")
	public Emprestimo findById(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@DeleteMapping(value = "/excluir/{id}")
	public String deleteById(@PathVariable Long id) {
		return service.deleteById(id);
	}
	
//	@CrossOrigin
	@PostMapping(value = "/cadastrar")
	public Emprestimo create(@RequestBody Emprestimo emprestimo) {
		return service.create(emprestimo);
	}
	
	@PutMapping(value = "/editar/{id}")
	public ResponseEntity<Emprestimo> update(@PathVariable Long id, @RequestBody Emprestimo editarEmprestimo) {
		return ResponseEntity.ok(service.update(id, editarEmprestimo));
	}

}
