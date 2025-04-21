package com.example.demo.service;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Passenger;
import com.example.demo.model.Ticket;
@Service
public class ticketService implements ITicketService {

	private String urlGet="http://localhost:8484/TicketBookingApi/get-ticket/{ticketNumber}";
	private String urlPost="http://localhost:8484/TicketBookingApi/get-ticketNumber";

	@Override
	public Integer registerPassenger(Passenger passenger) {
		// TODO Auto-generated method stub
		RestTemplate restTemplate=new RestTemplate();
	ResponseEntity<Integer>	response=restTemplate.postForEntity(urlPost, passenger, Integer.class);
	Integer ticketNumber=response.getBody();
		return ticketNumber;
	}
 
	@Override
	public Ticket getFullTicket(Integer ticketNumber) {
		// TODO Auto-generated method stub
		RestTemplate restTemplate=new RestTemplate();
		ResponseEntity<Ticket> response = restTemplate.getForEntity(urlGet, Ticket.class, ticketNumber);
	return response.getBody();
	}

}
