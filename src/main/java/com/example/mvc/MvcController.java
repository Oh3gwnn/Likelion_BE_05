package com.example.mvc;

import com.example.mvc.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class MvcController {
    private int hitCount = 0;
    private List<String> listOfLotto = new ArrayList<>();

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute( "message", "Hello, Thymeleaf!" );
        return "home";
    }

    @RequestMapping("/student")
    public String student(Model model) {
        model.addAttribute(
                "obj",
                new Student("Kim", "asdf@asdf.com")
        );
        return "student";
    }

    @RequestMapping("/is-logged-in")
    public String isLoggedIn(Model model) {
        model.addAttribute("isLoggedIn", true );
        return "if-unless";
    }

    @RequestMapping("/each")
    public String items(Model model) {
        List<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("foo");
        listOfStrings.add("bar");
        listOfStrings.add("baz");
        model.addAttribute("listOfStrings", listOfStrings);

        List<Student> studentList = Arrays.asList(
                new Student("Alex", "alex@gmail.com"),
                new Student("Brad", "brad@naver.com"),
                new Student("Chad", "chad@daum.net")
        );

        model.addAttribute("studentList", studentList);

        return "each";
    }

    @RequestMapping("/hits")
    public String hits(Model model) {
        model.addAttribute("hits", ++hitCount);
        return "hits";
    }

    @RequestMapping("/lotto")
    public String lotto(Model model) {
        List<Integer> listOfNums = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            listOfNums.add((int)(Math.random()*60));
        }
        listOfLotto.add(listOfNums.toString());
        model.addAttribute("listOfNums", listOfNums);
        return "lotto";
    }

    @RequestMapping("/history")
    public String history(Model model) {
        boolean isHistory;
        if (!listOfLotto.isEmpty()) isHistory = true;
        else isHistory = false;
        model.addAttribute("listOfLotto", listOfLotto);
        model.addAttribute("isHistory", isHistory);
        return "history";
    }
}
