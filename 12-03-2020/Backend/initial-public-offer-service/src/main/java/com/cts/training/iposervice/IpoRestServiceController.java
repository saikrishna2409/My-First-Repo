package com.cts.training.iposervice;

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


@CrossOrigin(origins="*")
@RestController
public class IpoRestServiceController {
	@Autowired
	CompanyServiceProxy proxy;
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
	@RequestMapping(value="/ipo-by-company/{id}",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public Company findOneCompany(@PathVariable int id) {
		return proxy.findOne(id);
	}
}
