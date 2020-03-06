package com.cts.training.stockpriceservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins="*")
@RestController

public class StockPriceRestServiceController {
	@Autowired
	StockPriceRepo stockPriceRepo;
	
	@RequestMapping(value="/stockprice",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<StockPrice> findAll() {
		return stockPriceRepo.findAll();
	}
	
	@RequestMapping(value="/stockprice/{id}",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public StockPrice findOne(@PathVariable int id) {
		Optional<StockPrice> stock = stockPriceRepo.findById(id);
		StockPrice stockpricereturn = stock.get();
		return stockpricereturn;
	}
	
	@RequestMapping(value="/stockprice",method= RequestMethod.POST)
	public StockPrice save(@RequestBody StockPrice stockprice) {
		StockPrice stock = stockPriceRepo.save(stockprice);
		return stock;
	}
	
	@RequestMapping(value="/stockprice/{id}",method= RequestMethod.DELETE)
	public void delete(@PathVariable int id) {
		stockPriceRepo.deleteById(id);
	}
	
	@RequestMapping(value="/stockprice",method= RequestMethod.PUT)
	public StockPrice update(@RequestBody StockPrice spr) {
		StockPrice stock = stockPriceRepo.save(spr);
		return stock;
	}
}
