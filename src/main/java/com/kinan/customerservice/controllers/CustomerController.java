package com.kinan.customerservice.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Eren
 **/
@RestController
@RequestMapping("/customer/api")
public class CustomerController {
    @GetMapping
    public String homePage(){
        return "Home page.";
    }
    @GetMapping("/admin")
    @PreAuthorize("hasRole('client_admin')")
    public String admin(){
        return "Welcome dear admin.";
    }
    @GetMapping("/user")
    @PreAuthorize("hasRole('client_user')")
    public String user(){
        return "Welcome dear user.";
    }
    @GetMapping("/all")
    @PreAuthorize("hasRole('client_user') and hasRole('client_admin')")
    public String userAndAdmin(){
        return "Welcome dear user & admin.";
    }
    @GetMapping("/login")
    public String login(){
        return "Login page.";
    }
}
