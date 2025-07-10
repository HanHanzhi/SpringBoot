package com.example.JobApp.payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

@Service
public class PaymentFactory {
    Map<String, PaymentMethod> paymentMethodMap = new HashMap<>();

    @Autowired
    public PaymentFactory(List<PaymentMethod> paymentMethods){
        for (PaymentMethod method : paymentMethods){
            paymentMethodMap.put(method.getType(),method);
        }
    }

    public PaymentMethod getPaymentMethod(String type){
        return paymentMethodMap.get(type);
    }
}
