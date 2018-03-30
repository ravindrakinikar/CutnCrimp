package com.cnc.rest.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cnc.domain.Lead;
import com.cnc.domain.View;
import com.cnc.service.LeadService;
import com.fasterxml.jackson.annotation.JsonView;

@RestController

public class LeadController {

	@Inject
	private LeadService leadService;

	@RequestMapping(value="model/{model_id}/lead",method = RequestMethod.POST, produces = "application/json")
	@JsonView(View.Lead.class)
	@ResponseBody
	public Lead addLead(@PathVariable("model_id") int modelId,@RequestBody Lead lead) {
		return leadService.saveLead(modelId,lead);
	}

	@RequestMapping(value = "lead/{id}", method = RequestMethod.GET, produces = "application/json")
	@JsonView(View.Lead.class)
	@ResponseBody
	public Lead getLeadById(@PathVariable("id") int id) {
		return leadService.getLeadById(id);
	}

	@RequestMapping(value="model/{model_id}/lead",method=RequestMethod.GET, produces="application/json")
	@JsonView(View.Lead.class)
	@ResponseBody
	public List<Lead> getAllLeads(@PathVariable("model_id") int modelId) {
		return leadService.getAllLeads(modelId);
	}

}
