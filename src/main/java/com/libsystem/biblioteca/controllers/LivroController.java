package com.libsystem.biblioteca.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.libsystem.biblioteca.repositories.LivroRepository;

@RequestMapping(value = "/livro")
@RestController
public class LivroController {
	
	@Autowired
	private LivroRepository repository;
	
	
}
