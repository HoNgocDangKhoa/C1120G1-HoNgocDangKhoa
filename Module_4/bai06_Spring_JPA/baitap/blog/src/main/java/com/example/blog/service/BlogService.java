package com.example.blog.service;

import com.example.blog.entity.Blog;

import java.util.List;

public interface BlogService {
    List<Blog> findAllBlog();

    void save(Blog blog);

    void remove(int id);

    Blog findById(int id);

}
