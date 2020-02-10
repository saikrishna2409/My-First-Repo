package com.stocks.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.stocks.dao.UserDao;
import com.stocks.datamodel.User;

public class UserUnitTest {

	private static AnnotationConfigApplicationContext context;
	private static UserDao userDAO;
	private static User user;

	@BeforeClass
	public static void init() {

		context = new AnnotationConfigApplicationContext();
		context.scan("com.stocks");
		context.refresh();
		user = (User) context.getBean("user");
		userDAO = (UserDao) context.getBean("userDAO");

	}

//	@Test
//	public void testGetAllUsers() {
//		List<User> users = userDAO.getAllUsers();
//		assertEquals(4, users.size());
//	}
//
//	@Test
//	public void test_update_user_success() {
//		User u = userDAO.getUserById(676);
//		u.setEnabled(false);
//		assertEquals(true, userDAO.updateUser(u));
//	}

//	@Test
//	public void testDeleteUser() {
//		User u = userDAO.getUserById(676);
//		assertEquals(true, userDAO.deleteUser(u));
//	}

//	@Test
//	public void test_user_ById() {
//		User u = userDAO.getUserById(676);
//		assertEquals(676, u.getId());
//
//	}

//	@Test(expected = NullPointerException.class)
//	public void test_user_By_Fail() {
//		User u = userDAO.getUserById(103);
//		assertEquals(true, u.getId());
//	}

//	@Test
//	public void test_user_login() {
//		assertEquals(true, userDAO.isValidUser("nwkh", "kldukah"));
//	}

}
