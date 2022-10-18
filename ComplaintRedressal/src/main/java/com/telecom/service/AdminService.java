package com.telecom.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telecom.bean.Customer;
import com.telecom.bean.Engineer;
import com.telecom.bean.Manager;
import com.telecom.repository.CustomerRepo;
import com.telecom.repository.EngineerRepo;
import com.telecom.repository.ManagerRepo;

@Service
public class AdminService {

	@Autowired
	ManagerRepo managerRepo;
	
	@Autowired
	CustomerRepo  customerRepo;
	
	@Autowired
	EngineerRepo  engineerRepo;
	
	
	public String adminLogin(String email, String password) {
		if(email.equals("admin@gmail.com") && password.equals("1234567")) {
			
			return "login";
		}
		
		else {
			return "invalis credientials";
		}
	}
	
	
	public List<Customer>  viewCustomers(){
		
		List<Customer> customers =customerRepo.findAll();
		
		return customers;
	}
	
public List<Manager>  viewManagers(){
		
		List<Manager> managers =managerRepo.findAll();
		
		return managers;
	}

public List<Engineer>  viewEngineers(){
	
	List<Engineer> engineers=engineerRepo.findAll();
	
	return engineers;
}


    public String  addManager(Manager manager) {
    	Optional<Manager> m=managerRepo.findByMail(manager.getMail());
    	if(m.isPresent())
    	return "Manager Already  Exists";
    	
    	else {
    		managerRepo.save(manager);
    		return "Manager Stored Successfully";
    	}
    	
    }
    
    
    public String deleteManager(int managerId) {
    	Optional<Manager> result  = managerRepo.findById(managerId);
		if(result.isPresent()) {
			Manager m = result.get();
			managerRepo.delete(m);
			return "Manager deleted successfully";
		}else {
			return "Manager not present";
		}
    }
    
    public String  addEngineer(Engineer engineer) {
    	Optional<Engineer> e=engineerRepo.findByMail(engineer.getEmail());
    	if(e.isPresent())
    	return "Engineer Already  Exists";
    	
    	else {
    		engineerRepo.save(engineer);
    		return "Engineer Stored Successfully";
    	}
    	
    }
    
    
    public String deleteEngineer(int engineerId) {
    	Optional<Engineer> result  = engineerRepo.findById(engineerId);
		if(result.isPresent()) {
			Engineer e = result.get();
			engineerRepo.delete(e);
			return "Engineer deleted successfully";
		}else {
			return "Engineer not present";
		}
    }
	
	
}
