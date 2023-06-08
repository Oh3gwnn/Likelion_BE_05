package com.example.mvc.crud;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CrudController {
    @GetMapping("/create-view")
    public String createView() {
        return "crud/create";
    }
}
