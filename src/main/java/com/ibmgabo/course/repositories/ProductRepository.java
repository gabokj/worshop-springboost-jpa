package com.ibmgabo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibmgabo.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
