package com.cnc.service;

import java.util.List;
import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.cnc.domain.Machine;
import com.cnc.repository.MachineRepository;
@Service
public class MachineService {

	@Inject
	private MachineRepository machineRepository;

	public Machine saveMachine(Machine machine) {
		return machineRepository.save(machine);
	}

	public Machine getMachineById(int id) {
		return machineRepository.getOne(id);
	}

	public List<Machine> getAllMachines() {
		return machineRepository.findAll();
	}

}
