package com.example.demo.ticketcontroller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Passenger;
import com.example.demo.model.Ticket;
import com.example.demo.service.ITicketService;
import com.example.demo.service.ticketService;

@Controller
public class ticketController {
	
	@Autowired
	private ITicketService service;
	@PostMapping("/book-ticket")
	public String bookTicket(@ModelAttribute Passenger passenger,Model model ) {
		
		Integer ticketNumber = service.registerPassenger(passenger);
		model.addAttribute("ticketNumber", ticketNumber);
		return "index";
	}
	@GetMapping("/register")
	public String generateForm(@ModelAttribute Passenger passenger,Model model) {
		model.addAttribute("passenger",passenger);
		return "index";
		
	}
	
	@GetMapping("/ticket-form")
	public String getTicketNumberForm(@ModelAttribute Passenger passenger,Model model) {
		
		model.addAttribute("passenger",passenger);

        return "ticket-form";
	}
	@GetMapping("/get-ticket")
	public String getTicket(@RequestParam("ticketNumber")Integer ticketNumber,Model model)
	{
		Ticket ticket = service.getFullTicket(ticketNumber);
		model.addAttribute("ticket", ticket);
		return "ticketinfo";
	}

}
