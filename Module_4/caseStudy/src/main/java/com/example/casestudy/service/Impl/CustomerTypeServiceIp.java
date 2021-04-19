package com.example.casestudy.service.Impl;

import com.example.casestudy.model.CustomerType;
import com.example.casestudy.repository.CustomerTypeRepository;
import com.example.casestudy.service.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class CustomerTypeServiceIp implements CustomerTypeService {
    @Autowired
    CustomerTypeRepository customerTypeRepository;

    @Override
    public List<CustomerType> findAll() {
        return customerTypeRepository.findAll();
    }
}
