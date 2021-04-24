package com.example.casestudy.service;

import com.example.casestudy.model.Contract;
import com.example.casestudy.model.ContractDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ContractDetailService {
    Page<ContractDetail> findAll(Pageable pageable);

    void save(ContractDetail contractDetail);

    ContractDetail findById(Integer id);

    List<ContractDetail> findAllByContract(Contract contract);
}
