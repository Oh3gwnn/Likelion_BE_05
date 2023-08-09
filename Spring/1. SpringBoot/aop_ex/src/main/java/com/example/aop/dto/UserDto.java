package com.example.aop.dto;

import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String username;
    private String password;
    private String passwordCheak;
    private String email;
    private String phone;
}
