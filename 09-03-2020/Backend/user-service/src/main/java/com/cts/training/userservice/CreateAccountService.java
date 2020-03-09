package com.cts.training.userservice;

import java.util.List;


public interface CreateAccountService {

	public String  addUser(Users pd);
	public void deleteUser(int id);
	public String updateUser(Users pd);
	public Users getUserById(int id);

	public List<Users> getAllUsers();
	
}
