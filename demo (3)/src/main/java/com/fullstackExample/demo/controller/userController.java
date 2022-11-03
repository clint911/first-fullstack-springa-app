package com.fullstackExample.demo.controller;

import com.fullstackExample.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("api/")
public class userController {

    //injecting user repository
    @Autowired
    private userRepository userRepository;

    @GetMapping("users")
    public List<User> getUsers() {
    return this.userRepository.findAll();

    }
}
