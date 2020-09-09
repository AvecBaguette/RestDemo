package com.example.demo.controller;

import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerCotroller {

    private CustomerService customerService;

    @Autowired
    public CustomerCotroller(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customers")
    public List<Customer> showCustomers() {
        return this.customerService.findAll();
    }

    @GetMapping("/customer-by-last-name")
    public List<Customer> showCustomersById(@RequestParam("lastName") String lastName) {
        return this.customerService.findByLastName(lastName);
    }
}
