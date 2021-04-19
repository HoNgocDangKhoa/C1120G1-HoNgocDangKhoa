package com.example.casestudy.service;

import com.example.casestudy.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import javax.persistence.criteria.CriteriaBuilder;

public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);

    void save(Customer customer);

    void remove(Integer id);

    Customer findById(Integer id);

    Page<Customer> findAllByCus_name(String keyword,Pageable pageable);

}
