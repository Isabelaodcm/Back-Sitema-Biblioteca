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

import com.libsystem.biblioteca.dtos.LivroDetalhadoDto;
import com.libsystem.biblioteca.models.Livro;
import com.libsystem.biblioteca.services.impl.LivroServiceImpl;

@RequestMapping(value = "/livro")
@RestController
@CrossOrigin("*")
public class LivroController {
	
	@Autowired
	private LivroServiceImpl service ;
	
	
	@GetMapping(value = "/lista-livros")
	public ResponseEntity<List<LivroDetalhadoDto>> listaLivros(){
		return service.listarLivros();
	}
		
	@GetMapping(value = "/busca-livro/{id}")
	public Livro findById(@PathVariable Long id) {
		return service.findById(id);
		
	}
	
	@DeleteMapping(value = "/excluir/{id}")
	@CrossOrigin
	public String deleteById(@PathVariable Long id) {
		return service.deleteById(id);
	}
	
	@GetMapping(value = "/detalhes/{id}")
	public LivroDetalhadoDto detalhesLivro(@PathVariable Long id) {
		return service.detalhesLivro(id);
	}

	@PostMapping(value = "/cadastrar-livro")
	@CrossOrigin
	public LivroDetalhadoDto create(@RequestBody Livro livro) {
		return service.create(livro);
	}
	
	@PutMapping(value = "/editar/{id}")
	public ResponseEntity<Livro> update(@PathVariable Long id, @RequestBody Livro editarLivro) {
		return ResponseEntity.ok(service.update(id, editarLivro));
	}
	
	
}
