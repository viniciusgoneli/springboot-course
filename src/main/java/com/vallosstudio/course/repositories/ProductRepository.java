package com.vallosstudio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vallosstudio.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
