package com.cnc.rest.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cnc.domain.EmployeeShift;
import com.cnc.service.EmployeeShiftService;

@RestController
@RequestMapping(value="/employeeshift")
public class EmployeeShiftController {

	@Inject
	private EmployeeShiftService employeeShiftService;

	@RequestMapping(method = RequestMethod.POST, consumes = "application/json")	
	public void saveEmployeeShift(@RequestBody EmployeeShift employeeShift) {
		employeeShiftService.saveEmployeeShift(employeeShift);
	}
	
	@RequestMapping(method = RequestMethod.GET, produces = "application/json")	
	public List<EmployeeShift> getAllEmployeeShift() {
		return employeeShiftService.getAllEmployeeShift();
	}

}
