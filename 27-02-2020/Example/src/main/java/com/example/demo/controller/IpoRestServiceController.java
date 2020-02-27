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

import com.example.demo.models.Ipos;
import com.example.demo.repo.IpoRepo;
@CrossOrigin(origins="*")
@RestController
public class IpoRestServiceController {
	@Autowired
	IpoRepo ir;
	
	@RequestMapping(value="/ipos",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Ipos> findAll() {
		return ir.findAll();
	}
	
	@RequestMapping(value="/ipos/{id}",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public Ipos findOne(@PathVariable int id) {
		Optional<Ipos> usr = ir.findById(id);
		Ipos us = usr.get();
		return us;
	}
	
	@RequestMapping(value="/ipos",method= RequestMethod.POST)
	public Ipos save(@RequestBody Ipos usr) {
		Ipos us = ir.save(usr);
		return us;
	}
	
	@RequestMapping(value="/ipos/{id}",method= RequestMethod.DELETE)
	public void delete(@PathVariable int id) {
		ir.deleteById(id);
	}
	
	@RequestMapping(value="/ipos",method= RequestMethod.PUT)
	public Ipos update(@RequestBody Ipos usr) {
		Ipos us = ir.save(usr);
		return us;
	}
}
