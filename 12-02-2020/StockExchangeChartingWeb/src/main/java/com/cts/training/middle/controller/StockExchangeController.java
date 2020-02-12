package com.cts.training.middle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.stocks.dao.CompanyDao;
import com.stocks.dao.StockExchangeDao;
import com.stocks.datamodel.Company;
import com.stocks.datamodel.StockExchange;
@Controller
public class StockExchangeController {
		@Autowired
		StockExchangeDao stockexchangeDAO;

		@GetMapping("/stockexchange-home")
		public String stockexchangepage(Model model) {

			List<StockExchange> stock = stockexchangeDAO.getAllStockExchange();
			model.addAttribute("stock", stock);
			model.addAttribute("stockexchange", new StockExchange());
			//model.addAttribute("stockexchange", new StockExchange());// user will work as model attribute in form
			return "Stocks";
		}
		@PostMapping("/stockexchange/save")
		// @RequestMapping(value="/user/save",method=RequestMethod.POST)
		public String addCompany(@ModelAttribute("stockexchange") StockExchange stockexchange) {
			stockexchangeDAO.saveStockExchange(stockexchange);
			return "redirect:/stockexchange-home";
		}

}
