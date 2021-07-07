package com.example.demo.controllers;

import com.example.demo.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;
    @GetMapping("/")
    public  String viewAllAdmins(Model model){
        model.addAttribute("listAdmins",adminService.getAllEmployees());
        return "view_all_admins";
    }
}
