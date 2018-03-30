package com.cnc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.cnc.domain.LeadFactory;

public interface LeadFactoryRepository extends JpaRepository<LeadFactory, Integer> {

	@Query("select m from LeadFactory m where m.machineNo=(:id) and m.status=(:status)" )
	public List<LeadFactory> findAllLeadFactoryByMachineNo(@Param("id") int machineId, @Param("status") String status);

	@Query("select m from LeadFactory m where m.status=(:status)")
	public List<LeadFactory> findAllLeadFactoryByStatus(@Param("status") String status);

	@Query("UPDATE LeadFactory m SET m.status=(:status) WHERE m.lfNo=(:id)")
	@Modifying
	@Transactional
	public void updateStatus(@Param("id") int id,@Param("status")  String status);
	
	
	
}
