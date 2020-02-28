package com.example.demo.controller;

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

import com.example.demo.models.Company;
import com.example.demo.models.Users;
import com.example.demo.repo.CompanyRepo;
import com.example.demo.repo.UsersRepo;

@CrossOrigin(origins="*")
@RestController
public class CompanyRestServiceController {
	@Autowired
	CompanyRepo cr;
	
	@RequestMapping(value="/company",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Company> findAll() {
		return cr.findAll();
	}
	
	@RequestMapping(value="/company/{id}",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public Company findOne(@PathVariable int id) {
		Optional<Company> usr = cr.findById(id);
		Company us = usr.get();
		return us;
	}
	
	@RequestMapping(value="/company",method= RequestMethod.POST)
	public Company save(@RequestBody Company usr) {
		Company us = cr.save(usr);
		return us;
	}
	
	@RequestMapping(value="/company/{id}",method= RequestMethod.DELETE)
	public void delete(@PathVariable int id) {
		cr.deleteById(id);
	}
	
	@RequestMapping(value="/company",method= RequestMethod.PUT)
	public Company update(@RequestBody Company usr) {
		Company us = cr.save(usr);
		return us;
	}
}
