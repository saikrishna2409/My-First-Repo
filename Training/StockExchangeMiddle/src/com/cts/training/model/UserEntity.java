package com.cts.training.model;
import java.io.Serializable;
public class UserEntity implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = -571421626497450456L;
	private int id;
	private String username;
	private String password;
	private String email;
	private long phone;
	private boolean isenable;
	public UserEntity() {
	}
	public UserEntity(int id, String username, String password, String email, long phone, boolean isenable) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.isenable = isenable;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	public boolean isIsenable() {
		return isenable;
	}
	public void setIsenable(boolean isenable) {
		this.isenable = isenable;
	}
	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", phone=" + phone + ", isenable=" + isenable + "]";
	}
}





