package com.example.casestudy.service;

import com.example.casestudy.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);

    void save(Customer customer);

    void remove(String id);

    Customer findById(String id);

    Page<Customer> findCustomerByCustomerNameContaining(String keyword,Pageable pageable);

    List<Customer>findAllCustomer();

}
