package com.tugrulaslan.service;

import java.util.List;

import com.tugrulaslan.domain.Employee;

public interface EmployeeService {

	public void addEmployee(Employee employee);
	
	public List<Employee> getAllEmployees();
	
	public void deleteEmployee(Employee employee);

}
