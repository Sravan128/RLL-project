package com.telecom.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.telecom.bean.Manager;

@Repository
public interface ManagerRepo extends JpaRepository<Manager, Integer>{
	
	@Query("select m from Manager m where m.mail= :mail")
	public Optional<Manager> findByMail(@Param("mail") String mail);

}
