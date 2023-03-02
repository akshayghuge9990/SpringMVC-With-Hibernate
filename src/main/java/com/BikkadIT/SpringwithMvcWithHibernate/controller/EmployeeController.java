package com.BikkadIT.SpringwithMvcWithHibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.BikkadIT.SpringwithMvcWithHibernate.model.Employee;
import com.BikkadIT.SpringwithMvcWithHibernate.service.EmployeeServiceI;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeServiceI employeeServiceI;
	
	@GetMapping("/preRegister")
	public String preRegister() {
		
		
		return "empReg";
		
		
	}
	@PostMapping("/saveEmployee")
	public String saveEmployee(Employee emp) {
		int saveEmployee = employeeServiceI.saveEmployee(emp);
		
		return "UserSuccess";
		
	}
	@GetMapping("/getAllEmployee")
	public String getAllEmployee(Model model){
	 List<Employee> list = employeeServiceI.getAllEmployee();
	 model.addAttribute("EPLOYEELIST", list);
		return "allEmp";
	}
	
	
	
	
	
	
	
	
}
