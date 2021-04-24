package com.example.casestudy.model;

import javax.persistence.*;

@Entity
public class ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer contractDetailId;

    @ManyToOne
    @JoinColumn(name="contract_id",nullable = false)
    private Contract contract;

    @ManyToOne
    @JoinColumn(name="attach_service_id" , nullable = false)
    private AttachService attachService;

    private  Integer quantity;

    public Integer getContractDetailId() {
        return contractDetailId;
    }

    public void setContractDetailId(Integer contractDetailId) {
        this.contractDetailId = contractDetailId;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public AttachService getAttachService() {
        return attachService;
    }

    public void setAttachService(AttachService attachService) {
        this.attachService = attachService;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public ContractDetail() {
    }
}
