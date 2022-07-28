package com.employee;

import java.util.List;

public interface EmployeeRepository {
	
	List<Employee> findAllEmployees();
	
	void save(Employee employee);
	
	void update(Employee employee);
	
	Employee findByUsername(String username);
	

}