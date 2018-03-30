package com.cnc.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.cnc.domain.LeadFactory;
import com.cnc.repository.LeadFactoryRepository;

@Service
public class LeadFactoryService {

	@Inject
	private LeadFactoryRepository leadFactoryRepository;	
	

	public List<LeadFactory> getAllLeadFactory() {
		return leadFactoryRepository.findAll();
	}
		
	public LeadFactory addLeadFactory(LeadFactory leadFactory){
		return leadFactoryRepository.saveAndFlush(leadFactory);
	}

	public List<LeadFactory> getAllLeadFactoryByIdAndStatus(int machineId, String status) {
		return leadFactoryRepository.findAllLeadFactoryByMachineNo(machineId,status);
	}

	public List<LeadFactory> getAllLeadFactoryByStatus(String status) {
		
		return leadFactoryRepository.findAllLeadFactoryByStatus(status);
	}

	public void updateStatus(int id, String status) {

		leadFactoryRepository.updateStatus(id,status);
	}

	
}