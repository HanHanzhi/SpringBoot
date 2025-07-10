package com.example.JobApp.payment;

import org.springframework.stereotype.Service;

@Service
public class PaypalPaymentMethod implements PaymentMethod {
    @Override
    public String paymentMethod() {
        return "PaypalPayment";
    }
    @Override
    public String getType(){
        return "paypal";
    }
}
