package com.ltts.Flightproject.controller;





import java.sql.Date;
import java.time.LocalDate;
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
import com.ltts.Flightproject.bo.TicketBo;
import com.ltts.Flightproject.bo.TicketBo1;
import com.ltts.Flightproject.model.Flight;
import com.ltts.Flightproject.model.Ticket;
import com.ltts.Flightproject.model.User;

@RestController
public class TicketController {
	@Autowired
	TicketBo1 tb;
	
	@Autowired
	FlightBo fb;
	
	int seats=250;
	
	
	@RequestMapping("/bookticket")
	public ModelAndView m1(Model model) {
		ModelAndView mv=new ModelAndView("bookticket");
		List<Flight> li= fb.findAll();
		model.addAttribute("list", li);
		return mv;
	}
	
	@RequestMapping(value="insertTicket", method=RequestMethod.POST)
	public ModelAndView m1(HttpServletRequest request,Model model) {
		
		
		//Integer tid=Integer.parseInt(request.getParameter(""));
		
		String ff=request.getParameter("ffrom");
		String ft=request.getParameter("fto");
		String fnu=request.getParameter("fnum");
		String fnam=request.getParameter("fnam");
		Date dob=Date.valueOf(request.getParameter("jdate"));
		LocalTime dept=LocalTime.parse(request.getParameter("deptime"));
		String type=request.getParameter("ttype");
		Integer notic=Integer.parseInt(request.getParameter("not"));
		
		//String img=(request.getParameter("img"));
		
		
		Ticket t=new Ticket(ff,ft,fnu,fnam,dob,dept,type,notic);
		//user1.insertuser("insertuser");
		System.out.println(t);
		tb.save(t);
		int result=0;
		if(notic<seats)
	    {  
	        if(result<=seats){ 
	        	tb.save(t);
		  System.out.println("entering perfect");
		        if(type.equals("economic")  )   {
		        	result+=notic;
		        	int avai=seats-result;
		             System.out.println("problem compare");
		                 int ki=cal(3000,notic);
		                 int tcost=ki;
		                 System.out.println("total cost is "+ki);
		                 System.out.println("your odered seats are :"+result);
		            	 System.out.println("availbe seats are :"+(seats-result));
		            	
		                 ModelAndView mv1 =new ModelAndView("calculatecost");
		                 //ModelAndView mv1 =new ModelAndView("Calculatecost");
		         		mv1.addObject("tcost",tcost);
		         		mv1.addObject("result",result);
		         		mv1.addObject("avai",avai);
		         		
		                 return mv1;
		                
		                 
		                 
		              
		                 } 
		       
		      else if(type.equals("business")) {
		    	   result+=notic;
		    	   int avai=seats-result;
		          int qu= cal(6000,notic);
		          int tcost=qu;
		          System.out.println("Total cost is :"+qu);
		          System.out.println("your odered seats are :"+result);
		     	 System.out.println("availbe seats are :"+(seats-result));
		     	ModelAndView mv1 =new ModelAndView("calculatecost");
	     		mv1.addObject("tcost",tcost);
	     		mv1.addObject("result",result);
	     		mv1.addObject("avai",avai);
	     		
	             return mv1;
		          
		          
		         
		       
		           
		       } 
		}
	    }
		else if((result==seats) ||(notic==seats)) {
			ModelAndView mv1 =new ModelAndView("housefull");
			result+=notic;
			int tcost=3000*notic;
			mv1.addObject("tcost", tcost);
			mv1.addObject("result", result);
			mv1.addObject("ffrom",ff);
			mv1.addObject("fto",ft);
			mv1.addObject("jdate",dob);
			mv1.addObject("fnam", fnam);
			mv1.addObject("fnum", fnu);
			mv1.addObject("deptime", dept);
			
			 System.out.println("Housefull");
			return mv1;
		}
	/* static int cal (int c ,int nt) {
	    int cost;
	    return cost=c*nt;
	            
	    }*/
		else if(seats< notic) { 
			result+=notic;
	 	   int avai=seats-result;
	      
			ModelAndView mv1 =new ModelAndView("lerror");
	 		mv1.addObject("result",result);
	 		mv1.addObject("seats",seats);
	 		return mv1;
			
		}
			model.addAttribute("msg","Successfully Ticket Booked..");
			return new ModelAndView("success");
		
		
		    
	}

	private int cal(int i, Integer noTick) {
		// TODO Auto-generated method stub
		int cost;
		cost=i*noTick;
		return cost;
	}
}
