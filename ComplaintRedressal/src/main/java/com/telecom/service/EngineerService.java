package com.telecom.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.telecom.bean.Complaint;
import com.telecom.repository.ComplaintRepo;
import com.telecom.repository.EngineerRepo;

@Service
public class EngineerService {

	
	@Autowired
	ComplaintRepo complaintRepo;
	
	@Autowired
	EngineerRepo engineerRepo;
	
public List<Complaint>  assignedTickets(int eid){
		
		return complaintRepo.assignedTickets(eid);
	}
	
	
	public String updateStatus(Complaint complaint) {
		Optional<Complaint>  com=complaintRepo.findById(complaint.getTicketId());
		
			Complaint c=com.get();
		    c.setStatus(complaint.getStatus());
		   complaintRepo.saveAndFlush(c);
			return "Status Updated Successfully";
	}
	
	public Complaint  ViewTicket(int tid) {
		Optional<Complaint>  com=complaintRepo.findById(tid);
			Complaint c=com.get();
			return c;
	}
	
	public List<Complaint>  viewFeedbackTickets(int engineerId){
	      return complaintRepo.viewFeedbackTickets(engineerId);
	}
}
