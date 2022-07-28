package revature;

import java.util.List;

public interface EmployeeRepository {
	
	List<Employee> findAllEmployees();
	
	List<String> getAllUsernames();
	
	List<String> getAllPasswords();
	
	void save(Employee employee);
	
	void update(Employee employee);
	
	Employee findByUsername(String username);
	
	Employee findByPassword(String password);
	

}
