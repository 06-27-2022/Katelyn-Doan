package com.revature;

import java.util.List;

public interface EmployeeRepository {
	
	List<Employee> findAllEmployees();
	
	void save(Employee employee);
	
	void update(Employee employee);
	
	Employee findByUsername(String username);
	
	Employee findByName(String name);

}

