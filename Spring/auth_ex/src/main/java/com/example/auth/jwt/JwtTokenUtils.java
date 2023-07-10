package com.example.auth.jwt;

import io.jsonwebtoken.security.Keys;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.security.Key;

@Slf4j @Component
// JWT 생성, 인증 등의 기능을 가지고 있을 컴포넌트
public class JwtTokenUtils {
    // JWT는 암호화를 거쳐서 만들어지는데,
    // 이를 위해서 암호키가 필요하다.
    private final Key signingKey;

    public JwtTokenUtils(
            @Value("${jwt.secret}")
            String jwtSecret
    ) {
        this.signingKey = Keys.hmacShaKeyFor(jwtSecret.getBytes());
    }
}
