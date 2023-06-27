package com.example.aop.controller;

import com.example.aop.aspect.LogArguments;
import com.example.aop.dto.ResponseDto;
import com.example.aop.dto.UserDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j @RestController
@RequiredArgsConstructor
public class AopController {
    @PostMapping("/users") @LogArguments
    public ResponseDto addUser(@RequestBody UserDto user) {
        log.info("addUser 호출됨");
        ResponseDto response = new ResponseDto();
        response.setMessage("addUser");
        return response;
    }

    @GetMapping("/users")
    public ResponseDto getUsers() {
        ResponseDto response = new ResponseDto();
        response.setMessage("adduser");
        return response;
    }
}
