package com.ltts.Flightproject.bo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ltts.Flightproject.model.Flight;

@Repository
public interface FlightBo extends JpaRepository< Flight ,Integer> {

	
}
