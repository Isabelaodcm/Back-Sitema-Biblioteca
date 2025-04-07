package com.libsystem.biblioteca.services;

import org.springframework.web.bind.annotation.PathVariable;

import com.libsystem.biblioteca.models.User;

public interface UserService {
	User create(User user);
	String delete(@PathVariable Long id);
	User VerConta(@PathVariable Long id);
	User update(@PathVariable Long id, User editarLivro);
	
}
