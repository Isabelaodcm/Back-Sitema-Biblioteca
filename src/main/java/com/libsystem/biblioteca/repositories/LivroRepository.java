package com.libsystem.biblioteca.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.libsystem.biblioteca.models.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long>{
	
	@Query(value = "SELECT * FROM livro WHERE LOWER(titulo) LIKE LOWER(CONCAT('%', :titulo, '%'))", nativeQuery = true)
	List<Livro> buscarTitulo(@Param("titulo") String titulo);
	
	
}
