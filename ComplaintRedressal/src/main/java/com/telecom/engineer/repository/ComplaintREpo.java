package com.telecom.engineer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.telecom.engineer.bean.Complaint;

@Repository
public interface ComplaintREpo extends JpaRepository<Complaint, Integer>{
	
	@Query("select c.tid FROM Complaint c where c.eid= :eid")
	public List<Integer> assignedTickets(@Param("eid") int eid);

}
