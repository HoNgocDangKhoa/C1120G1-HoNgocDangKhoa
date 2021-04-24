package com.example.casestudy.service.Impl;

import com.example.casestudy.model.Division;
import com.example.casestudy.repository.DivisionRepository;
import com.example.casestudy.service.DivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DivisionServiceImpl implements DivisionService {
    @Autowired
    DivisionRepository divisionRepository;
    @Override
    public List<Division> findAllDivision() {
        return divisionRepository.findAll();
    }
}
