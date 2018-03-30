package com.cnc.rest.controller;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.QueryParam;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cnc.domain.LeadFactory;
import com.cnc.service.LeadFactoryService;

@RestController
@RequestMapping("/leadfactory")
public class LeadFactoryController {

	@Inject
	private LeadFactoryService leadFactoryService;

	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public List<LeadFactory> getAllLeadFactory() {
		return leadFactoryService.getAllLeadFactory();
	}
	
	@RequestMapping(method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public LeadFactory addLeadFactory(@RequestBody LeadFactory leadFactory){
		return leadFactoryService.addLeadFactory(leadFactory);
	}
	
	
	@RequestMapping(value="/{machine_no}", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public List<LeadFactory> getAllLeadFactoryByIdAndStatus(@PathVariable("machine_no") int machineNo) {
		String status="CREATED";
		return leadFactoryService.getAllLeadFactoryByIdAndStatus(machineNo,status);
	}
	
	@RequestMapping(value="/status/{status}",method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public List<LeadFactory> getAllLeadFactoryByStatus(@PathVariable("status") String status) {
		return leadFactoryService.getAllLeadFactoryByStatus(status);
	}
	
	@RequestMapping(value="/status/{id}",method = RequestMethod.PUT, produces = "application/json")
	@ResponseBody
	public void updateStatus(@PathVariable("id") int id,@QueryParam("status") String status){
		leadFactoryService.updateStatus(id,status);
	}
}
