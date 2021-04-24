package com.example.casestudy.controller;

import com.example.casestudy.model.FuramaService;
import com.example.casestudy.service.FuramaServiceService;
import com.example.casestudy.service.RentTypeService;
import com.example.casestudy.service.ServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.xml.ws.Service;

@Controller
public class ServiceController {
    @Autowired
    FuramaServiceService furamaServiceService;
    @Autowired
    ServiceTypeService serviceTypeService;
    @Autowired
    RentTypeService rentTypeService;
    @GetMapping("/service")
    public String showFormService(@PageableDefault(value = 2) Pageable pageable, Model model){
        model.addAttribute("listService",furamaServiceService.findAll(pageable));
        return "list_service";
    }

    @GetMapping("/service/save")
    public String goCreateService(Model model){
        model.addAttribute("listService",new FuramaService());
        model.addAttribute("typeService",serviceTypeService.findAll());
        model.addAttribute("listRentType",rentTypeService.findAllRentType());
        return "service/update";
    }
    @PostMapping("/service/save")
    public String saveService(@Validated @ModelAttribute(name = "listService") FuramaService service , BindingResult bindingResult , Model model,Pageable pageable){
        if(bindingResult.hasErrors()){
            model.addAttribute("listService",service);
            model.addAttribute("typeService",serviceTypeService.findAll());
            model.addAttribute("listRentType",rentTypeService.findAllRentType());
            return "service/update";
        }else {
            furamaServiceService.save(service);
            return "redirect:/service";
        }


    }

}
