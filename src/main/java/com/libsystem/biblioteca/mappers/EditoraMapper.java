package com.libsystem.biblioteca.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.libsystem.biblioteca.dtos.EditoraDto;
import com.libsystem.biblioteca.models.Editora;

@Mapper(componentModel = "spring")
public interface EditoraMapper {
	
	EditoraMapper INSTANCE  = Mappers.getMapper(EditoraMapper.class);
	
	EditoraDto paraDto(Editora editora);
	Editora paraEditora(EditoraDto editoraDto);
	
	List<EditoraDto> paraDto(List<Editora> editoras);

}
