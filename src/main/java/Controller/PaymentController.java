package com.ltts.Flightproject.controller;

import java.sql.Date;
import java.time.LocalTime;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ltts.Flightproject.bo.FlightBo;
import com.ltts.Flightproject.bo.PaymentBo;
import com.ltts.Flightproject.bo.TicketBo1;
import com.ltts.Flightproject.model.Flight;
import com.ltts.Flightproject.model.Payment;
import com.ltts.Flightproject.model.Ticket;

@RestController
public class PaymentController {
	
	@Autowired
	TicketBo1 tb;
	
	@Autowired
	PaymentBo pb;
	
	@Autowired
	FlightBo fb;
	
	@RequestMapping("/payment")
	public ModelAndView payment(Model model) {
		ModelAndView mv=new ModelAndView("payment");
		List<Ticket> li= tb.findAll();
		model.addAttribute("list", li);
		return mv;
	}

	@RequestMapping(value="insertPayment", method=RequestMethod.POST)
	public ModelAndView insertPayment(HttpServletRequest request,Model model) {
		
		
		//String tid=request.getParameter("tid");
		String bname=request.getParameter("bname");
		String cnum=request.getParameter("cnum");
		String edate=request.getParameter("edate");
		String cv=request.getParameter("cv");
		String amt=request.getParameter("amt");
		
		//String img=(request.getParameter("img"));
		
		
		Payment p=new Payment(bname,cnum,edate,cv,amt);
		//user1.insertuser("insertuser");
		System.out.println(p);
		pb.save(p);
		model.addAttribute("msg","Amount was paid Successfully..");		
		model.addAttribute("msg","Successfully Yours Ticket was Booked..");
		return new ModelAndView("success");
	
	}
}
