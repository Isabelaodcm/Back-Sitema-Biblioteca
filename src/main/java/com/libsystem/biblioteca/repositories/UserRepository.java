package com.libsystem.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libsystem.biblioteca.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
