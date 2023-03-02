package com.BikkadIT.SpringwithMvcWithHibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.SpringwithMvcWithHibernate.dao.EmployeeDao;
import com.BikkadIT.SpringwithMvcWithHibernate.model.Employee;

@Service
public class EmployeeServiceImp implements EmployeeServiceI {
	
	@Autowired
	 private EmployeeDao employeeDaoI;

	@Override
	public int saveEmployee(Employee emp) {
		
		int id = employeeDaoI.saveEmployee(emp); 
		return id;
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> allEmployee = employeeDaoI.getAllEmployee();
		return allEmployee;
	} 

}
