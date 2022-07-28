<<<<<<< HEAD:ProjectOne/src/main/java/com/employee/EmployeeRepository.java
package com.employee;
=======
package revature;
>>>>>>> 98caf3cd9239ac8ce6fa176946ee429df4f28089:ProjectOne/src/revature/EmployeeRepository.java

import java.util.List;

public interface EmployeeRepository {
	
	List<Employee> findAllEmployees();
	
	List<String> getAllUsernames();
	
	List<String> getAllPasswords();
	
	void save(Employee employee);
	
	void update(Employee employee);
	
	Employee findByUsername(String username);
	
<<<<<<< HEAD:ProjectOne/src/main/java/com/employee/EmployeeRepository.java
=======
	Employee findByPassword(String password);
	
>>>>>>> 98caf3cd9239ac8ce6fa176946ee429df4f28089:ProjectOne/src/revature/EmployeeRepository.java

}
