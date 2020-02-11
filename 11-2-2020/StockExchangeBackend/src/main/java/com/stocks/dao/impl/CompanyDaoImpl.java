package com.stocks.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

//import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.stocks.dao.CompanyDao;
import com.stocks.datamodel.Company;
import com.stocks.datamodel.User;

@Transactional
@Repository(value ="companyDAO")
public class CompanyDaoImpl implements CompanyDao {
	@Autowired
	SessionFactory sessionFactory ;

	@Override
	public boolean saveCompany(Company company) {
		try {
			sessionFactory.getCurrentSession().save(company);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateCompany(Company company) {
		try {
			sessionFactory.getCurrentSession().update(company);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteCompany(Company company) {
		try {
			sessionFactory.getCurrentSession().delete(company);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Company getCompanyById(int id) {
		try {
			return sessionFactory.getCurrentSession().get(Company.class, id);
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Company> getAllCompany() {
		try {
			List<Company> company = sessionFactory.getCurrentSession().createQuery("from Company").list();
			return company;
		} catch (HibernateException e) { 
			e.printStackTrace();
			return null;
		}
	}

}
