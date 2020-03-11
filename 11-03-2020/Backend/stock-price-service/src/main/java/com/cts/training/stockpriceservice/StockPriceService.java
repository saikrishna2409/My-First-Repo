package com.cts.training.stockpriceservice;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;


public interface StockPriceService {
	public String  addStockPrice(StockPrice sp);
	public void deleteStockPrice(int id);
	public String updateStockPrice(StockPrice sp);
	public StockPrice getStockPriceById(int id);
	public ImportSummary addStockPricesFromExcelSheet(MultipartFile file) throws Exception;
	public List<StockPrice> getAllStockPrice();
}
