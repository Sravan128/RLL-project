package com.telecom.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Engineer {
	@Id
	private int enginnerId;
	private String engineerName;
	@Column(unique = true)
	private String email;
	private String password;
	private int pincode;
	public Engineer() {
		super();
		
	}
	public Engineer(int enginnerId, String engineerName, String email, String password, int pincode) {
		super();
		this.enginnerId = enginnerId;
		this.engineerName = engineerName;
		this.email = email;
		this.password = password;
		this.pincode = pincode;
	}
	public int getEnginnerId() {
		return enginnerId;
	}
	public void setEnginnerId(int enginnerId) {
		this.enginnerId = enginnerId;
	}
	public String getEngineerName() {
		return engineerName;
	}
	public void setEngineerName(String engineerName) {
		this.engineerName = engineerName;
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
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Engineer [enginnerId=" + enginnerId + ", engineerName=" + engineerName + ", email=" + email
				+ ", password=" + password + ", pincode=" + pincode + "]";
	}
	
	

}
