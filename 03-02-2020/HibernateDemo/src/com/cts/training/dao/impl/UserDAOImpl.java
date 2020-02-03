package com.cts.training.dao.impl;

import java.util.List;



import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cts.training.dao.UserDAO;
import com.cts.training.hibernate.HibernateUtil;
import com.cts.training.model.User;
import com.sun.xml.bind.annotation.OverrideAnnotationOf;

public class UserDAOImpl implements UserDAO {

	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	@Override
	public boolean saveUser(User user) {
		try {
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.save(user);
			tx.commit();
			session.close();
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateUser(User user) {
		try {
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.update(user);
			tx.commit();
			session.close();
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean daleteUser(User user) {
		try {
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.delete(user);
			tx.commit();
			session.close();
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public User getUserById(int id) {
		try {
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			User user = session.get(User.class, id);

			tx.commit();
			session.close();
			return user;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<User> getAllUsers() {
		try {
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			List<User> users = session.createQuery("from User").list();
			tx.commit();
			session.close();
			return users;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public boolean isValidUser(String username,String password)
	{
		try {
			Session session =sessionFactory.openSession();
			Transaction tx =session.beginTransaction();
			Query query =session.createQuery("from User where username=:username and password=:password");
					query.setString("username",username);
					query.setString("password",password);
					
					User user = (User) query.uniqueResult();
					if(user.getPassword()!=null)
					{
						tx.commit();
						session.close();
						return true;
					}
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
}
	
