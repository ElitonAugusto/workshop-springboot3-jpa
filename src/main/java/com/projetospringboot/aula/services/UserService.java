package com.projetospringboot.aula.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetospringboot.aula.entities.User;
import com.projetospringboot.aula.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();	
	}
	
	public User findByID(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
}