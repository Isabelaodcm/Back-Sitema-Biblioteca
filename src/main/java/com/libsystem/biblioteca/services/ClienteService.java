package com.libsystem.biblioteca.services;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import com.libsystem.biblioteca.dtos.ClienteDto;
import com.libsystem.biblioteca.models.Cliente;

public interface ClienteService {
	ResponseEntity<List<ClienteDto>> listarClientes();
	Cliente findById(@PathVariable Long id);
	String deleteById(@PathVariable Long id);
	Cliente create(Cliente cliente);
	Cliente update(@PathVariable Long id, Cliente editarCliente);
}
