package com.telecom.engineer.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Engineer {
	
	@Id
	private int eid;
	private String ename;
	private String email;
	private int pincode;
	
	
	public Engineer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Engineer(int eid, String ename, String email, int pincode) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.email = email;
		this.pincode = pincode;
	}


	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String Email() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}


	@Override
	public String toString() {
		return "Engineer [eid=" + eid + ", ename=" + ename + ", email=" + email + ", pincode=" + pincode + "]";
	}
	
	
	

}
