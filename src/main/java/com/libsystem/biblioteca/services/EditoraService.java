package com.libsystem.biblioteca.services;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import com.libsystem.biblioteca.dtos.EditoraDto;
import com.libsystem.biblioteca.models.Editora;

public interface EditoraService {
	
	ResponseEntity<List<Editora>> listarEditoras();
	Editora findById(@PathVariable Long id);
	Editora detalhesEditora(@PathVariable Long id);
	String deleteById(@PathVariable Long id);
	Editora create(Editora editora);
	Editora update(@PathVariable Long id, Editora editoraEditada);
	List<Editora> pesquisa(String nome);
	
}
