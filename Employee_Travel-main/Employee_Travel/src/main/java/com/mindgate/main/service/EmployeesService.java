package com.mindgate.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindgate.main.domain.Employees;
import com.mindgate.main.repository.EmployeesRepositoryInterface;

@Service
public class EmployeesService implements EmployeesServiceInterface {
	
	@Autowired
	EmployeesRepositoryInterface employeesRepositoryInterface;
	
	@Override
	public boolean addNewEmployee(Employees employees) {
		// TODO Auto-generated method stub
		return employeesRepositoryInterface.addNewEmployee(employees);
	}

	@Override
	public Employees updateEmployee(Employees employees) {
		// TODO Auto-generated method stub
		return employeesRepositoryInterface.updateEmployee(employees);
	}

	@Override
	public boolean deleteEmployeeByEmployeeId(int employeeId) {
		// TODO Auto-generated method stub
		return employeesRepositoryInterface.deleteEmployeeByEmployeeId(employeeId);
	}

	@Override
	public Employees getEmployeeByEmployeeId(int employeeId) {
		// TODO Auto-generated method stub
		return employeesRepositoryInterface.getEmployeeByEmployeeId(employeeId);
	}

	@Override
	public List<Employees> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeesRepositoryInterface.getAllEmployees();
	}

}
