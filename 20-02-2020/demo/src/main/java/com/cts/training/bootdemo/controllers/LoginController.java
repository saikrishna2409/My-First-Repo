package com.cts.training.bootdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginController {

	@RequestMapping("/")
	public String indexPage() {
		return "index";
	}
	
	@RequestMapping(value= "/login", method = RequestMethod.GET)
	//@ResponseBody
	public String showLogin(ModelMap model)
	{
		return "login";
	}
	@RequestMapping(value= "/login", method= RequestMethod.POST)
	public String showWelcome(@RequestParam String nm, ModelMap model)
	{
	model.put("name",  nm);
	return "welcome";
    }
}
