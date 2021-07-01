package ict.fot.ruh.ac.LiveDinner.Food.delivery.service;

import ict.fot.ruh.ac.LiveDinner.Food.delivery.model.Admin;
import ict.fot.ruh.ac.LiveDinner.Food.delivery.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminServiceImp implements AdminService{

    @Autowired
    public AdminRepository adminRepository;

    @Override
    public List<Admin> getAllAdmin() {
        return adminRepository.findAll();
    }
}
