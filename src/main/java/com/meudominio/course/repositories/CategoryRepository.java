package com.meudominio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meudominio.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	
}
