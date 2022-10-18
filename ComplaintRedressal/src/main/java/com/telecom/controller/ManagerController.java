package com.telecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.telecom.service.ManagerService;

@RestController
public class ManagerController {

	
	@Autowired
	ManagerService managerService;
	
	
}
