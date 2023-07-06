package com.example.auth;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j @Controller
@RequestMapping("/users")
public class UserController {

    @GetMapping("/login")
    public String loginForm() {
        return "login-form";
    }

    @GetMapping("/my-profile")
    public String myProfile() {
        return "my-profile";
    }

    @GetMapping("/register")
    public String signUpForm() {
        return "register-form";
    }

    private final UserDetailsManager manager;
    private final PasswordEncoder passwordEncoder;

    public UserController(UserDetailsManager manager,
                          PasswordEncoder passwordEncoder) {
        this.manager = manager;
        this.passwordEncoder = passwordEncoder;
    }

    @PostMapping("/register")
    public String signUpRequest(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            @RequestParam("password-check") String passwordCheck
    ) {
        if (password.equals(passwordCheck)) {
            log.info("password match!");
            manager.createUser(User.withUsername(username)
                    .password(passwordEncoder.encode(password))
                    .build());
            return "redirect:/users/login";
        }
        log.warn("password does not match...");
        return "redirect:/users/register?error";
    }
}
