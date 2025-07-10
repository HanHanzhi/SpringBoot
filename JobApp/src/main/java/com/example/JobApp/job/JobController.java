package com.example.JobApp.job;

import com.example.JobApp.payment.PaymentFactory;
import com.example.JobApp.payment.PaymentMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class JobController {
    private List<Job> jobs = new ArrayList<>();

    private PaymentFactory paymentFactory;

    @Autowired
    public void SetPaymentFactory(PaymentFactory paymentFactory){
        this.paymentFactory=paymentFactory;
    }

    @GetMapping("/jobs")
    public List<Job> findAll(@RequestParam String method){
            PaymentMethod pMethod = paymentFactory.getPaymentMethod(method);
            System.out.println(pMethod.paymentMethod());

        return jobs;
    }

    @PostMapping("/jobs")
    public String createJob(Job job){
        jobs.add(job);
        return "Job Added Successfully";
    }
}
