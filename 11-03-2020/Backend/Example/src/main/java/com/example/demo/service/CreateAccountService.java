package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.CreateAccountDto;
import com.example.demo.models.Users;

public interface CreateAccountService {

	public String  addUser(CreateAccountDto pd);
	public void deleteUser(int id);
	public String updateUser(CreateAccountDto pd);
	public Users getUserById(int id);

	public List<Users> getAllUsers();
	
}
