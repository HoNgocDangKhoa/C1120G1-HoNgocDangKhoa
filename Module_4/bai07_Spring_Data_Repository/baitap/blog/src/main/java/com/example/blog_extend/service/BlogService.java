package com.example.blog_extend.service;


import com.example.blog_extend.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface BlogService {
    Page<Blog> findAll(Pageable pageable);

    void save(Blog blog);

    void remove(Long id);

    Blog findById(Long id);

}
