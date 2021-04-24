package com.example.casestudy.controller;

import com.example.casestudy.model.Contract;
import com.example.casestudy.model.ContractDetail;
import com.example.casestudy.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContractController {
    @Autowired
    ContractService contractService;
    @Autowired
    CustomerService customerService;
    @Autowired
    EmployeeService employeeService;
    @Autowired
    FuramaServiceService furamaServiceService;
    @Autowired
    AttachServiceService attachServiceService;
    @Autowired
    ContractDetailService contractDetailService;

    @GetMapping("/contract")
    public ModelAndView showFormCustomer(@PageableDefault(value = 2) Pageable pageable) {
        return new ModelAndView("list_contract", "listContract", contractService.findAll(pageable));
    }

    @GetMapping("contract/create")
    public String getFormCreate(Model model, Contract contract) {
        model.addAttribute("contract", contract);
        model.addAttribute("customer", customerService.findAllCustomer());
        model.addAttribute("service", furamaServiceService.findAllService());
        model.addAttribute("employee", employeeService.findAllEmployee());
        return "contract/create";
    }

    @PostMapping("contract/create")
    public String create(@ModelAttribute Contract contract) {
        contractService.save(contract);
        return "redirect:/contract";
    }

    @GetMapping("contractDetail/create")
    public String showFormDetail(@RequestParam Integer id, Model model) {
        model.addAttribute("contractId", id);
        model.addAttribute("contractDetail", new ContractDetail());
        model.addAttribute("attachService", attachServiceService.findAllAttachService());
        return "contract/detail";
    }

    @PostMapping("contractDetail/create")
    public String create(@ModelAttribute(name = "contractDetail") ContractDetail contractDetail, @RequestParam(name = "contractId") Integer id) {
        Contract contract = this.contractService.findById(id);
        contractDetail.setContract(contract);
        contractDetailService.save(contractDetail);
        return "redirect:/contract";
    }

    @GetMapping("contractDetail/view")
    public String showListDetail(@RequestParam Integer id, Model model) {
        Contract contract = this.contractService.findById(id);
        model.addAttribute("contractDetail", contractDetailService.findAllByContract(contract));
        return "listDetail";
    }

}
