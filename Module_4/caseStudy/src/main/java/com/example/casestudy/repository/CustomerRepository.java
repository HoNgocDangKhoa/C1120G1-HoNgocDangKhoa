package com.example.casestudy.repository;

import com.example.casestudy.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepository extends JpaRepository<Customer,String> {
    Page<Customer> findAll(Pageable pageable);
//    @Query("select b from Customer b where concat(b.customerName,b.customerPhone) like %?1%")
    Page<Customer> findCustomerByCustomerNameContaining(String keyword,Pageable pageable);
}
