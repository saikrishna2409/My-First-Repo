package com.cts.training.middle.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.cts.training.middle.dao.TrialUserDao;
import com.cts.training.middle.trialmodels.TrialUser;

public class TrialUserDaoImpl implements TrialUserDao{

private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
	}
	public boolean saveUser(TrialUser user) {

		 String query = "insert into TrialUser values('" +
		 user.getId() + "','" +
		 user.getName() + "','"  +
		 user.getEmail() + "','" + user.getPassword() + "')";
		try {
		jdbcTemplate.update(query); return true; } catch
		(DataAccessException e) {
		 e.printStackTrace();
		return false;
		}
	}

	public boolean updateUser(TrialUser user) {
		// TODO Auto-generated method stub
		String query = "update trialuser set name=?,email=?,password=? where id =?";
				try {
				jdbcTemplate.update(query, user.getName(),
				user.getEmail(),user.getPassword(), user.getId());
				return true;
				}
				catch (DataAccessException e) {
				e.printStackTrace();
				return false;
				}
	}

	public boolean deleteUser(TrialUser user) {
		String query = "delete from TrialUser where id =?";
		try {
		jdbcTemplate.update(query, user.getId());
		return true;
		} catch (DataAccessException e) {
		e.printStackTrace();
		return false;
		}
	}

	public TrialUser getUserById(int id) {
		String query = "select * from trialuser where id = ?";
		RowMapper<TrialUser> rowMapper = new
		BeanPropertyRowMapper<TrialUser>(TrialUser.class);
		return jdbcTemplate.queryForObject(query, rowMapper, id);
		
	}

	public List<TrialUser> getAllUsers() {
		// TODO Auto-generated method stub
		
		// 1. ResultSetExecutor Example
		return jdbcTemplate.query("select * from trialuser", new ResultSetExtractor<List<TrialUser>>()
		{
		public List<TrialUser> extractData(ResultSet rs) throws SQLException, DataAccessException {
		List<TrialUser> list = new ArrayList<TrialUser>();
		while (rs.next()) {
		TrialUser trialuser = new TrialUser();
		trialuser.setId(rs.getInt(1));
		trialuser.setName(rs.getString(2));
		trialuser.setEmail(rs.getString(3));
		trialuser.setPassword(rs.getString(4));
		
		list.add(trialuser);
		}
		return list;
		}
		});

	}

	public boolean isValidUser(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

}
