package com.projetospringboot.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospringboot.aula.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
