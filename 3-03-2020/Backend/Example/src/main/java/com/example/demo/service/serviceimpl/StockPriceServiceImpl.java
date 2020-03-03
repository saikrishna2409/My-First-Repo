package com.example.demo.service.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import com.example.demo.models.StockPrice;
import com.example.demo.repo.StockPriceRepo;
import com.example.demo.service.StockPriceService;

public class StockPriceServiceImpl implements StockPriceService{
	@Autowired
	StockPriceRepo stockPriceRepo;
	@Autowired
	JavaMailSender jms;
	@Override
	public String addStockPrice(StockPrice sp) {
		StockPrice sop =new StockPrice();
		BeanUtils.copyProperties(sp, sop);
		sop=stockPriceRepo.save(sop);
		if(sop!=null) {
			return "{\"res\":\"1\"}";
		}
		else {
			return "{\"res\":\"0\"}";
		}
	}
		
	@Override
	public void  deleteStockPrice(int id) {
	stockPriceRepo.deleteById(id);
	}
	@Override
	public List<StockPrice> getAllStockPrice() {
		return stockPriceRepo.findAll();
	}
	@Override
	public StockPrice getStockPriceById(int id) {
		// TODO Auto-generated method stub
		Optional<StockPrice> sop  =stockPriceRepo.findById(id);
		StockPrice stop =sop.get();
		return stop;
	}
	@Override
	public String updateStockPrice(StockPrice sp) {
		StockPrice sop = new StockPrice();
		BeanUtils.copyProperties(sp, sop);
		sop=stockPriceRepo.save(sop);
		if(sop!=null) {
		return "{\"res\":\"1\"}";}
		else {
			return "{\"res\":\"0\"}";
		}
	}

	
}
