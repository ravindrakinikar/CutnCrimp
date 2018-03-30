package com.cnc.rest.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cnc.domain.Machine;
import com.cnc.service.MachineService;

@RestController
@RequestMapping("machine")
public class MachineController {

	@Inject
	private MachineService machineService;
	
	
	@RequestMapping(method=RequestMethod.GET, produces="application/json")
	@ResponseBody
	public List<Machine> getAllMachines()
	{
		return machineService.getAllMachines();
	}
	
}
