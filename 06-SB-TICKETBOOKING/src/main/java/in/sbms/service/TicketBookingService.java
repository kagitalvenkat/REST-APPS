package in.sbms.service;

import org.springframework.stereotype.Service;

import in.sbms.request.Passenger;
import in.sbms.response.Ticket;

@Service
public class TicketBookingService {
	
	public Ticket bookTicket(Passenger passenger) {
		System.out.println(passenger);
		
		Ticket t = new Ticket();
		t.setPnr("pnr990202123");
		t.setTicketStatus("RAC");
		t.setTicketPrice(750.85);
		
		return t;
	}

}
