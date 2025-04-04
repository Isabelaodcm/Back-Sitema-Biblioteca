package com.libsystem.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libsystem.biblioteca.models.Editora;

@Repository
public interface EditoraRepository extends JpaRepository<Editora, Long>{

}

