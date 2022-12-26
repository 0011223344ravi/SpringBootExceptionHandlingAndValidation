package com.example.springbootexceptionhandlingandvalidation.service;


import com.example.springbootexceptionhandlingandvalidation.dto.UserRequest;
import com.example.springbootexceptionhandlingandvalidation.entity.User;
import com.example.springbootexceptionhandlingandvalidation.exception.UserNotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


public interface UserService {

    User insertUser(UserRequest userRequest);

    User findByUserId (int id ) throws UserNotFoundException;

    List<User> getAllUsers();


}
