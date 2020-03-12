package com.cts.training.userservice;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "users")
@XmlRootElement(name = "userlist")
public class Users {
	
	@Id
	@GeneratedValue
	private int id;
	private String username;
	private String password;
	private String rpassword;
	private String email;
	private long mobile;
	private String usertype="ROLE_USER";
	@Transient
	private String regStatus;
	private boolean active=false;
	private boolean isAdmin=false;
	public Users() {}
	public Users(int id, String username, String password, String rpassword, String email, long mobile, String usertype,
			String regStatus, boolean active, boolean isAdmin) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.rpassword = rpassword;
		this.email = email;
		this.mobile = mobile;
		this.usertype = usertype;
		this.regStatus = regStatus;
		this.active = active;
		this.isAdmin = isAdmin;
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
	public String getRpassword() {
		return rpassword;
	}
	public void setRpassword(String rpassword) {
		this.rpassword = rpassword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	public String getRegStatus() {
		return regStatus;
	}
	public void setRegStatus(String regStatus) {
		this.regStatus = regStatus;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public boolean isAdmin() {
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", username=" + username + ", password=" + password + ", rpassword=" + rpassword
				+ ", email=" + email + ", mobile=" + mobile + ", usertype=" + usertype + ", regStatus=" + regStatus
				+ ", active=" + active + ", isAdmin=" + isAdmin + "]";
	}

	

}
