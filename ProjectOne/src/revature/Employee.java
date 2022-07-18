package com.revature;

import java.util.Objects;

public class Employee {
	
	private String role;
	private String name;
	private String username;
	private String password;
	
	public Employee() {
		
	}
	
	public Employee(String role, String name, String username, String password) {
		
		this.role = role;
		this.name = name;
		this.username = username;
		this.password = password;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getRole() {
		return this.role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, password, role, username);
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
		return Objects.equals(name, other.name) && Objects.equals(password, other.password)
				&& Objects.equals(role, other.role) && Objects.equals(username, other.username);
	}

	@Override
	public String toString() {
		return "Employee [role=" + role + ", name=" + name + ", username=" + username + ", password=" + password + "]";
	}
	
	

}

