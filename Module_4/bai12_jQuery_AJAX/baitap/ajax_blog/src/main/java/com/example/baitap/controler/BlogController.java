package com.example.baitap.controler;


import com.example.baitap.entity.Blog;
import com.example.baitap.entity.Category;
import com.example.baitap.service.BlogService;
import com.example.baitap.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;


@Controller
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    BlogService blogService;
    @Autowired
    CategoryService categoryService;


    @GetMapping("")
    public ModelAndView showList(@PageableDefault(value = 5) Pageable pageable) {
        return new ModelAndView("blog_list", "listBlog", blogService.findAll(pageable));
    }

    @GetMapping("/create")
    public String getForm(Model model, Pageable pageable) {
        model.addAttribute("add", new Blog());
        model.addAttribute("categories", categoryService.findAll(pageable));
        return "blog/save";
    }

    @PostMapping("/save")
    public String save(Blog blog) {
        blogService.save(blog);
        return "redirect:/blog/";
    }

    @GetMapping("/edit/{id}")
    public String getForm(@PathVariable Long id, Model model, Pageable pageable) {
        model.addAttribute("categories", categoryService.findAll(pageable));
        model.addAttribute("edit", blogService.findById(id));
        return "blog/edit";
    }

    @PostMapping("/edit/")
    public String updateBlog(Blog blog) {
        blogService.save(blog);
        return "redirect:/blog/";
    }
    @GetMapping("/delete/{id}")
    public String showForm(@PathVariable Long id, Model model, Pageable pageable) {
        model.addAttribute("categories", categoryService.findAll(pageable));
        model.addAttribute("delete", blogService.findById(id));
        return "blog/delete";
    }

    @PostMapping("/delete/")
    public String deleteBlog(@RequestParam Long id) {
        blogService.remove(id);
        return "redirect:/blog/";
    }

    @GetMapping("/view")
    public String showViewBlog(Model model, @RequestParam Long id) {
        model.addAttribute("view", blogService.findById(id));
        return "blog/view";
    }


    @GetMapping("/search/{keyword}")
    public String listCustomer(Model model, @PathVariable Optional<String> keyword, Pageable pageable) {
        if (!keyword.isPresent()) {
            model.addAttribute("listBlog", blogService.findAll(pageable));
            return "blog_list";
        } else {
            String keywordOld = keyword.get();
            model.addAttribute("listBlog", blogService.search(keywordOld, pageable));
            return "blog_list";
        }
    }

}



