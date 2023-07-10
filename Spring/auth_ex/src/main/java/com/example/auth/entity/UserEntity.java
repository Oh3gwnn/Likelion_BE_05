package com.example.auth.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity @Data
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // DB 제약사항 추가
    // hibernate <-> Sqlite : unique 충돌 error -> 실행 문제 X
    @Column(nullable = false, unique = true)
    private String username;
    private String password;

    private String email;
    private String phone;
}
