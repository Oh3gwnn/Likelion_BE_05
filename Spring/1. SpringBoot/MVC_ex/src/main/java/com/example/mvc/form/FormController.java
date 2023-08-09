package com.example.mvc.form;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
    @RequestMapping("/send")
    public String send() {
        return "form/send";
    }

    @RequestMapping("/receive")
    public String receive(
            @RequestParam("msg")
            String msg
    ) {
        System.out.println(msg);
        return "send";
    }
}
