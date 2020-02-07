package com.cts.training.model;

import java.io.Serializable;

public class CustomerEntity implements Serializable{
	
	
	private static final long serialVersionUID = 6352096386537355759L;
	
	private int id;
	private String name;
	private long phone;
	private AccountEntity accdetails;
	

	
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
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	public AccountEntity getAccdetails() {
		return accdetails;
	}
	public void setAccdetails(AccountEntity accdetails) {
		this.accdetails = accdetails;
	}
	@Override
	public String toString() {
		return "CustomerEntity [id=" + id + ", name=" + name + ", phone=" + phone + ", accdetails=" + accdetails + "]";
	}
	
	

}
