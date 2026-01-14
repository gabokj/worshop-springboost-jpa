package com.ibmgabo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibmgabo.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
