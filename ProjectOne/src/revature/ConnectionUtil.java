package com.revature;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	
	public static Connection getNewConnection() throws SQLException{
		Connection conn = DriverManager.getConnection(
				System.getenv("db_url"),
				System.getenv("db_username"),
				System.getenv("db_password")
				);
		return conn;
	}

}

