package com.example.springbootexceptionhandlingandvalidation.controller;


import com.example.springbootexceptionhandlingandvalidation.dto.UserRequest;
import com.example.springbootexceptionhandlingandvalidation.entity.User;
import com.example.springbootexceptionhandlingandvalidation.exception.UserNotFoundException;
import com.example.springbootexceptionhandlingandvalidation.repo.UserRepo;
import com.example.springbootexceptionhandlingandvalidation.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UserController {

     @Autowired
     private UserRepo userRepo;
    @Autowired
    private UserService userService;

   @PostMapping("/insert")

     public User insertUser(@RequestBody @Valid UserRequest userRequest){
       return userService.insertUser(userRequest);

    }



   @GetMapping("/User/{id}")
    public User getUserById(@PathVariable int id) throws UserNotFoundException {
      return userService.findByUserId(id);


    }
    @GetMapping("/findAll")
    public List<User> getAllUsers(){
        return userService.getAllUsers();

    }



   }