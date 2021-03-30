package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class TuDien {
    @GetMapping("/")
    public String show(){
        return "/show";
    }
    @PostMapping("/search")
    public String search (@RequestParam String search, Model model){

        Map<String,String> stringMap = new HashMap<>();
        stringMap.put("hello","xin chao");
        stringMap.put("search","tim kiem");
        stringMap.put("convert","chuyen doi");
        stringMap.put("age","tuoi");
        stringMap.put("music","am nhac");
        String result = stringMap.get(search);
        model.addAttribute("search",search);
        if(result != null){
            model.addAttribute("result",result);
            return "/search";
        }else {
            model.addAttribute("massage","not found");
            return "/show";
        }
    }
}
