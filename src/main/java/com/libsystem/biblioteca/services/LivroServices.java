package com.libsystem.biblioteca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.libsystem.biblioteca.dtos.LivroDto;
import com.libsystem.biblioteca.mappers.LivroMapper;
import com.libsystem.biblioteca.models.Livro;
import com.libsystem.biblioteca.repositories.LivroRepository;

@Service
public class LivroServices {
	
//	@Autowired
//	private LivroMapper mapper;
//	
//	@Autowired
//	private LivroRepository repository;
//	
//	public ResponseEntity<List<Livro>> listarLivros(){
//		
//		List<Livro> livros = repository.findAll();
//		
//		List<LivroDto> livrosDto = mapper.paraDto(livros);
//
//		return ResponseEntity.ok(livrosDto);
//	}
}
