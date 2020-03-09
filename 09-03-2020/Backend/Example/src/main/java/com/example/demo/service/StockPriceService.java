package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.StockExchangeDto;
import com.example.demo.models.StockExchange;
import com.example.demo.models.StockPrice;

public interface StockPriceService {
	public String  addStockPrice(StockPrice sp);
	public void deleteStockPrice(int id);
	public String updateStockPrice(StockPrice sp);
	public StockPrice getStockPriceById(int id);

	public List<StockPrice> getAllStockPrice();
}
