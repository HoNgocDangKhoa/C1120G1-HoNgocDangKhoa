package com.example.casestudy.service.Impl;

import com.example.casestudy.model.Employee;
import com.example.casestudy.repository.EmployeeRepository;
import com.example.casestudy.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Page<Employee> findAll(Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void remove(Integer id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public Employee findById(Integer id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public Page<Employee> findByEmployeeNameContaining(String keyword, Pageable pageable) {
        return employeeRepository.findByEmployeeNameContaining(keyword,pageable);
    }

    @Override
    public List<Employee> findAllEmployee() {
        return employeeRepository.findAll();
    }
}
