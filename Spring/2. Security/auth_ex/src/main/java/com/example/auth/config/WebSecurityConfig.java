package com.example.auth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
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
        // HTTP 요청 허가 관련 설정
        http.csrf(AbstractHttpConfigurer::disable) // CSRF: Cross Site Request Forgery
                .authorizeHttpRequests(authHttp -> authHttp
                .requestMatchers("no-auth") // requestMatchers -> 어떤 URL로 오는 요청에 대하여 설명하는지
                .permitAll()                  // permitAll -> 누가 요청해도 허락한다.
                .requestMatchers("re-auth", "/users/my-profile")
                .authenticated()              // 인증이 된 사용자 허가
                .requestMatchers("/", "/users/register")
                .anonymous()                  // 인증이 되지 않은 사용자(익명) 허가
        // 로그인 -> 쿠키를 통해 세션 생성
        ).formLogin(formLogin -> formLogin
                .loginPage("/users/login")    // 로그인 하는 페이지(경로) 지정
                .defaultSuccessUrl("/users/my-profile")            // 로그인 성공 시 이동하는 페이지(경로)
                .failureUrl("/users/login?fail") // 로그인 실패 시 이동하는 페이지(경로)
                .permitAll()
        // 로그아웃 -> 세션 제거, 세션 정보만 있으면 제거 가능
        ).logout(
                // 로그아웃 요청을 보낼 URL : 어떤 UI에 로그아웃 기능을 연결하고 싶으면
                // 해당 UI가 /users/logout 경로로 POST 요청을 보냄
                logout -> logout
                        .logoutUrl("/users/logout")
                        .logoutSuccessUrl("/users/login")
                ); // 로그인 과정에서 필요한 경로들을 모든 사용자가 사용할 수 있게 권한 설정

        return http.build();
    }

//    @Bean // -> JpaUserDetailsManager
    // 사용자 관리를 위한 인터페이스 구현체 Bean
    public UserDetailsManager userDetailsManager(
            PasswordEncoder passwordEncoder
    ) {
        // 임시 User
        UserDetails user1 = User.withUsername("user1")
                .password(passwordEncoder.encode("password"))
                .build();
        // Spring 에서 미리 만들어놓은 사용자 인증 서비스
        return new InMemoryUserDetailsManager(user1);
    }

    @Bean
    // 비밀번호 암호화를 위한 Bean
    public PasswordEncoder passwordEncoder(){
        // 기본적으로 사용자 비밀번호는 해독가능한 형태로 데이터베이스에
        // 저장되면 안된다. 그래서 기본적으로 비밀번호를 단방향 암호화 하는
        // 인코더를 사용한다.
        return new BCryptPasswordEncoder();
    }
}
