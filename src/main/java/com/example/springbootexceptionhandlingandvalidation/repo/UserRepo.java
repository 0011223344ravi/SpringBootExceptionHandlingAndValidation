package com.example.springbootexceptionhandlingandvalidation.repo;


import com.example.springbootexceptionhandlingandvalidation.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


public interface UserRepo extends JpaRepository<User, Integer> {


}
