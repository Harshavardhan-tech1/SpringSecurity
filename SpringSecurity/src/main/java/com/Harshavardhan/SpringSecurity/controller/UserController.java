package com.Harshavardhan.SpringSecurity.controller;

import com.Harshavardhan.SpringSecurity.model.Users;
import com.Harshavardhan.SpringSecurity.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
//import org.springframework.security.web.server.csrf.CsrfToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;



    @GetMapping("/get")
    public String greeting(HttpServletRequest request){
        return "<h1>Hello ,Harshavardhan Chittabathina welcome to SpringSecurity</h1> "+request.getSession().getId();
    }

    @PostMapping("/register")
    public Users register(@RequestBody Users user){


        return userService.register(user);
    }

//    @PostMapping("/login")
//    public String loginData(@RequestBody Users user){
//        System.out.println(user);
//        return "successful";
//    }

    @PostMapping("/login")
    public String loginData(@RequestBody Users user){
        return userService.verify(user);
    }


}
