package com.telecom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telecom.repository.ComplaintRepo;
import com.telecom.repository.CustomerRepo;

@Service
public class CustomerService {

	
	@Autowired
	CustomerRepo customerRepo;
	
	@Autowired
	ComplaintRepo complaintRepo;
	
}
