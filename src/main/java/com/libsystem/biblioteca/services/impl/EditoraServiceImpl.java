package com.libsystem.biblioteca.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.libsystem.biblioteca.dtos.EditoraDto;
import com.libsystem.biblioteca.mappers.EditoraMapper;
import com.libsystem.biblioteca.models.Autor;
import com.libsystem.biblioteca.models.Editora;
import com.libsystem.biblioteca.repositories.EditoraRepository;
import com.libsystem.biblioteca.services.EditoraService;

@Service
public class EditoraServiceImpl implements EditoraService{
	
	private final EditoraMapper mapper = EditoraMapper.INSTANCE;
	
	@Autowired
	private EditoraRepository repository;
	
	@Override
	public ResponseEntity<List<Editora>> listarEditoras(){
		List<Editora> editoras = repository.findAll();
		return ResponseEntity.ok(editoras);
	}
	
	@Override 
	public EditoraDto findById(@PathVariable Long id) {
		EditoraDto editora  = mapper.paraDto(repository.findById(id).get());
		return editora;
	}
	
	@Override 
	public Editora detalhesEditora(@PathVariable Long id) {
		Editora editora  = repository.findById(id).get();
		return editora;
	}
	
	
	@Override
	public String deleteById(@PathVariable Long id) {
		repository.deleteById(id);
		return "Editora excluída com sucesso";
	}
	
	@Override
	public Editora create(Editora editora) {
		Editora newEditora = repository.save(editora);
		return newEditora;
	}
	
	@Override
	public Editora update(@PathVariable Long id, Editora editoraEditada) {
		Editora editEditora = repository.findById(id).get();
		
		editoraEditada.setNome(editEditora.getNome());
		editoraEditada.setRua(editEditora.getRua());
		editoraEditada.setBairro(editEditora.getBairro());
		editoraEditada.setCidade(editEditora.getCidade());
		editoraEditada.setPais(editEditora.getPais());
		editoraEditada.setCep(editEditora.getCep());
		
		repository.save(editoraEditada);
		
		return editoraEditada;
	}
	
	

}
