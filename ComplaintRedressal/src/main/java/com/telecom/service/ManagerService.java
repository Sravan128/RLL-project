package com.telecom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telecom.repository.ComplaintRepo;
import com.telecom.repository.EngineerRepo;
import com.telecom.repository.ManagerRepo;

@Service
public class ManagerService {

	@Autowired
	ComplaintRepo complaintRepo;
	@Autowired
	ManagerRepo managerRepo;
	@Autowired
	EngineerRepo engineerRepo;
}
