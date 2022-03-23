package com.andre.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.andre.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(long workerId, int days) {
		return new Payment("Andre", 200.0, days);
	}
}
