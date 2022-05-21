package com.example.newlywed.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/homepage")
    public String home(){
        return "home";
    }
    @GetMapping("/")
    public String landing_page(){
        return "home";
    }


}
