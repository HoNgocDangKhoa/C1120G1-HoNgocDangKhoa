package com.example.casestudy.service.Impl;

import com.example.casestudy.model.Customer;
import com.example.casestudy.repository.CustomerRepository;
import com.example.casestudy.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceIm  implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);

    }

    @Override
    public void remove(String id) {
        customerRepository.deleteById(id);

    }

    @Override
    public Customer findById(String id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public Page<Customer> findCustomerByCustomerNameContaining(String keyword, Pageable pageable) {
        return customerRepository.findCustomerByCustomerNameContaining(keyword,pageable);
    }

    @Override
    public List<Customer> findAllCustomer() {
        return customerRepository.findAll();
    }


}
