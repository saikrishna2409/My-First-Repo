package com.cts.training.middle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.stocks.dao.CompanyDao;
import com.stocks.dao.StockExchangeDao;
import com.stocks.datamodel.Company;
import com.stocks.datamodel.StockExchange;
import com.stocks.datamodel.User;

@Controller
public class StockExchangeController {
	@Autowired
	StockExchangeDao stockexchangeDAO;

	@GetMapping("/stockexchange-home")
	public String stockexchangepage(Model model) {

		List<StockExchange> stock = stockexchangeDAO.getAllStockExchange();
		model.addAttribute("stock", stock);
		model.addAttribute("stockexchange", new StockExchange());
		// model.addAttribute("stockexchange", new StockExchange());// user will work as
		// model attribute in form
		return "stocks";
	}

	@PostMapping("/stockexchange/save")
	// @RequestMapping(value="/user/save",method=RequestMethod.POST)
	public String addCompany(@ModelAttribute("stockexchange") StockExchange stockexchange) {
		stockexchangeDAO.saveStockExchange(stockexchange);
		return "redirect:/stockexchange-home";
	}

	@GetMapping("/remove-stockexchange/{id}")
	public String deleteStockExchange(@PathVariable("id") int id) {
		StockExchange stockexchange = stockexchangeDAO.getStockExchangeById(id);
		stockexchangeDAO.deleteStockExchange(stockexchange);

		return "redirect:/stockexchange-home";
	}

	@GetMapping("/update-stockexchange/{id}")
	public String updateStockExchange(@PathVariable("id") int id, Model model) {
		StockExchange stockexchange = stockexchangeDAO.getStockExchangeById(id);
		model.addAttribute("stockexchange", stockexchange);
		List<StockExchange> stocks = stockexchangeDAO.getAllStockExchange();
		model.addAttribute("stock", stocks);
		return "stocks";
	}

}
