package com.example.demo.dto;

public class IpoDto {
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
	public IpoDto(int id, String company, String stockexchange, long priceshare, long noofshares, String address,
			String city, String state, long pincode, String date) {
		super();
		this.id = id;
		this.company = company;
		this.stockexchange = stockexchange;
		this.priceshare = priceshare;
		this.noofshares = noofshares;
		this.address = address;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.date = date;
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "IpoDto [id=" + id + ", company=" + company + ", stockexchange=" + stockexchange + ", priceshare="
				+ priceshare + ", noofshares=" + noofshares + ", address=" + address + ", city=" + city + ", state="
				+ state + ", pincode=" + pincode + ", date=" + date + "]";
	}
	
}
