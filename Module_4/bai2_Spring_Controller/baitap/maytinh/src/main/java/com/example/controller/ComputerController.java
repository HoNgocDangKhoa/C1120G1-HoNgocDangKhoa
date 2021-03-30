package com.example.controller;

import com.example.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ComputerController {
    @Autowired
    ComputerService computerService;
    @GetMapping("/")
    public String getForm(){
        return "index";
    }
    @PostMapping("computer")
    public String calculation(@RequestParam String calculation , Model model,@RequestParam int first,@RequestParam int second){
        model.addAttribute("first",first);
        model.addAttribute("second",second);
     switch (calculation){
            case "addition(+)":
                model.addAttribute("result",computerService.addition(first,second));
                break;
            case "subtraction(-)":
                model.addAttribute("result",computerService.subtraction(first,second));
                break;
            case "multiplication(*)":
                model.addAttribute("result",computerService.multiplication(first,second));
                break;
            case "division(/)":
                model.addAttribute("result",computerService.division(first,second));
                break;


        }
        model.addAttribute("calculation",calculation);
        return "index";
    }

}
