package com.example.newlywed.controllers;

import com.example.newlywed.models.User;
import com.example.newlywed.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    private final UserRepository userDao;

    public UserController(UserRepository userDao) {
        this.userDao = userDao;
    }

    @GetMapping("/registration")
    public String showRegisterForm(Model model){
        model.addAttribute("user", new User());
                return "register";
    }
}
