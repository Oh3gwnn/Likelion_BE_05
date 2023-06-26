package com.example.validation.dto;

import com.example.validation.constraints.annotations.EmailWhiteList;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.LocalDate;

@Data
public class UserDto {
    private Long id;

    @NotBlank
    private String username;
    @Email
    @EmailWhiteList // 이메일이 지정된 도메인이도록 검증하는 어노테이션
    private String email;
    @NotNull
    private String phone;

    @NotNull @Min(value = 14, message = "최소 8글자 이상 작성해주세요.") // 최솟값
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
