package com.tugrulaslan.dao;

import java.util.List;

import com.tugrulaslan.domain.Employee;

public interface EmployeeDAO {
	
	public void addEmployee(Employee employee);
	
	public List<Employee> getAllEmployees();
	
	public void deleteEmployee(Employee employee);

}
