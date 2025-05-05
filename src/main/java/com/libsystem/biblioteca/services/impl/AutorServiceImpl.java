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
	public String deleteById(@PathVariable String id) {
		repository.deleteById(Long.parseLong(id));
		return "Autor excluído com sucesso.";
	}
	
	@Override
	public Autor create(Autor autor) {
		Autor newAutor = repository.save(autor);
		return newAutor;
	}
	
	@Override
	public Autor update(@PathVariable Long id, Autor editarAutor) {
		Autor autorEditado = repository.findById(id).get();
		
		autorEditado.setNome(editarAutor.getNome());
		autorEditado.setAnoFalesc(editarAutor.getAnoFalesc());
		autorEditado.setAnoNasc(editarAutor.getAnoNasc());
		autorEditado.setCidade(editarAutor.getCidade());
		autorEditado.setPais(editarAutor.getPais());
		
		repository.save(autorEditado);
		
		return autorEditado;
	}
	
	@Override
	public List<Autor> pesquisa(String nome){
		return repository.buscaAutor(nome);
	}

}
