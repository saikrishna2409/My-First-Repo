package com.stocks.dao;

import java.util.List;

import com.stocks.datamodel.Company;
import com.stocks.datamodel.User;

public interface CompanyDao {
	

	public boolean saveCompany(Company company);

	public boolean updateCompany(Company company);

	public boolean deleteCompany(Company company);

	public Company getCompanyById(int id);

	public List<Company> getAllCompany();

}
