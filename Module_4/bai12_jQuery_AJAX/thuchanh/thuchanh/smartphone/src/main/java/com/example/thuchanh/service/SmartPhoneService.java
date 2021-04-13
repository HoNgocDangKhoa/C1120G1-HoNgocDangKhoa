package com.example.thuchanh.service;

import com.example.thuchanh.model.SmartPhone;

import java.util.List;

public interface SmartPhoneService {
    List<SmartPhone> findAll();
    void save(SmartPhone smartPhone);
    SmartPhone findById(Integer id);
    void delete(Integer id);
}
