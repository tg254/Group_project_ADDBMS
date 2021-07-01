package ict.fot.ruh.ac.LiveDinner.Food.delivery.service;

import ict.fot.ruh.ac.LiveDinner.Food.delivery.model.Customer;
import ict.fot.ruh.ac.LiveDinner.Food.delivery.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImp implements CustomerService{

    @Autowired
    public CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }
}
