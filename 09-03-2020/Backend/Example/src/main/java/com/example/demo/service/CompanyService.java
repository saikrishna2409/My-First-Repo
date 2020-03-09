package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.CompanyDto;
import com.example.demo.models.Company;


public interface CompanyService {
	public String  addCompany(CompanyDto comp);
	public void deleteCompany(int id);
	public String updateCompany(CompanyDto comp);
	public Company getCompanyById(int id);

	public List<Company> getAllCompany();
	
}
