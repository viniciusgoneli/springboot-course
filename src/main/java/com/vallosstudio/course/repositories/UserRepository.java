package com.vallosstudio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vallosstudio.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
