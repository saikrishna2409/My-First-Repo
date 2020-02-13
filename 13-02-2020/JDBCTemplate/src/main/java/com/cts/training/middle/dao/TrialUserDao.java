package com.cts.training.middle.dao;

import java.util.List;

import com.cts.training.middle.trialmodels.TrialUser;

public interface TrialUserDao {
	

	public boolean saveUser(TrialUser user);
	public boolean updateUser(TrialUser user);
		//public boolean saveOrUpdateUser(User user);

		public boolean deleteUser(TrialUser user);

		public TrialUser getUserById(int id);

		public List<TrialUser> getAllUsers();
		
		public boolean isValidUser(String username, String password);

	}

