/**
 * 
 */
package com.cnc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cnc.domain.Employee;

/**
 * @author Mahesh
 *
 */
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
