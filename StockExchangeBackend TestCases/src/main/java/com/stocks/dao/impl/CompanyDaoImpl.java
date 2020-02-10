package com.stocks.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.stocks.dao.CompanyDao;
import com.stocks.datamodel.Company;
import com.stocks.datamodel.User;
import com.stocks.hibernate.HibernateUtil;


public class CompanyDaoImpl implements CompanyDao {
	
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	@Override
	public boolean saveCompany(Company company) {
		try {
			Session session = sessionFactory.openSession();
			org.hibernate.Transaction tx = session.beginTransaction();
			session.save(company);
			tx.commit();
			session.close();
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateCompany(Company company) {
		try {
			Session session = sessionFactory.openSession();
			org.hibernate.Transaction tx = session.beginTransaction();
			session.update(company);
			tx.commit();
			session.close();
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteCompany(Company company) {
		try {
			Session session = sessionFactory.openSession();
			org.hibernate.Transaction tx = session.beginTransaction();
			session.delete(company);
			tx.commit();
			session.close();
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Company getCompanyById(int id) {
		try {
			Session session = sessionFactory.openSession();
			org.hibernate.Transaction tx = session.beginTransaction();
			Company company = session.get(Company.class, id);

			tx.commit();
			session.close();
			return company;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Company> getAllCompany() {
		try {
			Session session = sessionFactory.openSession();
			org.hibernate.Transaction tx = session.beginTransaction();
			List<Company> company = session.createQuery("from Company").list();
			tx.commit();
			session.close();
			return company;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

}
