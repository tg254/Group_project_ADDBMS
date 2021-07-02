package ict.fot.ruh.ac.LiveDinner.Food.delivery.controller;

import ict.fot.ruh.ac.LiveDinner.Food.delivery.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @Autowired
    public AdminService adminService;

//    @GetMapping("/")
//    public String viewHomePage(){
//        return "index";
//    }

    @GetMapping("/admin")
    public String viewAdminPage(Model model){
        model.addAttribute("listAdmins",adminService.getAllAdmin());
        return "admin";
    }

//    @GetMapping("/menu")
//    public String viewMenuPage(){
//        return "menu";
//    }
//
//    @GetMapping("/about")
//    public String viewAboutPage(){
//        return "about";
//    }
}
