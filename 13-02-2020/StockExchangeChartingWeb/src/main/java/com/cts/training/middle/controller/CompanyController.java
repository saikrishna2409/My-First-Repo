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
import com.stocks.datamodel.Company;
import com.stocks.datamodel.User;

@Controller
public class CompanyController {
	@Autowired
	CompanyDao companyDAO;

	@GetMapping("/company-home")
	public String companypage(Model model) {

		List<Company> comp = companyDAO.getAllCompany();
		model.addAttribute("list", comp);
		model.addAttribute("company", new Company());// user will work as model attribute in form
		return "companies";
	}

	@PostMapping("/company/save")
	// @RequestMapping(value="/user/save",method=RequestMethod.POST)
	public String addCompany(@ModelAttribute("company") Company company) {
		companyDAO.saveCompany(company);
		return "redirect:/company-home";
	}

	@GetMapping("/remove-company/{id}")
	public String deleteCompany(@PathVariable("id") int id) {
		Company company = companyDAO.getCompanyById(id);
		companyDAO.deleteCompany(company);

		return "redirect:/company-home";
	}

}
