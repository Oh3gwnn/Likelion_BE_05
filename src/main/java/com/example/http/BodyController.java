package com.example.http;

import com.example.http.dto.ResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j @Controller
public class BodyController {
    // Request '/body' -> ResponseDto Response JSON
    @PostMapping("/body")
    public @ResponseBody ResponseDto body() {
        // @ResponseBody -> HTTP Response Body
        ResponseDto response = new ResponseDto();
        response.setStatus(200);
        response.setMessage("Success");
        return response;
    }
}
