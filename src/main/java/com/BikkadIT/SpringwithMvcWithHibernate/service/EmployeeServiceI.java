package com.BikkadIT.SpringwithMvcWithHibernate.service;

import java.util.List;

import com.BikkadIT.SpringwithMvcWithHibernate.model.Employee;

public interface EmployeeServiceI {
	
	public int saveEmployee(Employee emp);
	
	public List<Employee> getAllEmployee();

}
