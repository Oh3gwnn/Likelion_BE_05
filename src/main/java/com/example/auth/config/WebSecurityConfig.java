package com.example.auth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

// 5.7 버전 이전: extends WebSecurityConfigurerAdapter
// 6.1 버전 이후: Builder -> Lambda DSL 기반 설정
@Configuration
//@EnableWebSecurity -> 2.1 버전 이후 Spring BOot Starter Security 에서는 필수 X
public class WebSecurityConfig {
    @Bean // 메서드의 결과를 Bean 객체로 등록
    public SecurityFilterChain securityFilterChain(
            HttpSecurity http // DI 자동으로 설정됨, 빌더 패턴처럼 쓴다.
            ) throws Exception {
        // HTTP 요청 허가 관련 설정을 하고 싶다.
        http.authorizeHttpRequests(authHttp -> authHttp
                .requestMatchers("no-auth") // requestMatchers -> 어떤 URL로 오는 요청에 대하여 설명하는지
                .permitAll() // permitAll -> 누가 요청해도 허락한다.
        );

        return http.build();
    }
}
