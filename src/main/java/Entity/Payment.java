package com.ltts.Flightproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Payment {
      @Id
      @GeneratedValue
	private  Integer paymentId;
    //private String tickId;  
	private String bankName;
	private String cardNo;
	private String doe;
	private String cvv;
	private String Amount;
	
	public Payment() {
		super();
	}
	
	
	public Payment(String bankName, String cardNo, String doe, String cvv, String amount) {
		super();
		this.bankName = bankName;
		this.cardNo = cardNo;
		this.doe = doe;
		this.cvv = cvv;
		Amount = amount;
	}


	public Integer getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}
/*	public String getTickId() {
		return tickId;
	}
	public void setTickId(String tickId) {
		this.tickId = tickId;
	}*/
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getDoe() {
		return doe;
	}
	public void setDoe(String doe) {
		this.doe = doe;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	public String getAmount() {
		return Amount;
	}
	public void setAmount(String amount) {
		Amount = amount;
	}


	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", bankName=" + bankName + ", cardNo=" + cardNo + ", doe=" + doe
				+ ", cvv=" + cvv + ", Amount=" + Amount + "]";
	}
	
	
	
	
}
