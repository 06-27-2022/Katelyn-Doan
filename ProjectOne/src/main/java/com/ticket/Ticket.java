package com.ticket;

import java.util.Objects;

public class Ticket {
	
	private String username;
	private int amount;
	private String description;
	private boolean approved;
	
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Ticket(String username, int amount, String description, boolean approved) {
		super();
		this.username = username;
		this.amount = amount;
		this.description = description;
		this.approved = approved;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public boolean isApproved() {
		return approved;
	}
	
	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(amount, approved, description, username);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ticket other = (Ticket) obj;
		return amount == other.amount && approved == other.approved && Objects.equals(description, other.description)
				&& Objects.equals(username, other.username);
	}
	
	@Override
	public String toString() {
		return "Ticket [username=" + username + ", amount=" + amount + ", description=" + description + ", approved="
				+ approved + "]";
	}
	

}
