package com.example.baitap.service;

import com.example.baitap.entity.Customer;


import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    void saveCustomer(Customer customer);
    Customer findById(int id);
    void removeCustomer(int id);

}
