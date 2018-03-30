package com.cnc.rest.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cnc.domain.LeadActualsOne;
import com.cnc.service.LeadActualsOneService;

@RestController
@RequestMapping(value = "/leadactualsone")
public class LeadActualsOneController {

	@Inject
	LeadActualsOneService leadActualsOneService;

	@RequestMapping(produces = "application/json", method = RequestMethod.POST)
	@ResponseBody
	public LeadActualsOne saveLeadActualsOne(@RequestBody LeadActualsOne leadActualsOne) {
		 return leadActualsOneService.saveLeadActualsOne(leadActualsOne);
	}

	@RequestMapping(produces = "application/json", method = RequestMethod.GET)
	@ResponseBody
	public List<LeadActualsOne> getAllLeadActualsOne() {
		return leadActualsOneService.getAllLeadActualsOne();
	}
}
