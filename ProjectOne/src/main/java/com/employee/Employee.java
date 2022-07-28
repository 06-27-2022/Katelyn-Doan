<<<<<<< HEAD:ProjectOne/src/main/java/com/employee/Employee.java
package com.employee;
=======
package revature;
>>>>>>> 98caf3cd9239ac8ce6fa176946ee429df4f28089:ProjectOne/src/revature/Employee.java

import java.util.Objects;

public class Employee {
	
	private int id;
	private String role;
	private String name;
	private String username;
	private String password;
	
	public Employee() {
		super();
	}

<<<<<<< HEAD:ProjectOne/src/main/java/com/employee/Employee.java
	public Employee(String role, String name, String username, String password) {
		super();
=======
	public Employee(int id, String role, String name, String username, String password) {
		super();
		this.id = id;
>>>>>>> 98caf3cd9239ac8ce6fa176946ee429df4f28089:ProjectOne/src/revature/Employee.java
		this.role = role;
		this.name = name;
		this.username = username;
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
<<<<<<< HEAD:ProjectOne/src/main/java/com/employee/Employee.java

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
=======
>>>>>>> 98caf3cd9239ac8ce6fa176946ee429df4f28089:ProjectOne/src/revature/Employee.java

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, password, role, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name) && Objects.equals(password, other.password)
				&& Objects.equals(role, other.role) && Objects.equals(username, other.username);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", role=" + role + ", name=" + name + ", username=" + username + ", password="
				+ password + "]";
	}
	
	
	
<<<<<<< HEAD:ProjectOne/src/main/java/com/employee/Employee.java
=======
	
>>>>>>> 98caf3cd9239ac8ce6fa176946ee429df4f28089:ProjectOne/src/revature/Employee.java

}
