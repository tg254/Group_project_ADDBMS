package com.example.demo.controllers;

import com.example.demo.models.Admin;
import com.example.demo.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("admin-all")
    public  String viewAllAdmins(Model model){
        model.addAttribute("listAdmins",adminService.getAllEmployees());
        model.addAttribute("activePage", "drop-1");
        return "all-admins";
    }

    @GetMapping("admin-register-form")
    public String adminRegister(Model model){
        Admin admin = new Admin();
        model.addAttribute("admin", admin);
        model.addAttribute("activePage", "drop-1");
        return "admin-register";
    }

    @PostMapping("register-admin")
    public String registerAdmin(@ModelAttribute("new-admin") Admin admin){
        adminService.registerAdmin(admin);

        return "redirect:/";
    }

}