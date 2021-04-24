package com.example.casestudy.service.Impl;

import com.example.casestudy.model.Position;
import com.example.casestudy.repository.PositionRepository;
import com.example.casestudy.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PositionServiceImpl implements PositionService {
    @Autowired
    PositionRepository positionRepository;
    @Override
    public List<Position> findAllPosition() {
        return positionRepository.findAll();
    }
}
