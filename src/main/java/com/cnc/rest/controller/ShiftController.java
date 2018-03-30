package com.cnc.rest.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cnc.domain.Shift;
import com.cnc.service.ShiftService;

@RestController
@RequestMapping("shifts")
public class ShiftController {

	@Inject
	private ShiftService shiftService;

	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	List<Shift> getAllShifts() {
		return shiftService.getAllShifts();
	}
}
