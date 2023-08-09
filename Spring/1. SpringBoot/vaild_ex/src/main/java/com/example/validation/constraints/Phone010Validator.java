package com.example.validation.constraints;

import com.example.validation.constraints.annotations.EmailWhiteList;
import com.example.validation.constraints.annotations.Phone010;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// 데이터 유효성 검사 '010-' or '(010)'
public class Phone010Validator implements ConstraintValidator<Phone010, String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value.startsWith("010-") || value.startsWith("(010)");
    }
}