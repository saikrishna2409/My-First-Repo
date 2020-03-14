
package com.cts.training.stockexchangeservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "stocks")
@XmlRootElement(name = "stocklist")
public class StockExchange {
	@Id
	@GeneratedValue
	private int id;
	private String stockname;
	private String remarks;
	public StockExchange() {}
	public StockExchange(int id, String stockname, String remarks) {
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
	
}
