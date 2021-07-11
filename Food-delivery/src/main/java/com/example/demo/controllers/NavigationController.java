package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavigationController {

    @GetMapping("/")
    public String navigateHome (Model model){
        model.addAttribute("activePage", "home");
        return "index";
    }

    @GetMapping("/menu")
    public String navigateMenu (Model model){
        model.addAttribute("activePage", "menu");
        return "menu";
    }

    @GetMapping("/about")
    public String navigateAbout (Model model){
        model.addAttribute("activePage", "about");
        return "about";
    }

    @GetMapping("/reservation")
    public String navigateReservation (Model model){
        model.addAttribute("activePage", "drop-1");
        return "reservation";
    }


    @GetMapping("/gallery")
    public String navigateGallery (Model model){
        model.addAttribute("activePage", "drop-1");
        return "gallery";
    }

    @GetMapping("/blog")
    public String navigateBlog (Model model){
        model.addAttribute("activePage", "drop-2");
        return "blog";
    }

    @GetMapping("/blog-details")
    public String navigateBlogSingle (Model model){
        model.addAttribute("activePage", "drop-2");
        return "blog-details";
    }

    @GetMapping("/contact")
    public String navigateContact (Model model){
        model.addAttribute("activePage", "contact");
        return "contact";
    }



}
