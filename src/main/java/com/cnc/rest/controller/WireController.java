package com.cnc.rest.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cnc.domain.Wire;
import com.cnc.service.WireService;

@RestController
@RequestMapping("wire")
public class WireController {
	@Inject
	private WireService wireService;

	@RequestMapping(method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public Wire addWire(@RequestBody Wire wire) {
		return wireService.saveWire(wire);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public Wire getWireById(@PathVariable("id") int id) {
		return wireService.getWireById(id);
	}

	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public List<Wire> getAllWires() {
		return wireService.getAllWires();
	}
}
