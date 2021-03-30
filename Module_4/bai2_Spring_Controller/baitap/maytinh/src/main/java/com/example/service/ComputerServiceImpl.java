package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class ComputerServiceImpl implements ComputerService {

    @Override
    public int addition(int first, int second) {
        return first+second;
    }

    @Override
    public int subtraction(int first, int second) {
        return first-second;
    }

    @Override
    public int multiplication(int first, int second) {
        return first*second;
    }

    @Override
    public int division(int first, int second) {
        return first/second;
    }
}
