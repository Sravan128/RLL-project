package com.telecom.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telecom.bean.Complaint;
import com.telecom.service.EngineerService;

@RestController
@RequestMapping(value="engineer")
public class EngineerController {

	
	@Autowired
	EngineerService  engineerService;
	
	@GetMapping(value="assignedTickets/{eid}", produces = MediaType.APPLICATION_JSON_VALUE )
	public List<Complaint> assignedTickets(@PathVariable("eid") int eid) {
		return engineerService.assignedTickets(eid);
	}
	
	@PatchMapping(value="updateStatus", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String  updateStatus(@RequestBody  Complaint complaint) {
		return engineerService.updateStatus(complaint);
	}
	
	@GetMapping(value="viewTicket/{tid}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Complaint viewTicket(@PathVariable("tid") int tid) {
		return engineerService.ViewTicket(tid);
		
	}
	
	@GetMapping(value="viewFeedback/{eid}", produces = MediaType.APPLICATION_JSON_VALUE )
	public List<Complaint> viewFeedbackTickets(@PathVariable("eid") int eid) {
		return engineerService.viewFeedbackTickets(eid);
	}
	
}
