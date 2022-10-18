package com.telecom.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.telecom.bean.Engineer;

@Repository
public interface EngineerRepo extends JpaRepository<Engineer, Integer>{
	
	@Query("select e from Engineer e where e.email= :email")
	public Optional<Engineer> findByMail(@Param("email") String email);
	
}
