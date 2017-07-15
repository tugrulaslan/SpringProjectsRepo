package com.tugrulaslan.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tugrulaslan.domain.Employee;

@Repository("employeeDAO")
public class EmployeeDAOImpl implements EmployeeDAO {
	
	@Autowired
	SessionFactory sessionFactory;

	public void addEmployee(Employee employee) {
		this.sessionFactory.getCurrentSession().save(employee);
		
	}

	public List<Employee> getAllEmployees() {
		return this.sessionFactory.getCurrentSession().createQuery("from Employee").list();
	}

	public void deleteEmployee(Employee employee) {
		sessionFactory.getCurrentSession().delete(employee);
	}

}
