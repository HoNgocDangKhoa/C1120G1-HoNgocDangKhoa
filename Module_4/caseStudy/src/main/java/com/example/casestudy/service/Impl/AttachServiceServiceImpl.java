package com.example.casestudy.service.Impl;

import com.example.casestudy.model.AttachService;
import com.example.casestudy.repository.AttachServiceRepository;
import com.example.casestudy.service.AttachServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttachServiceServiceImpl implements AttachServiceService {
    @Autowired
    AttachServiceRepository attachServiceRepository;
    @Override
    public List<AttachService> findAllAttachService() {
        return attachServiceRepository.findAll();
    }
}
