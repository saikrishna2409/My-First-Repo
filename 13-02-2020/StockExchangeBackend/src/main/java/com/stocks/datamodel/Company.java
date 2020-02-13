package com.stocks.datamodel;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name ="Company")
public class Company implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 593810099961445578L;
	@Id
	@GeneratedValue
	private int id;
	private String companyName;
	private String city;
	private String state;
	private long pincode;
	private double turnover;
	private String aboutCompany;
	private String stockExchange;
	private String sector;
	public Company() {
		
	}
	public Company(int id, String companyName, String city, String state, long pincode, double turnover,
			String aboutCompany, String stockExchange, String sector) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.turnover = turnover;
		this.aboutCompany = aboutCompany;
		this.stockExchange = stockExchange;
		this.sector = sector;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) { 
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public double getTurnover() {
		return turnover;
	}
	public void setTurnover(double turnover) {
		this.turnover = turnover;
	}
	public String getAboutCompany() { 
		return aboutCompany;
	}
	public void setAboutCompany(String aboutCompany) {
		this.aboutCompany = aboutCompany;
	}
	public String getStockExchange() {
		return stockExchange;
	}
	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Company [id=" + id + ", companyName=" + companyName + ", city=" + city + ", state=" + state
				+ ", pincode=" + pincode + ", turnover=" + turnover + ", aboutCompany=" + aboutCompany
				+ ", stockExchange=" + stockExchange + ", sector=" + sector + "]";
	}
	
	
	
	

}
