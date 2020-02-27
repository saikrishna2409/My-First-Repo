package com.example.demo.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
@Entity
@Table(name = "ipo")
@XmlRootElement(name = "ipolist")
public class Ipos {
	@Id
	@GeneratedValue
	private int id;
	private String company;
	private String stockexchange;
	private long priceshare;
	private long noofshares;
	private String address;
	private String city;
	private String state;
	private long pincode;
	private String date;
	public Ipos() {}
	public Ipos(int id, String company, String stockexchange, long priceshare, long noofshares, String address,
			String city, long pincode, String date,String state) {
		super();
		this.id = id;
		this.company = company;
		this.stockexchange = stockexchange;
		this.priceshare = priceshare;
		this.noofshares = noofshares;
		this.address = address;
		this.city = city;
		this.pincode = pincode;
		this.state=state;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getStockexchange() {
		return stockexchange;
	}
	public void setStockexchange(String stockexchange) {
		this.stockexchange = stockexchange;
	}
	public long getPriceshare() {
		return priceshare;
	}
	public void setPriceshare(long priceshare) {
		this.priceshare = priceshare;
	}
	public long getNoofshares() {
		return noofshares;
	}
	public void setNoofshares(long noofshares) {
		this.noofshares = noofshares;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
	
}
