package com.ltts.Flightproject.controller;
import java.util.List;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.BaseStream;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ltts.Flightproject.bo.FlightBo;
import com.ltts.Flightproject.bo.UserBo;
import com.ltts.Flightproject.model.Flight;
import com.ltts.Flightproject.model.User;

//import antlr.collections.List;


@RestController
public class HomeController { 
	
	@Autowired
	FlightBo fb;
	
	@Autowired
	UserBo ub;
	
	@RequestMapping("/")
	
  public ModelAndView m1() {
		
		return new ModelAndView("index");
	}
	
	@RequestMapping("/home")
	
	  public ModelAndView m12() {
			
			return new ModelAndView("index");
		}
	
	@RequestMapping("/addflight")
	public ModelAndView m2() {
		return new ModelAndView("addflight");
	}
	
	@RequestMapping(value="insertflight", method=RequestMethod.POST)
	public ModelAndView m3(HttpServletRequest request, Model model ) {
		
		//AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext();
		//ac.scan("com.ltts.Flightproject");
		//ac.refresh();
		
		String num=request.getParameter("fnum");
		String name=request.getParameter("fname");
		String ffrom=request.getParameter("from");
		String fto=request.getParameter("to");
		LocalDate ld=LocalDate.parse(request.getParameter("ld"));
		LocalTime lt=LocalTime.parse(request.getParameter("lt"));
		
		//Flight f=new Flight(num,name,from,to,ld,lt);
		
		Flight f=new Flight(num,name,ffrom,fto,ld,lt);
		/*f.setFlightNum(num);
		f.setFlightName(name);
		f.setFlightFrom(from);
		f.setFlightTo(to);
		f.setLd(ld);
		f.setLt(lt);*/
		//System.out.println(num+" ** "+name+" ** "+from+" ** "+to+" ** "+ld+" ** "+lt);
		
		System.out.println(f);
		//ArrayList<String> list= new ArrayList<String>();
		//list.add(num,name,ffrom,fto,ld,lt);
		fb.save(f);
		model.addAttribute("msg", "Flight is added Successfully..");
		
		return new ModelAndView("success");
	
	}
	
	@RequestMapping("/registration")
	public ModelAndView m4() {
		return new ModelAndView("registration");
	}
	
	@RequestMapping(value="insertuser", method=RequestMethod.POST)
	public ModelAndView m5(HttpServletRequest request,Model model) {
		
		
		String email=request.getParameter("email");
		String name=request.getParameter("name");
		String gen=request.getParameter("gen");
		String mob=request.getParameter("mob");
		String addr=request.getParameter("addr");
		LocalDate dob=LocalDate.parse(request.getParameter("dob"));
		
		String img=request.getParameter("img");
		User u=new User(email,name,gen,mob,addr,dob,"USER",img);
		//user1.insertuser("insertuser");
		System.out.println(u);
		boolean b=ub.insertuser(u);
		if(b==false) {
			model.addAttribute("msg","Successfully Registered..");
			return new ModelAndView("success");
		}
		else {
			return new ModelAndView("error");
		}
		    
	}
	
	@RequestMapping("/login")
	public ModelAndView m6() {
		return new ModelAndView("login");
	}
	
	
	@RequestMapping(value="checkuser")
	public ModelAndView m7(HttpServletRequest request,Model model) {
		ModelAndView mv=null;
		String email=request.getParameter("email");
		String mobile=request.getParameter("mobile");
		User u=ub.checkUserByEmail(email);
		
		if(u.equals(null)) {
			model.addAttribute("msg","Your User Name is Wrong");
			mv=new ModelAndView("login");
			System.out.println("error in null");
		}
		else if(u.getEmail().equals(email)) {
			if(mobile.equals(u.getMobile())) {
				
				if(u.getRole().equals("USER")) {
					
				model.addAttribute("name", u.getName());
				model.addAttribute("email", u.getEmail());
				
			     mv=new ModelAndView("welcome");
				}
				else {
					model.addAttribute("name", u.getName());
					model.addAttribute("email", u.getEmail());
					
					mv=new ModelAndView("admin");
				}
				
			}
			else{
				model.addAttribute("msg","Your Password is Wrong");
				 mv=new ModelAndView("login");
			  }
			 }	
	    else {
			model.addAttribute("msg","Your User Name is Wrong");
			 mv=new ModelAndView("login");
			 System.out.println("error i not match");
		}
		return mv;
	}
	
	@RequestMapping("/viewflights")
	public ModelAndView m8(Model model) {
		
		ModelAndView mv=new ModelAndView("viewflights");
		List<Flight> li=fb.findAll();
		model.addAttribute("list",li);
		return mv;

	}
	
	@RequestMapping("/userhome")
	   public ModelAndView m9() {
			return new ModelAndView("welcome");
		}
	
	@RequestMapping("/updateuser")
	public ModelAndView m10(@RequestParam String email,Model model) {
		ModelAndView mv=new ModelAndView("updateuser");
		User u=ub.checkUserByEmail(email);
		model.addAttribute("user", u);
		return mv;
	}
	
	@RequestMapping(value="update",method=RequestMethod.POST)
public ModelAndView m11(HttpServletRequest request,Model model) {
		
		
		String uemail=request.getParameter("uemail");
		String uname=request.getParameter("uname");
		String ugen=request.getParameter("ugen");
		String umob=request.getParameter("umobile");
		String uaddr=request.getParameter("uaddr");
		LocalDate udob=LocalDate.parse(request.getParameter("udob"));
		String uimg=request.getParameter("uimg");
		User u=new User(uemail,uname,ugen,umob,uaddr,udob,request.getParameter("urole"),uimg);
		ModelAndView mv=null;
		boolean b=ub.updateuser(u);
		if(b!=false) {
			mv=new ModelAndView("error");
		}
		else {
			model.addAttribute("msg","Successfully Updated..");
			mv=new ModelAndView("success");
		}
		return mv;
	}	
	@RequestMapping("/mainhome")
	   public ModelAndView mainhome() {
			return new ModelAndView("index");
		}
	@RequestMapping("/logout")
	   public ModelAndView logout() {
			return new ModelAndView("index");
		}
	@RequestMapping("/admin")
	   public ModelAndView admin() {
			return new ModelAndView("admin");
		}
	
	@RequestMapping("/updateflight")
	public ModelAndView updateflight() {
		ModelAndView mv=new ModelAndView("updateflight");
		
		return mv;
	}
	
	@RequestMapping(value="updateflight", method=RequestMethod.POST)
	public ModelAndView updateflight(HttpServletRequest request, Model model ) {
		
		
		
		String num=request.getParameter("fnum");
		String name=request.getParameter("fname");
		String ffrom=request.getParameter("from");
		String fto=request.getParameter("to");
		LocalDate ld=LocalDate.parse(request.getParameter("ld"));
		LocalTime lt=LocalTime.parse(request.getParameter("lt"));
		
		
		Flight f=new Flight(num,name,ffrom,fto,ld,lt);
		
		System.out.println(f);
			fb.save(f);
		model.addAttribute("msg", "Flight Details are Updated Successfully..");
		
		return new ModelAndView("success");
	
	}
	
}
