package com.cts.training.stockexchangeservice;

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
public class StockExchangeRestServiceController {
	@Autowired
	StockExchangeRepo sr;
	
	@RequestMapping(value="/stockexchange",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<StockExchange> findAll() {
		return sr.findAll();
	}
	
	@RequestMapping(value="/stockexchange/{id}",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public StockExchange findOne(@PathVariable int id) {
		Optional<StockExchange> usr = sr.findById(id);
		StockExchange us = usr.get();
		return us;
	}
	
	@RequestMapping(value="/stockexchange",method= RequestMethod.POST)
	public StockExchange save(@RequestBody StockExchange usr) {
		StockExchange us = sr.save(usr);
		return us;
	}
	
	@RequestMapping(value="/stockexchange/{id}",method= RequestMethod.DELETE)
	public void delete(@PathVariable int id) {
		sr.deleteById(id);
	}
	
	@RequestMapping(value="/stockexchange",method= RequestMethod.PUT)
	public StockExchange update(@RequestBody StockExchange usr) {
		StockExchange us = sr.save(usr);
		return us;
	}
}
