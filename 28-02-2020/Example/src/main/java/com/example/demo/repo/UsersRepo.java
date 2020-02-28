package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Users;


public interface UsersRepo extends JpaRepository<Users, Integer> {

	public Users findByEmail(String email); 
}
