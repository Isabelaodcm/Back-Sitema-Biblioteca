package com.libsystem.biblioteca.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.libsystem.biblioteca.models.Editora;

@Repository
public interface EditoraRepository extends JpaRepository<Editora, Long>{
	
	@Query(value = "SELECT * FROM editora WHERE(nome) LIKE LOWER(CONCAT('%', :nome, '%'))", nativeQuery = true)
	List<Editora> buscarEditora(@Param("nome") String nome);

}

