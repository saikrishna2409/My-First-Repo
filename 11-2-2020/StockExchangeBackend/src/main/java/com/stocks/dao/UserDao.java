package com.stocks.dao;

import java.util.List;

import com.stocks.datamodel.User;

public interface UserDao {
	

	public boolean saveUser(User user);

	public boolean updateUser(User user);

	public boolean deleteUser(User user);

	public User getUserById(int id);

	public List<User> getAllUsers();
	
	public boolean isValidUser(String username, String password);

}
