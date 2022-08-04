package com.ticket;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.ConnectionUtil;

public class TicketProcessing {

	public List<Ticket> showAllTickets() {
			Connection conn = null;
			Statement stmt = null;
			ResultSet set = null;
			
			List<Ticket> tickets = new ArrayList<>();
			
			final String SQL = "select * from ticketsubmission";
			
			try {
				conn = ConnectionUtil.getNewConnection();
				stmt = conn.createStatement();
				set = stmt.executeQuery(SQL);
				
				while(set.next()) {
					Ticket ticket = new Ticket(
							set.getString(1),
							set.getInt(2),
							set.getString(3),
							set.getBoolean(4));
					tickets.add(ticket);
					
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
			
			
			
			return tickets;
	}

	
	public void approve(Ticket ticket) {
		Connection conn = null;
		PreparedStatement stmt = null;
		final String SQL = "update ticketsubmission set approved = ? where username = ?";
		
		try {
			conn = ConnectionUtil.getNewConnection();
			stmt = conn.prepareStatement(SQL);
			stmt.setBoolean(1, true);
			stmt.setString(2, ticket.getUsername());
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

}
