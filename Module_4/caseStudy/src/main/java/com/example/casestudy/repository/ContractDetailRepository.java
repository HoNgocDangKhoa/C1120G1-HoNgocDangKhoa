package com.example.casestudy.repository;

import com.example.casestudy.model.Contract;
import com.example.casestudy.model.ContractDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContractDetailRepository extends JpaRepository<ContractDetail,Integer> {
    Page<ContractDetail>findAll(Pageable pageable);
    List<ContractDetail> findAllByContract(Contract contract);

}
