package com.cnc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cnc.domain.LeadActualsTwo;

@Repository
public interface LeadActualsTwoRepository extends JpaRepository<LeadActualsTwo, Integer>{

}
