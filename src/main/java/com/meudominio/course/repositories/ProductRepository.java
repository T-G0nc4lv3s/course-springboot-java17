package com.meudominio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meudominio.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
