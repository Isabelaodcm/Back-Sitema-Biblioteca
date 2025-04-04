package com.libsystem.biblioteca.services;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import com.libsystem.biblioteca.models.Autor;

public interface AutorService {
	ResponseEntity<List<Autor>> listarAutores();
	Autor findById(@PathVariable Long id);
	String deleteById(@PathVariable Long id);
//	Autor create(Autor autor);
//	Autor update(@PathVariable Long id, Autor editarAutor);
	
}
