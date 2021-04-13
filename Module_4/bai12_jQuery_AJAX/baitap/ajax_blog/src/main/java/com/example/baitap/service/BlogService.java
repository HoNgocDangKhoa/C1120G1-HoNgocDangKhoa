package com.example.baitap.service;


import com.example.baitap.entity.Blog;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface BlogService {
    Page<Blog> findAll(Pageable pageable);
    List<Blog>findAll();

    void save(Blog blog);

    void remove(Long id);

    Blog findById(Long id);

    List<Blog> findAllByTitleContaining(String search);

    Page<Blog> search(String name, Pageable pageable);


}
