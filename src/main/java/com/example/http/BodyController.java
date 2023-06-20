package com.example.http;

import com.example.http.dto.ArticleDto;
import com.example.http.dto.ResponseDto;
import com.example.http.dto.WriterDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j @Controller
public class BodyController {

    // `/body`로 ArticleDto를 표현한 JSON과 함께
    // 요청이 들어왔을 때,
    // ResponseDto 를 표현한 JSON 응답을 반환하는 메소드
    @PostMapping("/body")
    public void body(@RequestBody ArticleDto dto) {
        log.info("POST /body " + dto.toString());
    }

    @PostMapping("/body-2") @ResponseBody
    public ResponseDto body2(@RequestBody WriterDto dto) {
        log.info("POST /body-2 " + dto.toString());
        ResponseDto response = new ResponseDto();
        response.setMessage("success");
        response.setStatus(200);
        return response;
    }


}
