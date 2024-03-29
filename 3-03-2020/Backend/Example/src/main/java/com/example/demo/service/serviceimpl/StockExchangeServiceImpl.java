package com.example.demo.service.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.example.demo.dto.StockExchangeDto;
import com.example.demo.models.StockExchange;
import com.example.demo.repo.StockExchangeRepo;
import com.example.demo.service.StockExchangeService;

@Service
public class StockExchangeServiceImpl implements StockExchangeService {
	@Autowired
	StockExchangeRepo stockExchangeRepo ;
	@Autowired
	JavaMailSender jms;
	@Override
	public String addStockExchange(StockExchangeDto se) {
		StockExchange stockexchange =new StockExchange();
		BeanUtils.copyProperties(se, stockexchange);
		stockexchange=stockExchangeRepo.save(stockexchange);
		if(stockexchange!=null) {
			return "{\"res\":\"1\"}";
		}
		else {
			return "{\"res\":\"0\"}";
		}
	}
		
	@Override
	public void  deleteStockExchange(int id) {
		stockExchangeRepo.deleteById(id);
	}
	@Override
	public List<StockExchange> getAllStockExchange() {
		return stockExchangeRepo.findAll();
	}
	@Override
	public StockExchange getStockExchangeById(int id) {
		// TODO Auto-generated method stub
		Optional<StockExchange> se =stockExchangeRepo.findById(id);
		StockExchange s =se.get();
		return s;
	}
	@Override
	public  String updateStockExchange(StockExchangeDto se) {
		StockExchange ste = new StockExchange();
		BeanUtils.copyProperties(se, ste);
		ste=stockExchangeRepo.save(ste);
		if(ste!=null) {
		return "{\"res\":\"1\"}";}
		else {
			return "{\"res\":\"0\"}";
		}
	}

	
	
}
