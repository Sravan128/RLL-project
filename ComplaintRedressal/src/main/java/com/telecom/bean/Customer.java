package com.telecom.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
    private int customerId;
    private String customerName;
    private int mobileno;
    @Column(unique = true)
    private String email;
    private String password;
    private String address;
    private int pincode;
	public Customer() {
		super();
		
	}
	public Customer(int customerId, String customerName, int mobileno, String email, String password, String address,
			int pincode) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.mobileno = mobileno;
		this.email = email;
		this.password = password;
		this.address = address;
		this.pincode = pincode;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getMobileno() {
		return mobileno;
	}
	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", mobileno=" + mobileno
				+ ", email=" + email + ", password=" + password + ", address=" + address + ", pincode=" + pincode + "]";
	}
    
    
    
    
}
