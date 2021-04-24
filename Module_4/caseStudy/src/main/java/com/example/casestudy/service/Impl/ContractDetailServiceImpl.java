package com.example.casestudy.service.Impl;

import com.example.casestudy.model.Contract;
import com.example.casestudy.model.ContractDetail;
import com.example.casestudy.repository.ContractDetailRepository;
import com.example.casestudy.service.ContractDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractDetailServiceImpl implements ContractDetailService {
    @Autowired
    ContractDetailRepository contractDetailRepository;

    @Override
    public Page<ContractDetail> findAll(Pageable pageable) {
        return contractDetailRepository.findAll(pageable);
    }

    @Override
    public void save(ContractDetail contractDetail) {
        contractDetailRepository.save(contractDetail);
    }

    @Override
    public ContractDetail findById(Integer id) {
        return contractDetailRepository.findById(id).orElse(null);
    }

    @Override
    public List<ContractDetail> findAllByContract(Contract contract) {
        return contractDetailRepository.findAllByContract(contract);
    }
}
