package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Convert {
    @GetMapping ("/")
    public String getForm(){
        return "/convert";
    }
    @PostMapping("/convert")
    public  String ConvertUSD(@RequestParam int convert, Model model){
        int vnd = convert*23000;
        model.addAttribute("convert",convert);
        model.addAttribute("vnd",vnd);
        return "/convert1";
    }
}
