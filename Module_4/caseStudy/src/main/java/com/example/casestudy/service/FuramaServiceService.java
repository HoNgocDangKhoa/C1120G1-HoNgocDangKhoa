package com.example.casestudy.service;

import com.example.casestudy.model.Employee;
import com.example.casestudy.model.FuramaService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface FuramaServiceService {
    Page<FuramaService> findAll(Pageable pageable);

    void save (FuramaService furamaService);

    List<FuramaService> findAllService();
}
