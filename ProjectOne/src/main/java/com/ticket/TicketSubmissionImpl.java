package com.ticket;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.revature.ConnectionUtil;

public class TicketSubmissionImpl implements TicketSubmission {

	@Override
	public void save(Ticket ticket) {
		Connection conn = null;
		PreparedStatement stmt = null;
		final String SQL = "insert into ticketsubmission values(default,?,?,?,?)";
		
		try {
			conn = ConnectionUtil.getNewConnection();
			stmt = conn.prepareStatement(SQL);
			
			stmt.setString(1, ticket.getUsername());
			stmt.setInt(2, ticket.getAmount());
			stmt.setString(3, ticket.getDescription());
			stmt.setBoolean(4, false);
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
	public void update(Ticket ticket) {
		
	}

}
