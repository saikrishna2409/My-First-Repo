package com.example.demo.models;

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
		this.companyname = companyname;
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
	public String getComapanyname() {
		return companyname;
	}
	public void setComapanyname(String companyname) {
		this.companyname = companyname;
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
	
}
