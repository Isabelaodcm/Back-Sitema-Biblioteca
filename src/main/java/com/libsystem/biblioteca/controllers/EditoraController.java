package com.libsystem.biblioteca.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.libsystem.biblioteca.dtos.EditoraDto;
import com.libsystem.biblioteca.models.Editora;
import com.libsystem.biblioteca.services.impl.EditoraServiceImpl;

@RequestMapping(value = "/editora")
@RestController
public class EditoraController {
	
	@Autowired
	private EditoraServiceImpl service;
	
	@GetMapping(value = "/lista-editoras")
	public ResponseEntity<List<EditoraDto>> listarEditoras(){
		return service.listarEditoras();
	}
	
	@GetMapping(value = "/busca-editora/{id}")
	public EditoraDto findById(@PathVariable Long id) {
		return service.findById(id);
	}

	@GetMapping(value = "/excluir/{id}")
	public String deleteById(@PathVariable Long id) {
		return service.deleteById(id);
	}
	
	@GetMapping(value = "/detalhes/{id}")
	public Editora detalhesEditora(@PathVariable Long id) {
		return service.detalhesEditora(id);
	}

	@GetMapping(value = "/cadastrar")
	public Editora create(@RequestBody Editora editora) {
		return service.create(editora);
	}
	
	@GetMapping(value = "/editar/{id}")
	public ResponseEntity<Editora> update(@PathVariable Long id, @RequestBody Editora editarEditora) {
		return ResponseEntity.ok(service.update(id, editarEditora));

	}
}
