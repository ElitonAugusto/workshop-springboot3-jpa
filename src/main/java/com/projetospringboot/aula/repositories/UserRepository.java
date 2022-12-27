package com.projetospringboot.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospringboot.aula.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
