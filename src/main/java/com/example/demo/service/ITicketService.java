package com.example.demo.service;

import com.example.demo.model.Passenger;
import com.example.demo.model.Ticket;

public interface ITicketService {
	
	public Integer registerPassenger(Passenger passenger);
	public Ticket getFullTicket(Integer ticketNumber);
}
