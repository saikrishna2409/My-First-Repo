package com.cts.training.controller;


import java.util.List;

import org.hibernate.SessionFactory;

import com.cts.training.dao.UserDAO;
import com.cts.training.dao.impl.UserDAOImpl;
import com.cts.training.hibernate.HibernateUtil;
import com.cts.training.model.User;

public class UserController {

	public static void main(String[] args) {

		User user = new User(108, "saikrishna", "123456", "sai@cts.com", 56757567L, true);

		UserDAO userDAO = new UserDAOImpl();

		boolean status = userDAO.saveUser(user);
		if (status) {
			System.out.println("user Saved Successfully");
		} else {
			System.out.println("Try Again");
		}
		User user1 =userDAO.getUserById(105);
		boolean status2 =userDAO.daleteUser(user1);
		if(status2)
		{
			System.out.println("user deleted successfully");
		}
		else
		{
			System.out.println("Try Again");
		}
		User getUser=userDAO.getUserById(1010);
		getUser.setEnabled(true);
		getUser.setPassword("66568767566");
		userDAO.updateUser(getUser);
		
		List<User>l1=userDAO.getAllUsers();
	l1.forEach(System.out::println);

	}


}
