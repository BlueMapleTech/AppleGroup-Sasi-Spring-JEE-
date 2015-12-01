package com.bluemaple.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bluemaple.service.TicketTypeServiceInterface;
import com.bluemaple.ticketbooking.Ticket;

@Controller
public class TicketType {
	
	@Autowired
	TicketTypeServiceInterface ticketTypeServiceInterface;

	@RequestMapping(value = "/addtickettype", method = RequestMethod.GET)
	public ModelAndView addTicketType() {
		int idtic = 0;
		return new ModelAndView("tickettype","idtic",idtic);
		
	}
	
	@RequestMapping(value = "/addticket", method = RequestMethod.GET)
	public ModelAndView addTicket(@ModelAttribute Ticket ticket) {
		System.out.println("controllerticket" +ticket.toString());
		List<Ticket> ttype = ticketTypeServiceInterface.addTicket(ticket);
		return new ModelAndView("adminpage","ttype",ttype);
		
	}
	@RequestMapping(value = "/ticketupdate", method = RequestMethod.GET)
	public ModelAndView ticketUpdate(@RequestParam("ticId") int ticketId) {
		int idtic = ticketId;
		return new ModelAndView("tickettype","idtic",idtic);
		
	}
	
}
