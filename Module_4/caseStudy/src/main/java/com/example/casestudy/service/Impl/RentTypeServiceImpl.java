package com.example.casestudy.service.Impl;

import com.example.casestudy.model.RentType;
import com.example.casestudy.repository.RentTypeRepository;
import com.example.casestudy.service.RentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentTypeServiceImpl implements RentTypeService {
    @Autowired
    RentTypeRepository rentTypeRepository;
    @Override
    public List<RentType> findAllRentType() {
        return rentTypeRepository.findAll();
    }
}
