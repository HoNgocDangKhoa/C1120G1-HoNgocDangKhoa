package com.example.count_view.controller;

import com.example.count_view.model.MyCounter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("counter")
public class CountController {

    @ModelAttribute("counter")
    public MyCounter setUpCounter() {
        return new MyCounter();
    }
    @GetMapping("/")
    public String get(@ModelAttribute("counter") MyCounter myCounter) {
        myCounter.increment();
        return "index";
    }
}
