package com.projetospringboot.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospringboot.aula.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
