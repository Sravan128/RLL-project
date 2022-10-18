package com.telecom.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Manager {

	@Id
	private int managerId;
	private String managerName;
	@Column(unique = true)
	private String mail;
	private String password;
	@Column(unique = true)
	private int pincode;
	public Manager() {
		super();
		
	}
	public Manager(int managerId, String managerName, String mail, String password, int pincode) {
		super();
		this.managerId = managerId;
		this.managerName = managerName;
		this.mail = mail;
		this.password = password;
		this.pincode = pincode;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
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
		return "Manager [managerId=" + managerId + ", managerName=" + managerName + ", mail=" + mail + ", password="
				+ password + ", pincode=" + pincode + "]";
	}
	
}
