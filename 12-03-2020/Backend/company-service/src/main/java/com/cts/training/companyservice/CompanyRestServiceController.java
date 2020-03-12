package com.cts.training.companyservice;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@CrossOrigin(origins="*")
@RestController
public class CompanyRestServiceController {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	UserServiceProxy proxy;
	@Autowired
	CompanyRepo companyRepo;
	@Autowired
	CompanyService companyService;
	
	@RequestMapping(value="/company",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Company> findAll() {
		return companyRepo.findAll();
	}
	
	@RequestMapping(value="/company/{id}",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public Company findOne(@PathVariable int id) {
		Optional<Company> comp = companyRepo.findById(id);
		Company company = comp.get();
		return company;
	}
	
	@PostMapping("/company")
	public String save(@RequestBody Company comp) {
		String status = companyService.addCompany(comp);
		return status;
	}
	
	@RequestMapping(value="/company/{id}",method= RequestMethod.DELETE)
	public void delete(@PathVariable int id) {
		companyService.deleteCompany(id);
	}
	
	@RequestMapping(value="/company",method= RequestMethod.PUT)
	public String update(@RequestBody Company comp) {
	//	Company company = companyRepo.save(usr);
		String company =companyService.updateCompany(comp);
		return company;
	}
	@RequestMapping(value = "/users-by-company", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getAllUsersByCompany(){
		logger.info("Get All users invoked.......");
		ResponseEntity<?> users =proxy.getAllUsers();
		logger.info("Information --> {}",users);
		return users;
	}
}
