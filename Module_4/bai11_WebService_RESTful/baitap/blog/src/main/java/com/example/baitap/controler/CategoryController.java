package com.example.baitap.controler;

import com.example.baitap.entity.Category;
import com.example.baitap.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;


@RestController
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @GetMapping("/category")
    public ResponseEntity<List<Category>> showList() {
        List<Category> categoryList = categoryService.findAll();
        if (categoryList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(categoryList, HttpStatus.OK);
        }


    }
}
