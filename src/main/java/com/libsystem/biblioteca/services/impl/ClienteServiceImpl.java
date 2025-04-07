package com.libsystem.biblioteca.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.libsystem.biblioteca.dtos.ClienteDto;
import com.libsystem.biblioteca.mappers.ClienteMapper;
import com.libsystem.biblioteca.models.Cliente;
import com.libsystem.biblioteca.repositories.ClienteRepository;
import com.libsystem.biblioteca.services.ClienteService;


@Service
public class ClienteServiceImpl implements ClienteService{
	
	private final ClienteMapper mapper = ClienteMapper.INSTANCE;
	
	@Autowired
	private ClienteRepository repository;
	
	@Override
	public ResponseEntity<List<ClienteDto>> listarClientes(){
		List<Cliente> clientes = repository.findAll();
		return ResponseEntity.ok(mapper.paraDto(clientes));
	}
	
	@Override
	public Cliente findById(@PathVariable Long id) {
		return repository.findById(id).get();
	}
	
	@Override
	public String deleteById(@PathVariable Long id) {
		repository.deleteById(id);
		return "Editora excluída com sucesso";
	}
	
	@Override
	public Cliente create(Cliente cliente) {
		Cliente newCliente = repository.save(cliente);
		return newCliente;
	}
	
	@Override
	public Cliente update(@PathVariable Long id, Cliente editarCliente) {
		Cliente clienteEditado = repository.findById(id).get();
		
		clienteEditado.setCpf(editarCliente.getCpf());
		clienteEditado.setNome(editarCliente.getNome());
		clienteEditado.setEmail(editarCliente.getEmail());
		clienteEditado.setTelefone(editarCliente.getTelefone());
		
		repository.save(clienteEditado);
		
		return clienteEditado;
	}

}
