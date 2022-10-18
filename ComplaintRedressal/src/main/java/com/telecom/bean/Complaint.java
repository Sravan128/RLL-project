package com.telecom.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Complaint {
	@Id
	private int ticketId;
	private int customerId;
	private int pincode;
	private String reason;
	private String status;
	private int engineerId;
	private String feedback;
	
	
	public Complaint() {
		super();
		
	}


	public Complaint(int ticketId, int customerId, int pincode, String reason, String status, int engineerId,
			String feedback) {
		super();
		this.ticketId = ticketId;
		this.customerId = customerId;
		this.pincode = pincode;
		this.reason = reason;
		this.status = status;
		this.engineerId = engineerId;
		this.feedback = feedback;
	}


	public int getTicketId() {
		return ticketId;
	}


	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public int getPincode() {
		return pincode;
	}


	public void setPincode(int pincode) {
		this.pincode = pincode;
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


	public int getEngineerId() {
		return engineerId;
	}


	public void setEngineerId(int engineerId) {
		this.engineerId = engineerId;
	}


	public String getFeedback() {
		return feedback;
	}


	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}


	@Override
	public String toString() {
		return "Complaint [ticketId=" + ticketId + ", customerId=" + customerId + ", pincode=" + pincode + ", reason="
				+ reason + ", status=" + status + ", engineerId=" + engineerId + ", feedback=" + feedback + "]";
	}
	
	

}
