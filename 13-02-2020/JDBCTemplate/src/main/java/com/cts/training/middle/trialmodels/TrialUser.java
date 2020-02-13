package com.cts.training.middle.trialmodels;

import java.io.Serializable;

import org.springframework.jdbc.core.JdbcTemplate;

public class TrialUser implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1287312750818073585L;
	private int id;
	private String name;
	private String email;
	private String password;
	public TrialUser() {}
	public TrialUser(int id, String name, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "TrialUser [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + "]";
	}
	

}
