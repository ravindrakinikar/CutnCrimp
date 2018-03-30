package com.cnc.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.cnc.domain.LeadActualsOne;
import com.cnc.repository.LeadActualsOneRepository;

@Service
public class LeadActualsOneService {

	@Inject
	LeadActualsOneRepository leadActualsOneRepository;
	
	public LeadActualsOne saveLeadActualsOne(LeadActualsOne leadActualsOne) {
		return leadActualsOneRepository.save(leadActualsOne);
	}

	public List<LeadActualsOne> getAllLeadActualsOne() {
		return leadActualsOneRepository.findAll();
	}
}
