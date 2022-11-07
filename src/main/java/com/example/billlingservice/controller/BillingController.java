package com.example.billlingservice.controller;



import com.example.billlingservice.entity.Billing;
import com.example.billlingservice.repository.BillingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BillingController {
    @Autowired
    private BillingRepository billingRepository;

    @GetMapping("/getAll")
    public List<Billing> getAll(){
        return billingRepository.findAll();
    }
}
