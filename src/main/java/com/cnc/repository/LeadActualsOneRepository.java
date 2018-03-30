package com.cnc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cnc.domain.LeadActualsOne;

@Repository
public interface LeadActualsOneRepository extends JpaRepository<LeadActualsOne, Integer>{

}
