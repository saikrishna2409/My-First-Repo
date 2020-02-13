package com.stocks.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.stocks.dao.StockExchangeDao;
import com.stocks.datamodel.Company;
import com.stocks.datamodel.StockExchange;

public class StockExchangeTest {
	@Autowired
	private static StockExchangeDao stockexchangeDAO;
	private static AnnotationConfigApplicationContext context;
	private static StockExchange stockexchange;
	@BeforeClass
	public static void init() {

		context = new AnnotationConfigApplicationContext();
		context.scan("com.stocks");
		context.refresh();
		stockexchange = (StockExchange) context.getBean("stocks");
		stockexchangeDAO = (StockExchangeDao) context.getBean("stockExchangeDAO");

	} 
//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	
	@Test
	public void getAllStockExchange() {
		List<StockExchange> stockexchange = stockexchangeDAO.getAllStockExchange();
		assertEquals(0, stockexchange.size());   
	}
}
