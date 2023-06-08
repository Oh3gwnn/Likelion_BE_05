package com.example.mvc.form;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {
    @RequestMapping("/send")
    public String send() {
        return "send";
    }
}
