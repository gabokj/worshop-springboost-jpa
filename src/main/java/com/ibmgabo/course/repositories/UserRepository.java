package com.ibmgabo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibmgabo.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
