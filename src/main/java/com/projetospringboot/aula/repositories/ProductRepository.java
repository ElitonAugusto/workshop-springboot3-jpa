package com.projetospringboot.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospringboot.aula.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
