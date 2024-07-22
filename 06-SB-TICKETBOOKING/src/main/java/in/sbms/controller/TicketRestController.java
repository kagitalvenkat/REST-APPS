package in.sbms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.sbms.request.Passenger;
import in.sbms.response.Ticket;
import in.sbms.service.TicketBookingService;

@RestController
public class TicketRestController {
	
	@Autowired
	private TicketBookingService service;
	
	@PostMapping(value="/bookTicket",
			consumes = {"application/json"},
			produces = {"application/json"})
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passenger passenger){
		Ticket bookTicket = service.bookTicket(passenger);
		System.out.println(bookTicket);
		
		return new ResponseEntity<>(bookTicket,HttpStatus.CREATED);
	}

	
}
