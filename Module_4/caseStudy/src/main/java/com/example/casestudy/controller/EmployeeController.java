package com.example.casestudy.controller;

import com.example.casestudy.model.Customer;
import com.example.casestudy.model.Employee;
import com.example.casestudy.model.User;
import com.example.casestudy.service.*;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.soap.SOAPBinding;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @Autowired
    PositionService positionService;
    @Autowired
    DivisionService divisionService;
    @Autowired
    EducationDegreeService educationDegreeService;
    @Autowired
    UserService userService;

    @GetMapping("/employee")
    public ModelAndView showFormCustomer(@PageableDefault(value = 2) Pageable pageable) {
        return new ModelAndView("list_employee", "listEmployee", employeeService.findAll(pageable));
    }

    @GetMapping("/employee/save")
    public String getForm(@ModelAttribute User user, Model model, Employee employee) {
        model.addAttribute("employee", employee);
        model.addAttribute("position", positionService.findAllPosition());
        model.addAttribute("division", divisionService.findAllDivision());
        model.addAttribute("education", educationDegreeService.findAllEducationDegree());
        model.addAttribute("user", userService.findAllUser());
        return "/employee/save";
    }

    @PostMapping("/employee/save")
    public String create(@Validated @ModelAttribute(name = "employee") Employee employee, BindingResult bindingResult, Model model,User user) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("employee", employee);
            model.addAttribute("position", positionService.findAllPosition());
            model.addAttribute("division", divisionService.findAllDivision());
            model.addAttribute("education", educationDegreeService.findAllEducationDegree());
            model.addAttribute("user", userService.findAllUser());
            return "/employee/save";
        } else {
            userService.save((employee.getUser()));
            employeeService.save(employee);
            return "redirect:/employee";
        }
    }

    @GetMapping("/employee/edit")
    public String sh(@RequestParam Integer id, Model model) {
        model.addAttribute("editEmployee", employeeService.findById(id));
        model.addAttribute("position", positionService.findAllPosition());
        model.addAttribute("division", divisionService.findAllDivision());
        model.addAttribute("education", educationDegreeService.findAllEducationDegree());
        model.addAttribute("user", userService.findAllUser());
        return "/employee/edit";
    }

    @PostMapping("employee/edit")
    public String edit(@ModelAttribute Employee employee) {
        employeeService.save(employee);
        return "redirect:/employee";
    }

    @GetMapping("employee/delete")
    public String delete(@RequestParam Integer id) {
        employeeService.remove(id);
        return "redirect:/employee";
    }

    @GetMapping("employee/view")
    public String showView(@RequestParam Integer id, Model model) {
        model.addAttribute("view", employeeService.findById(id));
        return "employee/view";
    }

    @GetMapping("employee/search")
    public String search(@RequestParam String keyword, Pageable pageable, Model model) {
        if (keyword.equals("")) {
            model.addAttribute("listEmployee", employeeService.findAll(pageable));
            return "redirect:/employee";
        } else {
            model.addAttribute("listEmployee", employeeService.findByEmployeeNameContaining(keyword, pageable));
            return "list_employee";
        }
    }
}