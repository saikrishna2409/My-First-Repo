package com.cts.training.companyservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "company")
@XmlRootElement(name = "companylist")
public class Company {
	@Id
	@GeneratedValue
	private int id;
	private String sector;
	private String companyname;
	private String ceo;
	private String bod;
	private String stockList;
	private double turnover;
	public Company() {}
	public Company(int id, String sector, String companyname, String ceo, String bod,String stockList, double turnover) {
		super();
		this.id = id;
		this.sector = sector;
		this.setCompanyname(companyname);
		this.ceo = ceo;
		this.bod = bod;
		this.stockList = stockList;
		this.turnover = turnover;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	public String getBod() {
		return bod;
	}
	public void setBod(String bod) {
		this.bod = bod;
	}
	public String getStockList() {
		return stockList;
	}
	public void setStockList(String stockList) {
		this.stockList = stockList;
	}
	public double getTurnover() {
		return turnover;
	}
	public void setTurnover(double turnover) {
		this.turnover = turnover;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	
}
