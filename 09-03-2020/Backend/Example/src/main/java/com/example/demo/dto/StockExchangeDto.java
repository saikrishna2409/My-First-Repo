package com.example.demo.dto;

public class StockExchangeDto {
	private int id;
	private String stockname;
	private String remarks;
	public StockExchangeDto(int id, String stockname, String remarks) {
		super();
		this.id = id;
		this.stockname = stockname;
		this.remarks = remarks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStockname() {
		return stockname;
	}
	public void setStockname(String stockname) {
		this.stockname = stockname;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "StockExchangeDto [id=" + id + ", stockname=" + stockname + ", remarks=" + remarks + "]";
	}
	
}
