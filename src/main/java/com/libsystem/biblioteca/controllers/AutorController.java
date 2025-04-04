package com.libsystem.biblioteca.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.libsystem.biblioteca.models.Autor;
import com.libsystem.biblioteca.services.impl.AutorServiceImpl;

@RequestMapping(value = "/autor")
@RestController
public class AutorController {
	
	@Autowired
	private AutorServiceImpl service;
	
	@GetMapping("/lista-autores")
	public ResponseEntity<List<Autor>> listarAutores(){
		return service.listarAutores();
	}
	
	
	@GetMapping("/busca-autor/{id}")
	public Autor findById(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@GetMapping(value = "/excluir-autor/{id}")
	public String deleteById(@PathVariable Long id) {
		return service.deleteById(id);
	}

}
