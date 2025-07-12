package com.simplebuy.simplebuy_back.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplebuy.simplebuy_back.domain.user.User;
import com.simplebuy.simplebuy_back.dtos.UserDTO;
import com.simplebuy.simplebuy_back.services.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody @Valid UserDTO data){
        User newUser = userService.createUser(data);
        return ResponseEntity.status(HttpStatus.CREATED).body(newUser);
    }
}
