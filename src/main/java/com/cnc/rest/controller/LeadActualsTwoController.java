package com.cnc.rest.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cnc.domain.LeadActualsTwo;
import com.cnc.service.LeadActualsTwoService;

@RestController
@RequestMapping(value = "/leadactualstwo")
public class LeadActualsTwoController {

	@Inject
	LeadActualsTwoService leadActualsTwoService;

	@RequestMapping(produces = "application/json", method = RequestMethod.POST)
	@ResponseBody
	public LeadActualsTwo saveLeadActualsTwo(@RequestBody LeadActualsTwo leadActualsTwo) {
		return leadActualsTwoService.saveLeadActualsTwo(leadActualsTwo);
	}

	@RequestMapping(produces = "application/json", method = RequestMethod.GET)
	@ResponseBody
	public List<LeadActualsTwo> getAllLeadActualsTwo() {
		return leadActualsTwoService.getAllLeadActualsTwo();
	}

}
