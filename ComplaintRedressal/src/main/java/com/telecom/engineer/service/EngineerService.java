package com.telecom.engineer.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telecom.engineer.bean.Complaint;
import com.telecom.engineer.repository.ComplaintREpo;
import com.telecom.engineer.repository.EngineerRepo;

@Service
public class EngineerService {
	
//	@Autowired
//	EngineerRepo  engineerRepo;
	@Autowired
	ComplaintREpo complaintREpo;
	
	public List<Integer>  assignedTickets(int eid){
		
		return complaintREpo.assignedTickets(eid);
	}
	
	
	public String updateStatus(Complaint complaint) {
		Optional<Complaint>  com=complaintREpo.findById(complaint.getTid());
		if(com.isPresent()) {
			Complaint c=com.get();
		    c.setStatus(complaint.getStatus());
		   complaintREpo.saveAndFlush(c);
			return "Status Updated Successfully";
		}
		else {
			return "No record found";
		}
	}
	
	public String  ViewTicket(int tid) {
		Optional<Complaint>  com=complaintREpo.findById(tid);
		if(com.isPresent()) {
			Complaint c=com.get();
			return c.toString();
		}
		
		else {
			return "Complaint Not Found";
		}
	}

}
