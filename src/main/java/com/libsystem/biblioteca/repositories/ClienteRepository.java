package com.libsystem.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libsystem.biblioteca.models.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}

