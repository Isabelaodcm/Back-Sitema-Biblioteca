package com.libsystem.biblioteca.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.libsystem.biblioteca.dtos.LivroDto;
import com.libsystem.biblioteca.models.Livro;

@Mapper(componentModel = "spring")
public interface LivroMapper {

    LivroMapper INSTANCE = Mappers.getMapper(LivroMapper.class);
    
    LivroDto paraDto (Livro livro);
    Livro paraLivro(LivroDto livroDto);

    List<LivroDto> paraDto(List<Livro> livros);
}	
