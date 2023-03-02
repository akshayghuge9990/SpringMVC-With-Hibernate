package com.BikkadIT.SpringwithMvcWithHibernate.dao;

import java.util.List;

import com.BikkadIT.SpringwithMvcWithHibernate.model.Employee;

public interface EmployeeDao {
	
	public int saveEmployee(Employee emp);
	
	public List<Employee> getAllEmployee();

}
