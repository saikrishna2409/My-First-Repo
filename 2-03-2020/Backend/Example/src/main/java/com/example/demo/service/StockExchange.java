package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.IpoDto;
import com.example.demo.dto.StockExchangeDto;
import com.example.demo.models.Ipos;

public interface StockExchange {
	public String  addStockExchange(StockExchangeDto pd);
	public void deleteStockExchange(int id);
	public String updateStockExchange(StockExchangeDto pd);
	public StockExchange getStockExchangeById(int id);

	public List<StockExchange> getAllStockExchange();
}
