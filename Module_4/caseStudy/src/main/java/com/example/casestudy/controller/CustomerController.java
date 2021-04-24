package com.example.casestudy.controller;

import com.example.casestudy.model.Customer;
import com.example.casestudy.service.CustomerService;
import com.example.casestudy.service.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @Autowired
    CustomerTypeService customerTypeService;

    @GetMapping("")
    public String showForm() {
        return "index";
    }

    @GetMapping("/customer")
    public ModelAndView showFormCustomer(@PageableDefault(value = 2) Pageable pageable){
        return new ModelAndView("list_cus" ,"listCustomer",customerService.findAll(pageable));
    }
    @GetMapping("/customer/save")
    public String getForm(Model model,Customer customer){
        model.addAttribute("customer",customer);
        model.addAttribute("typeCustomer",customerTypeService.findAll());
        return "/customer/save";

    }
    @PostMapping("/saveCustomer")
    public String save(@Validated @ModelAttribute(name = "customer") Customer customer, BindingResult bindingResult,Model model){
        if(bindingResult.hasErrors()){
            model.addAttribute("customer",customer);
            return "/customer/save";
        }else {
            customerService.save(customer);
            return "redirect:/customer";
        }


    }
    @GetMapping("/edit")
    public String getFormEdit(@RequestParam (name="id") String id, Model model) {
        model.addAttribute("customer", customerService.findById(id));
        model.addAttribute("typeCustomer", customerTypeService.findAll());
        return "/customer/edit";
    }
    @PostMapping("/editCustomer")
    public String edit(@Validated @ModelAttribute (name="customer") Customer customer,BindingResult bindingResult , Model model, @RequestParam String id) {
        if (bindingResult.hasErrors()){
            model.addAttribute("customer", customerService.findById(id));
            model.addAttribute("typeCustomer", customerTypeService.findAll());
            return "/customer/edit";
        }else {
            customerService.save(customer);
            return "redirect:/customer";
        }

    }

    @GetMapping("/customer/delete/{id}")
    public String showFormDelete(@PathVariable String id ,Model model){
        model.addAttribute("customer",customerService.findById(id));
        return "customer/delete";
    }
    @PostMapping("/customer/delete")
    public String delete(@RequestParam String id){
        customerService.remove(id);
        return "redirect:/customer";
    }
    @GetMapping("/view")
    public String view(@RequestParam String id,Model model){
        model.addAttribute("view",customerService.findById(id));
        return "/customer/view";
    }

    @GetMapping("/search")
    public String listCustomer(Model model, @RequestParam String keyword, Pageable pageable) {

        if (keyword.equals("")) {
            model.addAttribute("listCustomer",customerService.findAll(pageable));
            return "redirect:/customer";
        } else {
            model.addAttribute("listCustomer", customerService.findCustomerByCustomerNameContaining(keyword, pageable));
            return "list_cus";
        }
    }
}