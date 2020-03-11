package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.IpoDto;
import com.example.demo.dto.StockExchangeDto;
import com.example.demo.models.Ipos;
import com.example.demo.models.StockExchange;

public interface StockExchangeService {
	public String  addStockExchange(StockExchangeDto se);
	public void deleteStockExchange(int id);
	public String updateStockExchange(StockExchangeDto se);
	public StockExchange getStockExchangeById(int id);

	public List<StockExchange> getAllStockExchange();
}
