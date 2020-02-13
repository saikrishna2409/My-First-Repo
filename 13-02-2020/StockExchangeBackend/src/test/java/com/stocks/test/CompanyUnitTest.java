package com.stocks.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.stocks.dao.CompanyDao;
import com.stocks.dao.UserDao;
import com.stocks.datamodel.Company;
import com.stocks.datamodel.User;

public class CompanyUnitTest {
	@Autowired
	private static CompanyDao companyDAO;
	private static AnnotationConfigApplicationContext context;
	private static Company company;
	@BeforeClass
	public static void init() {

		context = new AnnotationConfigApplicationContext();
		context.scan("com.stocks");
		context.refresh();
		company = (Company) context.getBean("company");
		companyDAO = (CompanyDao) context.getBean("companyDAO");

	} 
//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	@Test
	public void getAllCompany() {
		List<Company> company = companyDAO.getAllCompany();
		assertEquals(2, company.size());  
	}
	} 
