package com.stocks.dao.impl;

import java.util.List;

//import java.util.List;


import javax.transaction.Transaction;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.stocks.dao.UserDao;
import com.stocks.datamodel.User;


@Transactional
@Repository(value = "userDAO")
public class UserDaoImpl implements UserDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public boolean saveOrUpdateUser(User user) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(user);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

//	@Override
//	public boolean updateUser(User user) {
//		try {
//			sessionFactory.getCurrentSession().update(user);
//			return true;
//		} catch (HibernateException e) {
//			e.printStackTrace();
//			return false;
//		}
//	}

	@Override
	public boolean deleteUser(User user) {
		try {
			sessionFactory.getCurrentSession().delete(user);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public User getUserById(int id) {
		try {
			return sessionFactory.getCurrentSession().get(User.class,id);
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<User> getAllUsers() {
		try {
			List<User> users = sessionFactory.getCurrentSession().createQuery("from User").list();
			return users;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean isValidUser(String username, String password) {
		try {
			Query query = sessionFactory.getCurrentSession().createQuery("from User where username=:username and password=:password"); 
			query.setString("username",username);
			query.setString("password",password);
			
			List<User> list= query.list();
			if(list.size()>0) {
				return true;
			}
			else {
				return false;
			}
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
			
		}
		
	}


}
