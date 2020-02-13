package com.stocks.datamodel;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name= "StockExchange")
@Component
public class StockExchange implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6550193508284990382L;
	@Id
	@GeneratedValue
	@Column(name="stock_id")
	private int id;
	@Column(name="stock_name")
	private String name;
	@Column(name="stock_address")
	private String address;
	@Column(name="stock_remarks")
	private String remarks;
	public StockExchange() {}
	public StockExchange(int id, String name, String address, String remarks) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.remarks = remarks;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "StockExchange [id=" + id + ", name=" + name + ", address=" + address + ", remarks=" + remarks + "]";
	}
	
	

}
