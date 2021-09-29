package com.ltts.Flightproject.model;


import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Ticket {
	
	@Id
	@GeneratedValue//(strategy = GenerationType.IDENTITY)
	private Integer ticketId;
	private String fFrom;
	private String fTo;
	
	private String fNum;
	private String fName;
	
	private Date bookDate;
	private LocalTime depatureTime;
	private String ticketType;
	private Integer noTick;
	//private Date showDate; 
	//private String status;
	//private String payment;
	public Ticket() {
		super();
	}
	
	

	public Ticket(String fFrom, String fTo, String fNum, String fName, Date bookDate, LocalTime depatureTime,
			String ticketType, Integer noTick) {
		super();
		this.fFrom = fFrom;
		this.fTo = fTo;
		this.fNum = fNum;
		this.fName = fName;
		this.bookDate = bookDate;
		this.depatureTime = depatureTime;
		this.ticketType = ticketType;
		this.noTick = noTick;
	}



	public Integer getTicketId() {
		return ticketId;
	}
	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}
	public String getfFrom() {
		return fFrom;
	}
	public void setfFrom(String fFrom) {
		this.fFrom = fFrom;
	}
	public String getfTo() {
		return fTo;
	}
	public void setfTo(String fTo) {
		this.fTo = fTo;
	}
	public String getfNum() {
		return fNum;
	}
	public void setfNum(String fNum) {
		this.fNum = fNum;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public Date getBookDate() {
		return bookDate;
	}
	public void setBookDate(Date bookDate) {
		this.bookDate = bookDate;
	}
	public LocalTime getDepatureTime() {
		return depatureTime;
	}
	public void setDepatureTime(LocalTime depatureTime) {
		this.depatureTime = depatureTime;
	}
	public String getTicketType() {
		return ticketType;
	}
	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}
	public Integer getNoTick() {
		return noTick;
	}
	public void setNoTick(Integer noTick) {
		this.noTick = noTick;
	}
	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", fFrom=" + fFrom + ", fTo=" + fTo + ", fNum=" + fNum + ", fName="
				+ fName + ", bookDate=" + bookDate + ", depatureTime=" + depatureTime + ", ticketType=" + ticketType
				+ ", noTick=" + noTick + "]";
	}
	
	
	
}
