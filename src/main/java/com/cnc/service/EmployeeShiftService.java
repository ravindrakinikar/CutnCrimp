package com.cnc.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.cnc.domain.EmployeeShift;
import com.cnc.repository.EmployeeShiftRepository;

@Service
public class EmployeeShiftService {

	@Inject
	private EmployeeShiftRepository employeeShiftRepository;

	public void saveEmployeeShift(EmployeeShift employeeShift) {
		employeeShiftRepository.save(employeeShift);
	}

	public List<EmployeeShift> getAllEmployeeShift() {
		return employeeShiftRepository.findAll();

	}
}
