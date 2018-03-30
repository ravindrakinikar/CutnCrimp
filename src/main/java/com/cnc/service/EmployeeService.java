/**
 * 
 */
package com.cnc.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.cnc.domain.Employee;
import com.cnc.repository.EmployeeRepository;

/**
 * @author Mahesh
 *
 */
@Service
public class EmployeeService {
	@Inject
	private EmployeeRepository employeRepository;

	public Employee findUserById(int empId, String password) {
		Employee employee = employeRepository.findOne(empId);
		if (password.equals(employee.getPassword())) {
			return employee;
		} else {
			return null;
		}
	}
}
