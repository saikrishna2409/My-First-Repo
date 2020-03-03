package com.cts.training.stockpriceservice;

import java.util.List;


public interface StockPriceService {
	public String  addStockPrice(StockPrice sp);
	public void deleteStockPrice(int id);
	public String updateStockPrice(StockPrice sp);
	public StockPrice getStockPriceById(int id);

	public List<StockPrice> getAllStockPrice();
}
