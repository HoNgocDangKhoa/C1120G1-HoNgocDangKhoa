package com.example.thuchanh.service;

import com.example.thuchanh.model.SmartPhone;
import com.example.thuchanh.repository.SmartPhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SmartPhoneServiceImpl implements SmartPhoneService {
    @Autowired
    SmartPhoneRepository smartPhoneRepository;

    @Override
    public List<SmartPhone> findAll() {
        return smartPhoneRepository.findAll();
    }

    @Override
    public void save(SmartPhone smartPhone) {
        smartPhoneRepository.save(smartPhone);
    }

    @Override
    public SmartPhone findById(Integer id) {
        return smartPhoneRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) {
        smartPhoneRepository.deleteById(id);

    }


}
