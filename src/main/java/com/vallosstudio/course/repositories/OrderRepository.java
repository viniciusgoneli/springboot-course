package com.vallosstudio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vallosstudio.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
