package com.libsystem.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libsystem.biblioteca.models.Autor;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long>{

}
