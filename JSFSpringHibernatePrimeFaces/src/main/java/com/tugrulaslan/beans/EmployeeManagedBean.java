package com.tugrulaslan.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import org.springframework.dao.DataAccessException;

import com.tugrulaslan.domain.Employee;
import com.tugrulaslan.service.EmployeeService;

@ManagedBean(name="employeeBean")
@RequestScoped
public class EmployeeManagedBean {
	
	@ManagedProperty(value="#{employeeService}")
	EmployeeService employeeService;
	
	private int id;
	private String name;
	private String lastname;
	private String email;
	
	List<Employee> employeeList;		
	
	public List<Employee> getEmployeeList() {
		
		employeeList = new ArrayList<Employee>();
		employeeList.addAll(getEmployeeService().getAllEmployees());
		
		return employeeList;
	}
	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	public EmployeeService getEmployeeService() {
		return employeeService;
	}
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String addEmployee(){
		try {
			Employee employee = new Employee();
			employee.setName(getName());
			employee.setLastname(getLastname());
			employee.setEmail(getEmail());
			getEmployeeService().addEmployee(employee);
			return "index";
			
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return "error";
	}
	
	public String deleteEmployee(Employee employee){
		try {
			getEmployeeService().deleteEmployee(employee);
			return "index";
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return "error";
	}
	
	public void clearFields(){
		this.setName("");
		this.setLastname("");
		this.setEmail("");
	}

}
