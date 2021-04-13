package com.example.thuchanh.repository;

import com.example.thuchanh.model.SmartPhone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SmartPhoneRepository extends JpaRepository<SmartPhone,Integer> {
}
