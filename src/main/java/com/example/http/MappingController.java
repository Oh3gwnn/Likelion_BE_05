package com.example.http;

import com.example.http.dto.ArticleDto;
import com.example.http.dto.ResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Slf4j // log 변수 생성
@Controller
public class MappingController {
//    private static final Logger log
//            = LoggerFactory.getLogger(MappingController.class);

    // '/path' - GET 요청
    @RequestMapping(value = "/path", method = RequestMethod.GET)
    public String getPath() {
        log.info("GET /path");
        return "index";
    }

    // '/path' - POST 요청
    @RequestMapping(value = "/path", method = RequestMethod.POST)
    public String postPath() {
        log.info("POST /path");
        return "index";
    }

    // '/path' - PUT
    @RequestMapping(value = "/path", method = RequestMethod.PUT)
    public String putPath() {
        log.info("PUT /path");
        return "index";
    }

    // '/path' - DELETE
    @RequestMapping(value = "/path", method = RequestMethod.DELETE)
    public String DeletePath() {
        log.info("DELETE /path");
        return "index";
    }

    // '/path' - POST(JSON 데이터 포함)
    @RequestMapping(
            value = "/path",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE // import org.springframework.http.MediaType;
    )
    public String consumes() {
        log.info("POST /path Content-Type: application/json");
        return "index";
    }

    // '/path' - POST(Header -> x-likelion=hello)
    @RequestMapping(
            value = "/path",
            method = RequestMethod.POST,
            headers = "x-likelion=hello"
    )
    public String headerWith() {
        log.info("POST /path with x-likelion=hello");
        return "index";
    }

    // '/path' - POST(Query Parameter -> x-likelion=hello)
    @RequestMapping(
            value = "/path",
            method = RequestMethod.POST,
            params = "x-likelion=hello"
    )
    public String params() {
        log.info("POST /path with parameter likelion");
        return "index";
    }

    @PostMapping("/entity")
    public ResponseEntity<ResponseDto> entity(@RequestBody ArticleDto dto) {
        log.info("POST /body " + dto.toString());
        ResponseDto response = new ResponseDto();
        response.setMessage("success");
        response.setStatus(200);

        // 상태 코드 지정 -> ResponseEntity 객체 그냥 사용
        ResponseEntity<ResponseDto> responseEntity = new ResponseEntity<>(
                        response, HttpStatus.INTERNAL_SERVER_ERROR);
//        return responseEntity;

        // 커스텀 헤더
        HttpHeaders headers = new HttpHeaders();
        headers.add("x-likelion-custom", "Hello World");
//        return new ResponseEntity<>(response, headers, HttpStatus.ACCEPTED);

        // Builder 사용
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .header("x-likelion-one", "1")
                .headers(headers)
                .body(response);
    }
}
