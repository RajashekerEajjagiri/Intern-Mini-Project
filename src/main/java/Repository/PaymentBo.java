package com.ltts.Flightproject.bo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ltts.Flightproject.model.Payment;

public interface PaymentBo extends JpaRepository<Payment,Integer> {

}
