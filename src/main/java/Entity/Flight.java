package com.ltts.Flightproject.model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Flight {
	
	@Id
	private String flightNum;
	private String flightName;
	private String flightFrom;
	private String flightTo;
	private LocalDate ld;
	private LocalTime lt;
	
	public Flight() {
		super();
	}

	public Flight(String flightNum, String flightName, String flightFrom, String flightTo, LocalDate ld, LocalTime lt) {
		super();
		this.flightNum = flightNum;
		this.flightName = flightName;
		this.flightFrom = flightFrom;
		this.flightTo = flightTo;
		this.ld = ld;
		this.lt = lt;
	}

	public String getFlightNum() {
		return flightNum;
	}

	public void setFlightNum(String flightNum) {
		this.flightNum = flightNum;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getFlightFrom() {
		return flightFrom;
	}

	public void setFlightFrom(String flightFrom) {
		this.flightFrom = flightFrom;
	}

	public String getFlightTo() {
		return flightTo;
	}

	public void setFlightTo(String flightTo) {
		this.flightTo = flightTo;
	}

	public LocalDate getLd() {
		return ld;
	}

	public void setLd(LocalDate ld) {
		this.ld = ld;
	}

	public LocalTime getLt() {
		return lt;
	}

	public void setLt(LocalTime lt) {
		this.lt = lt;
	}

	@Override
	public String toString() {
		return "Flight [flightNum=" + flightNum + ", flightName=" + flightName + ", flightFrom=" + flightFrom
				+ ", flightTo=" + flightTo + ", ld=" + ld + ", lt=" + lt + "]";
	}
	
	
	
	

}
