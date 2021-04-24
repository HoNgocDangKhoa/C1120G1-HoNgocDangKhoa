package com.example.casestudy.service;

import com.example.casestudy.model.User;

import java.util.List;

public interface UserService {
    List<User>findAllUser();
    void  save(User user);
}
