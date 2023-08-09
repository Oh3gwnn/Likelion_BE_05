package com.example.http;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;
import java.util.Map;

@Slf4j @Controller
public class HeaderController {
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
