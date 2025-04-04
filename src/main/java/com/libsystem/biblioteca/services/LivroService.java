package com.libsystem.biblioteca.services;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import com.libsystem.biblioteca.dtos.LivroDetalhadoDto;
import com.libsystem.biblioteca.dtos.LivroDto;
import com.libsystem.biblioteca.models.Livro;

public interface LivroService {
	ResponseEntity<List<LivroDto>> listarLivros();
	LivroDto findById(@PathVariable Long id);
	LivroDetalhadoDto create(Livro livro);
	String deleteById(@PathVariable Long id);
	LivroDetalhadoDto detalhesLivro(@PathVariable Long id);

}

