package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Ipos;

public interface IpoRepo extends JpaRepository<Ipos, Integer>{

}
