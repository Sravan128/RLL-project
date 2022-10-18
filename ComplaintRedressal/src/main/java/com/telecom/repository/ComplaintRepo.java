package com.telecom.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.telecom.bean.Complaint;

@Repository
public interface ComplaintRepo  extends JpaRepository<Complaint, Integer> {

	@Query("select c From Complaint c where c.engineerId = :engineerId")
	public List<Complaint> assignedTickets(@Param("engineerId") int engineerId);
	
	@Query("select c FROM Complaint c where  c.feedback IS NOT NULL AND c.engineerId = :engineerId")
	public List<Complaint>  viewFeedbackTickets(@Param("engineerId") int engineerId);

	
}
