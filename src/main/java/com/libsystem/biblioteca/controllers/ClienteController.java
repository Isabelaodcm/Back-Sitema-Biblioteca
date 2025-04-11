package com.libsystem.biblioteca.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.libsystem.biblioteca.dtos.ClienteDto;
import com.libsystem.biblioteca.models.Cliente;
import com.libsystem.biblioteca.services.impl.ClienteServiceImpl;

@RequestMapping(value = "/cliente")
@RestController
@CrossOrigin("*")
public class ClienteController {

	@Autowired
	private ClienteServiceImpl service;
	
	@GetMapping(value = "/lista-clientes")
	public ResponseEntity<List<ClienteDto>> listarClientes(){
		return service.listarClientes();
	}
	
	@GetMapping(value = "/busca-cliente/{id}")
	public Cliente findById(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@GetMapping(value = "/excluir/{id}")
	public String deleteById(@PathVariable Long id) {
		return service.deleteById(id);
	}
	
	@GetMapping(value = "/cadastrar")
	public Cliente create(Cliente cliente) {
		return service.create(cliente);
	}
	
	@GetMapping(value = "/editar")
	public ResponseEntity<Cliente> update(@PathVariable Long id, @RequestBody Cliente editarCliente) {
		return ResponseEntity.ok(service.update(id, editarCliente));
	}
}
