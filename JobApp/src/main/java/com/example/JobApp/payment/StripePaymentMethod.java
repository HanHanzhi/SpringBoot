package com.example.JobApp.payment;

import org.springframework.stereotype.Service;

@Service
public class StripePaymentMethod implements PaymentMethod {
    @Override
    public String paymentMethod() {
        return "StripePayment";
    }

    @Override
    public String getType(){
        return "stripe";
    }
}
