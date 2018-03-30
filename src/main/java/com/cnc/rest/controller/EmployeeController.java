/**
 * 
 */
package com.cnc.rest.controller;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cnc.domain.Employee;
import com.cnc.service.EmployeeService;

/**
 * @author Mahesh
 *
 */
@RestController
public class EmployeeController {
	@Inject
	private EmployeeService employeService;

	@RequestMapping(value = "/login", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public Employee login(@RequestParam("empId") int empId,@RequestParam("emp_password") String password) {
		return employeService.findUserById(empId,password);
	}
}
