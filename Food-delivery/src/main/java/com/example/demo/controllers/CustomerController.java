package com.example.demo.controllers;

import com.example.demo.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {

    @Autowired
    public CustomerService customerService;

    @GetMapping("customer-all")
    public String showAllCustomers(Model model){
        model.addAttribute("listCustomers", customerService.viewAllCustomers());
        return "all-customers";
    }
}
