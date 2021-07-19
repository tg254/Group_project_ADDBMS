package com.example.demo.controllers;

import com.example.demo.services.AdminService;
import com.example.demo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

    @Autowired
    public ProductService ProductService;

    @GetMapping("all-products")
    public String viewAllProducts(Model model){
        model.addAttribute("listOfProduct",ProductService.GetAllProduct());
        return "all-products";
    }
}
