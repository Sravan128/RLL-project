package com.telecom.engineer.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Complaint {
	@Id
	private int tid;
	private int cid;
	private String reason;
	private String status;
	private int pincode;
	private int eid;
	public Complaint() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Complaint(int tid, int cid, String reason, String status, int pincode, int eid) {
		super();
		this.tid = tid;
		this.cid = cid;
		this.reason = reason;
		this.status = status;
		this.pincode = pincode;
		this.eid = eid;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	@Override
	public String toString() {
		return "Complaint [tid=" + tid + ", cid=" + cid + ", reason=" + reason + ", status=" + status + ", pincode="
				+ pincode + ", eid=" + eid + "]";
	}
	
	

}
