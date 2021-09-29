package com.ltts.Flightproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltts.Flightproject.bo.PaymentBo;

import com.ltts.Flightproject.model.Payment;

@Service
public class PaymentService {

	@Autowired
	PaymentBo pb;
	
	public Payment insertPayment(Payment p) {
		return pb.save(p);
	}
	public List<Payment> getAllPayments() {
		// TODO Auto-generated method stub
		return pb.findAll();
	}
	public Payment getPaymentByIs(Integer id) {
	
		return pb.getById(id);
	}
}
