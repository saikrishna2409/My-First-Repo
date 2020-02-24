package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.StockExchange;

public interface StockExchangeRepo extends JpaRepository<StockExchange, Integer>{

}
