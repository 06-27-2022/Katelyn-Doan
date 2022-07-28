package com.employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.ConnectionUtil;

public class EmployeeRepositoryImpl implements EmployeeRepository{

	public List<Employee> findAllEmployees() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet set = null;
		
		List<Employee> employees = new ArrayList<>();
		
		final String SQL = "select * from revatureemployee";
		
		try {
			conn = ConnectionUtil.getNewConnection();
			stmt = conn.createStatement();
			set = stmt.executeQuery(SQL);
			
			while(set.next()) {
				Employee employee = new Employee(
						set.getString(1),
						set.getString(2),
						set.getString(3),
						set.getString(4));
				employees.add(employee);
				
			}
		}catch(SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					conn.close();
					stmt.close();
					set.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		
		
		
		return employees;
	}
	
	@Override
	public void save(Employee employee) {
		Connection conn = null;
		PreparedStatement stmt = null;
		final String SQL = "insert into revatureemployee values(?,?,?,?)";
		
		try {
			conn = ConnectionUtil.getNewConnection();
			stmt = conn.prepareStatement(SQL);
			
			stmt.setString(1, employee.getRole());
			stmt.setString(2, employee.getName());
			stmt.setString(3, employee.getUsername());
			stmt.setString(4, employee.getPassword());
			stmt.execute();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
				stmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	@Override
	public void update(Employee employee) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public Employee findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
