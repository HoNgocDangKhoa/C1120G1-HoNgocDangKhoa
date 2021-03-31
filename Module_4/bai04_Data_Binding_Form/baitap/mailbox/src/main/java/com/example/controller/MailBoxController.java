package com.example.controller;

import com.example.model.MailBox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MailBoxController {
    @GetMapping("/")
    public ModelAndView showForm(Model model) {
        List<String> languages = new ArrayList<>();
        languages.add("English");
        languages.add("Vietnamese");
        languages.add("Japanese");
        languages.add("Chinese");
        model.addAttribute("languages", languages);
        List<Integer> page_size = new ArrayList<>();
        page_size.add(5);
        page_size.add(10);
        page_size.add(15);
        page_size.add(25);
        page_size.add(50);
        page_size.add(100);
        model.addAttribute("page_size", page_size);
        return new ModelAndView("index", "mailbox", new MailBox());
    }

    @PostMapping("/save")
    public String saveMailBox(@ModelAttribute MailBox mailBox, Model model, BindingResult result) {
        model.addAttribute("language", mailBox.getLanguages());
        model.addAttribute("page_size", mailBox.getPage_size());
        model.addAttribute("spams_filter", mailBox.isSpams_filter());
        model.addAttribute("signature", mailBox.getSignature());
        return "save";

    }
}
