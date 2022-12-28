package com.projetospringboot.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospringboot.aula.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
