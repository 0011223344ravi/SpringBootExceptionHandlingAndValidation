package com.example.springbootexceptionhandlingandvalidation.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
@Data
public class UserRequest {


    @NotNull(message = "username can't be null")
    private String name ;
    @NotNull(message = "fatherName can't be null")
    private String fatherName;
    @NotNull(message = "address can't be null")
    private String address;
   @Min(value = 23,message = "age can't be less than  23")
   @Max(value = 60,message = "age can't be more than 60")
    private int age ;
}
