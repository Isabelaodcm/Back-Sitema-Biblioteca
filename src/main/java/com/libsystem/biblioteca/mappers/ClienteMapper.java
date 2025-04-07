package com.libsystem.biblioteca.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.libsystem.biblioteca.dtos.ClienteDto;
import com.libsystem.biblioteca.models.Cliente;

@Mapper(componentModel = "spring")
public interface ClienteMapper {

	ClienteMapper INSTANCE  = Mappers.getMapper(ClienteMapper.class);
		
	ClienteDto paraDto(Cliente cliente);
	Cliente paraCliente(ClienteDto clienteDto);
		
	List<ClienteDto> paraDto(List<Cliente> ecliente);

}
