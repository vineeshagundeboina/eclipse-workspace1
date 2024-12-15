package com.sra.ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sra.ssm.entity.Employee;
import com.sra.ssm.repository.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired EmployeeRepo employeeRepo;
	public List<Employee> getAllEmployees() {
		return employeeRepo.findAll();
		
		
	}
	
	public  Employee createEmployee(Employee employee) {
		System.out.println("beforeupdating employeeExperience:");
		System.out.println(employee.getEmployeeExperience());

		int employeeExperience = employee.getEmployeeExperience();
		employeeExperience=employeeExperience-1;
		employee.setEmployeeExperience(employeeExperience);
		System.out.println("after updating employeeExperience:"+employee.getEmployeeExperience());

		return employeeRepo.save(employee);
		
		
	}

	public void updateEmployee() {
		
	
	}
	public void deleteEmployee() {
		
	}
}
