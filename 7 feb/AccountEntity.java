package com.cts.training.model;

import java.io.Serializable;

public class AccountEntity implements Serializable {


	private static final long serialVersionUID = 593312969077767061L;
	
	private int id;
	private String accNumber;
	private String acctype;
	private String branch;
	private FundEntity fund;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}
	
	public String getAcctype() {
		return acctype;
	}
	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public FundEntity getFund() {
		return fund;
	}
	public void setFund(FundEntity fund) {
		this.fund = fund;
	}
	@Override
	public String toString() {
		return "AccountEntity [id=" + id + ", accNumber=" + accNumber + ", acctype=" + acctype + ", branch=" + branch
				+ ", fund=" + fund + "]";
	}
	
	
}
