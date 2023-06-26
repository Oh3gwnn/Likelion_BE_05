package com.example.validation.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.LocalDate;

@Data
public class UserDto {
    private Long id;

    @NotBlank
    private String username;
    @Email
    private String email;
    @NotNull
    private String phone;

    @NotNull @Min(14) // 최솟값
    private Integer age;

    @Future // 미래의 시간만
    private LocalDate validUntil;

    @NotNull    // notNullString -> Null이 아닌지만 검증
    private String notNullString;
    @NotEmpty   // notEmptyString -> 길이가 0이 아닌지만 검증
    private String notEmptyString;
    @NotBlank   // notBlankString -> 공백 문자로만 이루어지지 않았는지 검증
    private String notBlankString;
}
