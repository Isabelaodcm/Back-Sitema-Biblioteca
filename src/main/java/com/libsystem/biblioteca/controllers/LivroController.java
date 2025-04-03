package com.libsystem.biblioteca.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.libsystem.biblioteca.models.Livro;
import com.libsystem.biblioteca.repositories.LivroRepository;

@RequestMapping(value = "/livro")
@RestController
public class LivroController {
	
	@Autowired
	private LivroRepository repository;
	
	@GetMapping(value = "/listar-todos")
	public ResponseEntity<List<Livro>> listaLivros() {
		
//		Livro livro1 = new Livro();
//		livro1.setId(new Long(1));
//		livro1.setTitulo("Senhor dos Anéis");
//		livro1.setStatus("vendido");
//		
//		List<Livro> livros = new ArrayList<>() ;
//		livros.add(livro1);
//			
		
		List<Livro> livros = repository.findAll(); 
		
		return ResponseEntity.ok(livros);
	}
	
	@GetMapping("/busca-livro/{id}")
	public Livro buscaPorId(@PathVariable Long id) {
		
		return repository.findById(id).get();
		
	}
	
	
}
