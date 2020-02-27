package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Company;

public interface CompanyRepo extends JpaRepository<Company, Integer>{

}
