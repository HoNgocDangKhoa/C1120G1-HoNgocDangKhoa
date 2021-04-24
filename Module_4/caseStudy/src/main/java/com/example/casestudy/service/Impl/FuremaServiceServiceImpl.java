package com.example.casestudy.service.Impl;

import com.example.casestudy.model.FuramaService;
import com.example.casestudy.repository.FuramaServiceRepository;
import com.example.casestudy.service.FuramaServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuremaServiceServiceImpl implements FuramaServiceService {
    @Autowired
    FuramaServiceRepository furamaServiceRepository;

    @Override
    public Page<FuramaService> findAll(Pageable pageable) {
        return furamaServiceRepository.findAll(pageable);
    }

    @Override
    public void save(FuramaService furamaService) {
        furamaServiceRepository.save(furamaService);
    }

    @Override
    public List<FuramaService> findAllService() {
        return furamaServiceRepository.findAll();
    }
}
