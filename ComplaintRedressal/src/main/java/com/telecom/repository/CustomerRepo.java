package com.telecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telecom.bean.Customer;

@Repository
public interface CustomerRepo extends  JpaRepository<Customer, Integer>{

}
