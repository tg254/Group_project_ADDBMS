package com.example.demo.services;

import com.example.demo.models.Customer;
import com.example.demo.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    public CustomerRepository customerRepository;

    @Override
    public List<Customer> viewAllCustomers() {
        return customerRepository.findAll();
    }
}
