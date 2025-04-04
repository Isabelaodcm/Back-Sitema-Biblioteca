package com.libsystem.biblioteca.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.libsystem.biblioteca.dtos.LivroDetalhadoDto;
import com.libsystem.biblioteca.dtos.LivroDto;
import com.libsystem.biblioteca.mappers.LivroMapper;
import com.libsystem.biblioteca.models.Livro;
import com.libsystem.biblioteca.repositories.LivroRepository;
import com.libsystem.biblioteca.services.LivroService;

@Service
public class LivroServiceImpl implements LivroService {
	
	private final LivroMapper mapper = LivroMapper.INSTANCE;
	
	@Autowired
	private LivroRepository repository;
	
	@Override
	public ResponseEntity<List<LivroDto>> listarLivros(){
		List<Livro> livros = repository.findAll();
		return ResponseEntity.ok(mapper.paraDto(livros));
	}
	
	@Override
	public LivroDto findById(@PathVariable Long id) {
		return mapper.paraDto(repository.findById(id).get());
		
	}
	
	@Override
	public String deleteById(@PathVariable Long id) {
		repository.deleteById(id);
		return "Livro excluído com sucesso";
	}
	
	@Override
	public LivroDetalhadoDto detalhesLivro(@PathVariable Long id) {
		return mapper.paraDDto(repository.findById(id).get());
	}
	
	@Override
	public LivroDetalhadoDto create(Livro livro) {
		Livro newLivro = repository.save(livro);
		return mapper.paraDDto(newLivro);
	}
}
