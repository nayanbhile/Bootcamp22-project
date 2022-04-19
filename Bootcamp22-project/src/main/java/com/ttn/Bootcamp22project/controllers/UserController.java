package com.ttn.Bootcamp22project.controllers;

import com.ttn.Bootcamp22project.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @GetMapping("/")
    private String showUserPage()
    {
        return "Welcome!";
    }
}
