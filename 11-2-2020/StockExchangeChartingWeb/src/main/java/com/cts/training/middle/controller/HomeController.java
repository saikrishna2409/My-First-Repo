package com.cts.training.middle.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stocks.dao.CompanyDao;
import com.stocks.dao.UserDao;
import com.stocks.datamodel.Company;
import com.stocks.datamodel.StockExchange;
import com.stocks.datamodel.User;

@Controller
public class HomeController {
	@Autowired
	private UserDao userDAO;
	@Autowired
	private CompanyDao companyDAO;
	//private StockEchangeDao stockexchangeDAO;
	//@GetMapping("/")--> In spring 4.3 version and Above
	@RequestMapping("/")
	public String indexPage(Model model) {
		model.addAttribute("message","Welcome to spring MVC");
		//List<String> names= new ArrayList<String>();
	//	List<User> users =userDAO.getAllUsers();
	//s	model.addAttribute("list",users);
		//addNames(names);
	//	model.addAttribute("list", users);
		
		return "index";
	}
	@RequestMapping("/user")
	public String userPage(Model model) {
		//List<String> names= new ArrayList<String>();
		List<User> users =userDAO.getAllUsers();
		//model.addAttribute("list",users);
		//addNames(names);
		model.addAttribute("list", users);
		
		return "user";
	}
	@RequestMapping("/company")
	public String companyPage(Model model) {
		//List<String> names= new ArrayList<String>();
		List<Company> comp =companyDAO.getAllCompany();
		//model.addAttribute("list",comp);
		//addNames(names);
		model.addAttribute("list", comp);
		
		return "company";
	}
//	@RequestMapping("/StockExchange")
//	public String StockExchangePage(Model model) {
//		//List<String> names= new ArrayList<String>();
//		List<StockExchange> users =stockexchangeDAO.getAllUsers();
//		//model.addAttribute("list",users);
//		//addNames(names);
//		model.addAttribute("list", users);
//		
//		return "user";
//	}

	private void addNames(List<String> names) {
		// TODO Auto-generated method stub
		names.add("Krishna");
		names.add("sai");
		names.add("Raju");
		names.add("Kumar");
		names.add("Abin");
		
	}

}
