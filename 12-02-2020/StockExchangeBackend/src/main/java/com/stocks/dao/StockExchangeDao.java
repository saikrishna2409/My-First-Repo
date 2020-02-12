package com.stocks.dao;
import java.util.List;

import com.stocks.datamodel.StockExchange;

public interface StockExchangeDao {

		public boolean saveStockExchange(StockExchange stockexchange);

		public boolean updateStockExchange(StockExchange stockexchange);

		public boolean deleteStockExchange(StockExchange stockexchange);

		public StockExchange getStockExchangeById(int id);

		public List<StockExchange> getAllStockExchange();
		
		public boolean isValidStockExchange(String name, String address);

	}
