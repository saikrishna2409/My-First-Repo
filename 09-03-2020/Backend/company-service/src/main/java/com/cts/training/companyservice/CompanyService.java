package com.cts.training.companyservice;

import java.util.List;



public interface CompanyService {
	public String  addCompany(Company comp);
	public void deleteCompany(int id);
	public String updateCompany(Company comp);
	public Company getCompanyById(int id);

	public List<Company> getAllCompany();
	
}
