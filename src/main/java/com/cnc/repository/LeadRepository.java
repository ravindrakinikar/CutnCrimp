package com.cnc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cnc.domain.Lead;

public interface LeadRepository extends JpaRepository<Lead, Integer>{
	
	@Query("select m from Lead m where m.model.id=(:id)")
	List<Lead> findByModelId(@Param("id") int modelId);

}
