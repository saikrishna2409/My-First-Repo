package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.models.StockExchange;
import com.example.demo.models.StockPrice;
import com.example.demo.repo.StockExchangeRepo;
import com.example.demo.repo.StockPriceRepo;

public class StockPriceRestServiceController {
	@Autowired
	StockPriceRepo sr;
	
	@RequestMapping(value="/stockprice",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<StockPrice> findAll() {
		return sr.findAll();
	}
	
	@RequestMapping(value="/stockprice/{id}",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public StockPrice findOne(@PathVariable int id) {
		Optional<StockPrice> sp = sr.findById(id);
		StockPrice stockpricereturn = sp.get();
		return stockpricereturn;
	}
	
	@RequestMapping(value="/stockprice",method= RequestMethod.POST)
	public StockPrice save(@RequestBody StockPrice stp) {
		StockPrice spr = sr.save(stp);
		return spr;
	}
	
	@RequestMapping(value="/stockprice/{id}",method= RequestMethod.DELETE)
	public void delete(@PathVariable int id) {
		sr.deleteById(id);
	}
	
	@RequestMapping(value="/stockprice",method= RequestMethod.PUT)
	public StockPrice update(@RequestBody StockPrice spr) {
		StockPrice spreturn = sr.save(spr);
		return spreturn;
	}
}
