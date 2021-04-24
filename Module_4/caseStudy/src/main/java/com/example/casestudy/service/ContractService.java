package com.example.casestudy.service;

import com.example.casestudy.model.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ContractService {
    Page<Contract> findAll(Pageable pageable);

    void save (Contract contract);

    void remove(Integer id);

    Contract findById(Integer id);

}
