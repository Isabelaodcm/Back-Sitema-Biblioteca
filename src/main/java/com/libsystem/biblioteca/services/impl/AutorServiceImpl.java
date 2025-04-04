package com.libsystem.biblioteca.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.libsystem.biblioteca.models.Autor;
import com.libsystem.biblioteca.repositories.AutorRepository;
import com.libsystem.biblioteca.services.AutorService;

@Service
public class AutorServiceImpl implements AutorService {
	
	@Autowired 
	private AutorRepository repository;
	
	@Override
	public ResponseEntity<List<Autor>> listarAutores(){
		List<Autor> autor = repository.findAll();
		return ResponseEntity.ok(autor);
		
	}
	
	@Override
	public Autor findById(@PathVariable Long id) {
		return repository.findById(id).get();
	}
	
	@Override
	public String deleteById(@PathVariable Long id) {
		repository.deleteById(id);
		return "Autor excluído com sucesso.";
	}
}
