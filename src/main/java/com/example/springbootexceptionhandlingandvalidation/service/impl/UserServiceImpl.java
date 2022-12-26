package com.example.springbootexceptionhandlingandvalidation.service.impl;

import com.example.springbootexceptionhandlingandvalidation.dto.UserRequest;
import com.example.springbootexceptionhandlingandvalidation.entity.User;
import com.example.springbootexceptionhandlingandvalidation.exception.UserNotFoundException;
import com.example.springbootexceptionhandlingandvalidation.repo.UserRepo;
import com.example.springbootexceptionhandlingandvalidation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public User insertUser(UserRequest userRequest) {

        User user = User.build(0,userRequest.getName(),
                userRequest.getFatherName(),
                userRequest.getAddress(),
                userRequest.getAge());

        return  userRepo.save(user);
    }

    @Override
    public User findByUserId(int id) throws UserNotFoundException {

        return userRepo.findById(id).orElseThrow(()->new UserNotFoundException("user not found" +id+""));



    }

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }



}
