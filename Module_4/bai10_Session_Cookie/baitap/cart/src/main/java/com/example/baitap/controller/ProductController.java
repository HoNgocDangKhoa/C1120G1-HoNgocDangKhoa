package com.example.baitap.controller;

import com.example.baitap.model.Cart;
import com.example.baitap.model.Product;
import com.example.baitap.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes(names="cart")
public class ProductController {
    @ModelAttribute("cart")
    public Cart cart(){
        return new Cart();
    }
    @Autowired
    ProductService productService;
    @GetMapping("/product")
    public ModelAndView showProduct(){
        return  new ModelAndView("list","listProduct",productService.findAllProduct());
    }
    @GetMapping("/view")
    public String showView(@RequestParam Integer id, Model model){
       model.addAttribute("product",productService.findById(id));
       return "view";
    }
    @PostMapping("/save")
    public String save(@RequestParam(name = "id") Integer id, @ModelAttribute("cart") Cart cart,Model model){
        cart.saveCart(productService.findById(id));
        model.addAttribute("listCart",cart.getCart());
        return "cart";
    }

    @GetMapping("/cart")
    public String showCart(Model model,@ModelAttribute("cart")Cart cart){
        model.addAttribute("listCart",cart.getCart());
        return "cart";
    }
    @GetMapping("/delete")
    public String delete(@RequestParam Integer id,@ModelAttribute("cart") Cart cart){
        cart.remove(productService.findById(id));
        return "redirect:/cart";
    }

}
