package com.example.casestudy.model;

import javax.persistence.*;

@Entity
public class ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer contract_detail_id;

    @ManyToOne
    @JoinColumn(name="contract_id",nullable = false)
    private Contract contract;

    @ManyToOne
    @JoinColumn(name="attach_service_id" , nullable = false)
    private AttachService attachService;

    @JoinColumn(name="attach_service_id")
    private  Integer quantity;

    public Integer getContract_detail_id() {
        return contract_detail_id;
    }

    public void setContract_detail_id(Integer contract_detail_id) {
        this.contract_detail_id = contract_detail_id;
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
