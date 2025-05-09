package com.libsystem.biblioteca.services;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.libsystem.biblioteca.dtos.LivroDetalhadoDto;
import com.libsystem.biblioteca.dtos.LivroDto;
import com.libsystem.biblioteca.models.Livro;

public interface LivroService {
	ResponseEntity<List<LivroDetalhadoDto>> listarLivros();
	Livro findById(@PathVariable Long id);
	LivroDetalhadoDto create(Livro livro);
	String deleteById(@PathVariable Long id);
	LivroDetalhadoDto detalhesLivro(@PathVariable Long id);
	Livro update(@PathVariable Long id, Livro editarLivro);
	List<Livro> pesquisa(String titulo);
	
}

