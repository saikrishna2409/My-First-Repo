package com.example.demo.service.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.example.demo.dto.CompanyDto;
import com.example.demo.models.Company;
import com.example.demo.repo.CompanyRepo;
import com.example.demo.service.CompanyService;
@Service
public class CompanyServiceImpl  implements CompanyService{
	@Autowired
	CompanyRepo companyRepo;	
	@Autowired
	JavaMailSender jms;
	@Override
	public String addCompany(CompanyDto comp) {
		Company company =new Company();
		BeanUtils.copyProperties(comp, company);
		company=companyRepo.save(company);
		if(company!=null) {
			return "{\"res\":\"1\"}";
		}
		else {
			return "{\"res\":\"0\"}";
		}
	}
		
	@Override
	public void  deleteCompany(int id) {
		companyRepo.deleteById(id);
	}
	@Override
	public List<Company> getAllCompany() {
		return companyRepo.findAll();
	}
	@Override
	public Company getCompanyById(int id) {
		// TODO Auto-generated method stub
		Optional<Company> cmp  =companyRepo.findById(id);
		Company company =cmp.get();
		return company;
	}
	@Override
	public String updateCompany(CompanyDto comp) {
		Company company = new Company();
		BeanUtils.copyProperties(comp, company);
		company=companyRepo.save(company);
		if(company!=null) {
		return "{\"res\":\"1\"}";}
		else {
			return "{\"res\":\"0\"}";
		}
	}

	
	

}
