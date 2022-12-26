package com.example.springbootexceptionhandlingandvalidation.exception;

import java.util.function.Supplier;

public class UserNotFoundException extends Exception{
    public UserNotFoundException(String s) {
         super(s);
    }
}
