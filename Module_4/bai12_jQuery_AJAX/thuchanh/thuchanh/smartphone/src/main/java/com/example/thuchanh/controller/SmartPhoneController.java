package com.example.thuchanh.controller;

import com.example.thuchanh.model.SmartPhone;
import com.example.thuchanh.service.SmartPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SmartPhoneController {
    @Autowired
    SmartPhoneService smartPhoneService;
    @GetMapping("/smartphone")
    public ModelAndView showListPhone(){
        return new ModelAndView("list","listPhone",smartPhoneService.findAll());
    }
    @GetMapping("/create")
    public String showForm(Model model){
        model.addAttribute( "createPhone",new SmartPhone());
        return "create";
    }
    @PostMapping("/create")
    public String save(SmartPhone smartPhone){
        smartPhoneService.save(smartPhone);
        return "redirect:/smartphone";
    }
    @GetMapping("/edit/{id}")
    public String showForm(@PathVariable Integer id,Model model){
        model.addAttribute("edit",smartPhoneService.findById(id));
        return "edit";
    }
    @PostMapping("/edit")
    public String edit(SmartPhone smartPhone){
        smartPhoneService.save(smartPhone);
        return "redirect:/smartphone";
    }
    @GetMapping("delete/{id}")
    public String showFormDelete(@PathVariable Integer id,Model model){
        model.addAttribute("delete",smartPhoneService.findById(id));
        return "delete";
    }
    @PostMapping("/delete/{id}")
    public String delete(@PathVariable Integer id){
        smartPhoneService.delete(id);
        return "redirect:/smartphone";
    }


}
