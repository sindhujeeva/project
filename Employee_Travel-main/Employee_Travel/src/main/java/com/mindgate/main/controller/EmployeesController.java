package com.mindgate.main.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.main.domain.Employees;
import com.mindgate.main.service.EmployeesServiceInterface;

@RestController
public class EmployeesController {
	
	@Autowired
	EmployeesServiceInterface employeesServiceInterface;
	
	// GET ALL
			// http://localhost:8081/allemployees
	
			@RequestMapping(value = "allemployees", method = RequestMethod.GET)
			public List<Employees> getAllEmployees() {
				List<Employees> list = employeesServiceInterface.getAllEmployees();
				return list;
			}
			
	// GET BY ID
			// http://localhost:8081/allemployees/{employeeId}
				
				@RequestMapping(value="allemployees/{employeeId}")
				public Employees getByEmployeeId(@PathVariable int employeeId) {
					return employeesServiceInterface.getEmployeeByEmployeeId(employeeId);
				}
				
	// DELETE BY ID
			// http://localhost:8081/deleterequest/{employeeId}
				
				@RequestMapping(value = "eleterequest/{employeeId}", method = RequestMethod.DELETE)
				public boolean deleteEmployeeById(@PathVariable int employeeId) {
					return employeesServiceInterface.deleteEmployeeByEmployeeId(employeeId);
				}
				
	
				
	
				
	
}
