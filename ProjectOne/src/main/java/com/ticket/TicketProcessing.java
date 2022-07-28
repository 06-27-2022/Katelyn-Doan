package com.ticket;

import java.util.List;

public interface TicketProcessing {

	List<Ticket> showAllTickets();
	
	void approve(Ticket ticket);
}
