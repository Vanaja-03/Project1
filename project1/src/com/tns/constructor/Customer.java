package com.tns.constructor;

public class Customer {
	private String customerName;
	private int customerId;
	private String customerCity;
	
	public Customer() {
		System.out.println("default");
	}
	public Customer(String customerName,int customerId,String customerCity) {
	this.customerName=customerName;
	this.customerId=customerId;
	this.customerCity=customerCity;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerid() {
		return customerId;
	}
	public void setCustomerid(int customerid) {
		this.customerId = customerid;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
		
	}
}
