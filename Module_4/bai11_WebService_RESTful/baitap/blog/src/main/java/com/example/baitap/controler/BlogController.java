package com.example.baitap.controler;


import com.example.baitap.entity.Blog;
import com.example.baitap.entity.Category;
import com.example.baitap.service.BlogService;
import com.example.baitap.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;


@RestController
public class BlogController {
    @Autowired
    BlogService blogService;
    @Autowired
    CategoryService categoryService;


    @GetMapping("/blog")
    public ResponseEntity<List<Blog>> findAllBlog() {
        List<Blog> blogList = blogService.findAll();
        if (blogList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(blogList, HttpStatus.OK);
        }
    }

    @GetMapping("/category/{id}")
    public ResponseEntity<List<Blog>> getListBlogByCategoryId(@PathVariable("id") Long id) {
        List<Blog> listBlog = this.blogService.findAllByCategoryId(id);
        if (listBlog.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(listBlog, HttpStatus.OK);
    }

    @GetMapping("/blog/{id}")
    public ResponseEntity<Blog> viewBlogId(@PathVariable("id") Long id) {
        Blog blog = this.blogService.findById(id);
        if (blog == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(blog, HttpStatus.OK);
    }


}

