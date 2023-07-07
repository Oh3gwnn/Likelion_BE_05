package com.example.auth.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.sql.Date;
import java.time.Instant;

@Slf4j @Component
// JWT 관련 기능들을 넣어두기 위한 기능성 클래스
public class JwtTokenUtils {
    private final Key signingKey;

    // @Value -> lombok X, springframework O
    public JwtTokenUtils(@Value("${jwt.secret}") String jwtSecret) {
        this.signingKey = Keys.hmacShaKeyFor(Decoders.BASE64.decode(jwtSecret));
    }

    // 주어진 사용자 정보를 바탕을 JWT -> 문자열 생성
    public String generateToken(UserDetails userDetails) {
        // JWT에 담는 정보의 단위 -> Claim
        // Claims -> Claim들을 담기 위한 Map의 상속 interface
        Claims jwtClaims = Jwts.claims()
                // 사용자 정보 등록 -> 1시간 동안 유효
                .setSubject(userDetails.getUsername())
                .setIssuedAt(Date.from(Instant.now()))
                .setExpiration(Date.from(Instant.now().plusSeconds(3600)));

        return Jwts.builder()
                .setClaims(jwtClaims)
                .signWith(signingKey)
                .compact();
    }
}
