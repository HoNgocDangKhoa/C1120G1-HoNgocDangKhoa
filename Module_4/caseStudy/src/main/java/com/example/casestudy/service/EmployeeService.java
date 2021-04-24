package com.example.casestudy.service;

import com.example.casestudy.model.Customer;
import com.example.casestudy.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface EmployeeService {
    Page<Employee> findAll(Pageable pageable);

    void save(Employee employee);

    void remove(Integer id);

    Employee findById(Integer id);

    Page<Employee> findByEmployeeNameContaining( String keyword,Pageable pageable);
    List<Employee> findAllEmployee();
}
