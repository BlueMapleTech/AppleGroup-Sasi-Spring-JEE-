package com.bluemaple.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluemaple.dao.TicketTypeDaoInterface;
import com.bluemaple.ticketbooking.Ticket;

@Service
public class TicketTypeServiceImpl  implements TicketTypeServiceInterface{

	@Autowired
	TicketTypeDaoInterface ticketTypeDaoInterface;
	
	@Override
	public Ticket addTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		return ticketTypeDaoInterface.addTicket(ticket);
	}

}
