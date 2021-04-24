package com.example.casestudy.service.Impl;

import com.example.casestudy.model.EducationDegree;
import com.example.casestudy.repository.EducationDegreeRepository;
import com.example.casestudy.service.EducationDegreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EducationDegreeServiceImpl implements EducationDegreeService {
    @Autowired
    EducationDegreeRepository educationDegreeRepository;
    @Override
    public List<EducationDegree> findAllEducationDegree() {
        return educationDegreeRepository.findAll();
    }
}
