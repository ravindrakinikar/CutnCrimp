package com.cnc.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.cnc.domain.LeadActualsTwo;
import com.cnc.repository.LeadActualsTwoRepository;

@Service
public class LeadActualsTwoService {

	@Inject
	LeadActualsTwoRepository leadActualsTwoRepository;

	public LeadActualsTwo saveLeadActualsTwo(LeadActualsTwo leadActualsTwo) {
		return leadActualsTwoRepository.save(leadActualsTwo);
	}

	public List<LeadActualsTwo> getAllLeadActualsTwo() {
		return leadActualsTwoRepository.findAll();
	}
}
