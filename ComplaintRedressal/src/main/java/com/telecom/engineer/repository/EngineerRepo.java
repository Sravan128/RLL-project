package com.telecom.engineer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telecom.engineer.bean.Engineer;

@Repository
public interface EngineerRepo  extends JpaRepository<Engineer,Integer>{

	
}
