package com.cnc.rest.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cnc.domain.Terminal;
import com.cnc.service.TerminalService;

@RestController
public class TerminalController {

	@Inject
	private TerminalService terminalService;
	
	@RequestMapping(value="/terminal" , method=RequestMethod.GET, produces = "application/json")
	public List<Terminal> getAllTerminals()
	{
		return terminalService.getAllTerminals();
	}
}
