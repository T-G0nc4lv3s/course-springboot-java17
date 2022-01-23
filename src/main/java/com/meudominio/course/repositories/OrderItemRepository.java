package com.meudominio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meudominio.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
