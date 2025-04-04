package com.libsystem.biblioteca.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.libsystem.biblioteca.dtos.LivroDto;
import com.libsystem.biblioteca.mappers.LivroMapper;
import com.libsystem.biblioteca.models.Livro;
import com.libsystem.biblioteca.repositories.LivroRepository;

@RequestMapping(value = "/livro")
@RestController
public class LivroController {
	
	@Autowired
	private LivroRepository repository;
	
	@Autowired
	private LivroMapper mapper;
	
//	@GetMapping(value = "/listar-todos")
//	public ResponseEntity<List<LivroDto>> listaLivros(){
//		List<LivroDto> = Livrorepository.findAll();
//		
//		return ResponseEntity.ok(livros);
//	}
	
	@GetMapping(value = "/listar-todos")
	public ResponseEntity<List<LivroDto>> listaLivros() {	
		
		List<Livro> livros = repository.findAll(); 
		List<LivroDto> livrosDto = mapper.paraDto(livros);
		
		return ResponseEntity.ok(livrosDto);
	}
	
	@GetMapping("/busca-livro/{id}")
	public Livro buscaPorId(@PathVariable Long id) {
		
		return repository.findById(id).get();
		
	}
	
	
}
