package com.example.casestudy.repository;

import com.example.casestudy.model.FuramaService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuramaServiceRepository extends JpaRepository<FuramaService, String> {
    Page<FuramaService> findAll(Pageable pageable);
}
