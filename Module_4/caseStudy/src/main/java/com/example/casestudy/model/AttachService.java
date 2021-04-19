package com.example.casestudy.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class AttachService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer attach_service_id;

    @Column(name = "attach_service_name", columnDefinition = "VARCHAR(45) NOT NULL")
    private String attach_service_name;

    @Column(name = "attach_service_cost")
    private double attach_service_cost;

    @Column(name = "attach_service_unit")
    private Integer attach_service_unit;

    @Column(name = "attach_service_status", columnDefinition = "VARCHAR(45) NOT NULL")
    private String attach_service_status;

    @OneToMany(mappedBy = "attachService")
    private Set<ContractDetail> contractDetailSet;

    public Integer getAttach_service_id() {
        return attach_service_id;
    }

    public void setAttach_service_id(Integer attach_service_id) {
        this.attach_service_id = attach_service_id;
    }

    public String getAttach_service_name() {
        return attach_service_name;
    }

    public void setAttach_service_name(String attach_service_name) {
        this.attach_service_name = attach_service_name;
    }

    public double getAttach_service_cost() {
        return attach_service_cost;
    }

    public void setAttach_service_cost(double attach_service_cost) {
        this.attach_service_cost = attach_service_cost;
    }

    public Integer getAttach_service_unit() {
        return attach_service_unit;
    }

    public void setAttach_service_unit(Integer attach_service_unit) {
        this.attach_service_unit = attach_service_unit;
    }

    public String getAttach_service_status() {
        return attach_service_status;
    }

    public void setAttach_service_status(String attach_service_status) {
        this.attach_service_status = attach_service_status;
    }

    public Set<ContractDetail> getContractDetailSet() {
        return contractDetailSet;
    }

    public void setContractDetailSet(Set<ContractDetail> contractDetailSet) {
        this.contractDetailSet = contractDetailSet;
    }

    public AttachService() {
    }
}
