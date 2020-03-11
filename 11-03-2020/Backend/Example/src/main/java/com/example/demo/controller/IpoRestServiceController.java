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

import com.example.demo.dto.CompanyDto;
import com.example.demo.dto.IpoDto;
import com.example.demo.models.Company;
import com.example.demo.models.Ipos;
import com.example.demo.repo.IpoRepo;
import com.example.demo.service.CompanyService;
import com.example.demo.service.IpoService;
@CrossOrigin(origins="*")
@RestController
public class IpoRestServiceController {
	@Autowired
	IpoRepo ipoRepo;
	@Autowired
	IpoService ipoService;
	
	@RequestMapping(value="/ipos",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Ipos> findAll() {
		return ipoRepo.findAll();
	}
	
	@RequestMapping(value="/ipos/{id}",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public Ipos findOne(@PathVariable int id) {
		Optional<Ipos> ip = ipoRepo.findById(id);
		Ipos i = ip.get();
		return i;
	}
	
	@RequestMapping(value="/ipos",method= RequestMethod.POST)
	public String save(@RequestBody IpoDto ip) {
	String ipos =ipoService.addIpo(ip);
		return ipos;
	}
	
	@RequestMapping(value="/ipos/{id}",method= RequestMethod.DELETE)
	public void delete(@PathVariable int id) {
		ipoService.deleteIpo(id);
	}
	
	@RequestMapping(value="/ipos",method= RequestMethod.PUT)
	public String update(@RequestBody IpoDto ip) {
	//	Company company = companyRepo.save(usr);
		String ipo =ipoService.updateIpo(ip);
		return ipo;
	}
}
