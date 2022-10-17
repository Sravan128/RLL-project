package com.telecom.engineer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telecom.engineer.bean.Complaint;
import com.telecom.engineer.service.EngineerService;

@RestController
@RequestMapping(value="engineer")
public class EngineerController {
	
	@Autowired
	EngineerService  engineerservice;
	
	
	@GetMapping(value="assignedTickets/{eid}", produces = MediaType.APPLICATION_JSON_VALUE )
	public List<Integer> assignedTickets(@PathVariable("eid") int eid) {
		return engineerservice.assignedTickets(eid);
	}

	
	@PatchMapping(value="updateStatus", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String  updateStatus(@RequestBody  Complaint complaint) {
		return engineerservice.updateStatus(complaint);
	}
	
	@GetMapping(value="viewStatus/{tid}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String viewTicket(@PathVariable("tid") int tid) {
		return engineerservice.ViewTicket(tid);
	}
	
	
}
