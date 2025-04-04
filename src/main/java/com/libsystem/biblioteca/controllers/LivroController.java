package com.libsystem.biblioteca.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.libsystem.biblioteca.dtos.LivroDetalhadoDto;
import com.libsystem.biblioteca.dtos.LivroDto;
import com.libsystem.biblioteca.models.Livro;
import com.libsystem.biblioteca.services.impl.LivroServiceImpl;

@RequestMapping(value = "/livro")
@RestController
public class LivroController {
	
	@Autowired
	private LivroServiceImpl service ;
	
	
	@GetMapping(value = "/lista-livros")
	public ResponseEntity<List<LivroDto>> listaLivros(){
		return service.listarLivros();
	}
		
	@GetMapping(value = "/busca-livro/{id}")
	public LivroDto findById(@PathVariable Long id) {
		return service.findById(id);
		
	}
	
	@GetMapping(value = "/excluir/{id}")
	public String deleteById(@PathVariable Long id) {
		return service.deleteById(id);
	}
	
	@GetMapping(value = "/detalhes/{id}")
	public LivroDetalhadoDto detalhesLivro(@PathVariable Long id) {
		return service.detalhesLivro(id);
	}

	@GetMapping(value = "/cadastrar-livro")
	public LivroDetalhadoDto create(Livro livro) {
		return service.create(livro);
	}
	
	
}
