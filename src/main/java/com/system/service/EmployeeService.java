package com.system.service;

import java.util.List;

import com.system.entities.Employee;


public interface EmployeeService {

	List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(long id);
	void deleteEmployee(long id);
}
