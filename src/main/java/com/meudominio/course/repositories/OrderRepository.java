package com.meudominio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meudominio.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
	
}
