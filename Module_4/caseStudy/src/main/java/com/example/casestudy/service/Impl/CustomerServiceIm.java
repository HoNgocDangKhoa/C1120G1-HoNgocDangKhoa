package com.example.casestudy.service.Impl;

import com.example.casestudy.model.Customer;
import com.example.casestudy.repository.CustomerRepository;
import com.example.casestudy.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

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
    public void remove(Integer id) {
        customerRepository.deleteById(id);

    }

    @Override
    public Customer findById(Integer id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public Page<Customer> findAllByCus_name(String keyword, Pageable pageable) {
        return customerRepository.findAllByCus_name(keyword,pageable);
    }
}
