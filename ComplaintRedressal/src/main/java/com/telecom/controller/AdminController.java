package com.telecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.telecom.service.AdminService;

@RestController
public class AdminController {

	
	@Autowired
	AdminService  adminService;
}
