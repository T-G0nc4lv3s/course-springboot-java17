package com.meudominio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meudominio.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	
}
