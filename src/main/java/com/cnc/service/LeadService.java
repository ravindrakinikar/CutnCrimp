package com.cnc.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.cnc.domain.Lead;
import com.cnc.repository.LeadRepository;
import com.cnc.repository.ModelRepository;

@Service
public class LeadService {

	@Inject
	private LeadRepository leadRepository;

	@Inject
	private ModelRepository modelRepository;

	public Lead saveLead(int modelId, Lead lead) {
		lead.setModel(modelRepository.findOne(modelId));
		return leadRepository.save(lead);
	}

	public Lead getLeadById(int id) {

		return leadRepository.findOne(id);
	}

	public List<Lead> getAllLeads(int modelId) {

		return leadRepository.findByModelId(modelId);
	}

}
