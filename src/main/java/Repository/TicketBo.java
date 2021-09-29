package com.ltts.Flightproject.bo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ltts.Flightproject.model.Ticket;
import com.ltts.Flightproject.model.User;
	@Repository
public class TicketBo {
	
	@Autowired
	SessionFactory sf;
	
	public boolean insertTicket(Ticket t) {
		System.out.println("Insise User-Beg");
		Session s=sf.openSession();
		s.beginTransaction();
		s.save(t);
		s.getTransaction().commit();
		s.close();
		System.out.println("Inside User Bo-End");
	  return false;
	}

	
}
