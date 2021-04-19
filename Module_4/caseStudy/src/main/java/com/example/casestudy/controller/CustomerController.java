package com.example.casestudy.controller;

import com.example.casestudy.model.Customer;
import com.example.casestudy.service.CustomerService;
import com.example.casestudy.service.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
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
    @GetMapping("/save")
    public String getForm(Model model,Customer customer){
        model.addAttribute("saveCustomer",customer);
        model.addAttribute("typeCustomer",customerTypeService.findAll());
        return "/customer/save";

    }
    @PostMapping("/saveCustomer")
    public String save(Customer customer){
       customerService.save(customer);
        return "redirect:/customer";

    }
    @GetMapping("/edit")
    public String getFormEdit(@RequestParam Integer id, Model model) {
        model.addAttribute("editCustomer", customerService.findById(id));
        model.addAttribute("typeCustomer", customerTypeService.findAll());
        return "/customer/edit";
    }
    @PostMapping("/editCustomer")
    public String edit(Customer customer) {
        customerService.save(customer);
        return "redirect:/customer";

    }
    @GetMapping("/delete")
    public String delete(@RequestParam Integer id){
        customerService.remove(id);
        return "redirect:/customer";
    }
    @GetMapping("/view")
    public String view(@RequestParam Integer id,Model model){
        model.addAttribute("view",customerService.findById(id));
        return "/customer/view";
    }
}