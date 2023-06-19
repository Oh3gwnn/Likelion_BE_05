package com.example.http;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

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

    // header
    @PostMapping("/header-one")
    public String getHeader(
            @RequestHeader("x-likelion-some-header") String targetHeader
    ) {
        log.info("POST /header-one header: " + targetHeader);
        return "index";
    }

    // header-optional ->  'x-likelion' String 할당
    @PostMapping("/header-optional")
    public String getHeaderOptional(
            @RequestHeader(value = "x-likelion", required = false) String header) {
        log.info("POST /header-optional header:" + header);
        return "index";
    }

    // header-type ->  'x-likelion' Integer 할당
    @PostMapping("/header-type")
    public String getHeaderInteger(
            @RequestHeader(value = "x-likelion-int") Integer header) {
        log.info("POST /header-type header:" + header);
        return "index";
    }

    // header-all -> Check all headers
    @PostMapping("/header-all")
    public String getHeaderAll(
//            @RequestHeader Map<String, String> headerMap // 키가 동일 명일 경우 1개의 값만 가져옴
            @RequestHeader MultiValueMap<String, String> headerMap // 동일 키 -> 여러 개의 값을 가져오기
            ) {
        // @ReqiestHeader -> 모든 헤더를 다 가져올 때 value가 없어도 된다.
        log.info("POST /header-all");
//        for (Map.Entry<String, String> entry: headerMap.entrySet()) {
//            log.info(String.format(
//                    "%s: %s", entry.getKey(), entry.getValue()));
//        }
        for (Map.Entry<String, List<String>> entry: headerMap.entrySet()) {
            log.info(String.format(
                    "%s: %s", entry.getKey(), entry.getValue()));
        }
        return "index";
    }
}
