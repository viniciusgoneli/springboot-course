package com.vallosstudio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vallosstudio.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
