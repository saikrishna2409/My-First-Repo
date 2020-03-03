package com.cts.training.stockexchangeservice;

import java.util.List;


public interface StockExchangeService {
	public String  addStockExchange(StockExchange se);
	public void deleteStockExchange(int id);
	public String updateStockExchange(StockExchange se);
	public StockExchange getStockExchangeById(int id);

	public List<StockExchange> getAllStockExchange();
}
