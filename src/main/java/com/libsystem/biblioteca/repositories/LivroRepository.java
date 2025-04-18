package com.libsystem.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libsystem.biblioteca.models.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long>{

}
