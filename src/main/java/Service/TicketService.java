package com.ltts.Flightproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltts.Flightproject.bo.FlightBo;
import com.ltts.Flightproject.bo.TicketBo;
import com.ltts.Flightproject.bo.TicketBo1;
import com.ltts.Flightproject.model.Flight;
import com.ltts.Flightproject.model.Ticket;

@Service
public class TicketService {

	
	@Autowired
	TicketBo1 tb;
	public Ticket m5(Ticket t) {
		return tb.save(t);
	}
	public List<Ticket> getAlltickets() {
		// TODO Auto-generated method stub
		return tb.findAll();
	}
	public Ticket getTicketByIs(Integer id) {
	
		return tb.getById(id);
	}
 
}
