package com.example.validation.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UserDto {
    private Long id;

    @NotBlank
    private String username;
    @Email
    private String email;
    @NotNull
    private String phone;
    @Min(14)
    private Integer age;
}
