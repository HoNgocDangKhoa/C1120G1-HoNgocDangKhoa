package com.example.casestudy.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contract_id")
    private Integer contractId;

    @Column(name = "contract_start_date" , columnDefinition = "DATE NOT NULL")
    private String contractStartDate;

    @Column(name = "contract_end_date" , columnDefinition = "DATE")
    private String contractEndDate;

    @Column(name = "contract_deposit")
    private double contractDeposit;

    @Column(name = "contract_total_money")
    private double contractTotalMoney;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @ManyToOne
    @JoinColumn(name="service_id",nullable = false)
    private FuramaService furamaService;

    @ManyToOne
    @JoinColumn(name="employee_id" , nullable = false)
    private Employee employee;

    @OneToMany(mappedBy = "contract")
    private Set<ContractDetail> contractDetailSet;

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    public String getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(String contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    public String getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(String contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    public double getContractDeposit() {
        return contractDeposit;
    }

    public void setContractDeposit(double contractDeposit) {
        this.contractDeposit = contractDeposit;
    }

    public double getContractTotalMoney() {
        return contractTotalMoney;
    }

    public void setContractTotalMoney(double contractTotalMoney) {
        this.contractTotalMoney = contractTotalMoney;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public FuramaService getFuramaService() {
        return furamaService;
    }

    public void setFuramaService(FuramaService furamaService) {
        this.furamaService = furamaService;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Set<ContractDetail> getContractDetailSet() {
        return contractDetailSet;
    }

    public void setContractDetailSet(Set<ContractDetail> contractDetailSet) {
        this.contractDetailSet = contractDetailSet;
    }

    public Contract() {
    }
}
